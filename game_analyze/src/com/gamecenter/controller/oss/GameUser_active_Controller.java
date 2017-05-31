package com.gamecenter.controller.oss;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssUserDayreport;
import com.gamecenter.parBean.report.NewUserMonitor;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * 游戏玩家 -- 活跃 Created with IntelliJ IDEA. User: gsb Date: 14-5-24 Time: 下午5:00 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/gameuser/active")
public class GameUser_active_Controller {
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	ReportService reportService;
	
	@RequestMapping("")
	public ModelAndView page() {
		
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/userAu");
		modelAndView.addObject("targetTime", targetTime);
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime") String begintime, @RequestParam(value = "endtime") String endtime) {
		
		if (worldid.equals("0")) { // 获取区服id串
			List<OpGameworld> opGameworlds = worldService.getWorldListByAppId(appid);
			worldid = "";
			for (OpGameworld opGameworld : opGameworlds) {
				worldid += opGameworld.getWorldid() + ",";
			}
			worldid = worldid.substring(0, worldid.length() - 1);
		}
		
		List<OpOssUserDayreport> opOssUserDayreports = reportService.getDauList(worldid, begintime, endtime);
		OpGameworld opGameworld = null;
		for (OpOssUserDayreport opOssUserDayreport : opOssUserDayreports) {
			opGameworld = worldService.getWorldByWorldId(opOssUserDayreport.getWorldid());
			opOssUserDayreport.setWorldid(opGameworld.getWname());
			opOssUserDayreport.setOpentime(opGameworld.getOpentime());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/userAu_list");
		modelAndView.addObject("lists", opOssUserDayreports);
		return modelAndView;
	}
}
