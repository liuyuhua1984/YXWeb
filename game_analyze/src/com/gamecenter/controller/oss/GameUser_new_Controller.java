package com.gamecenter.controller.oss;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssUserDayreport;
import com.gamecenter.model.OpOssUserRemain;
import com.gamecenter.parBean.report.NewUserMonitor;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ReportService;
import com.gamecenter.service.ossServices.UserRemainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * 游戏玩家 -- 新增 Created with IntelliJ IDEA. User: gsb Date: 14-5-24 Time: 下午5:00 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/gameuser/new")
public class GameUser_new_Controller {
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	ReportService reportService;
	
	@RequestMapping("")
	public ModelAndView newusermonitor() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, 0).substring(0, 10);
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/newUserMonitor");
		modelAndView.addObject("targetTime", targetTime);
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/newuserList")
	public ModelAndView newuserList(@RequestParam(value = "time") String time, @RequestParam(value = "worldid") String worldid) {
		List<NewUserMonitor> newUserMonitors = reportService.selectNewUsers(time, worldid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/newUserMonitor_list");
		modelAndView.addObject("newUserMonitors", newUserMonitors);
		return modelAndView;
	}
	
}
