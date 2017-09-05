package com.gamecenter.controller.oss;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssOnlineDayreport;
import com.gamecenter.parBean.report.LineObj;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.WorldOnlineService;
import com.gamecenter.service.ossServices.ReportService;

/**
 * 在线分析 -- 历史 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/online/history")
public class Online_history_Controller {
	
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	WorldOnlineService worldOnlineService;
	@Resource
	ReportService reportService;
	
	/**
	 * 每日在线 -- 历史查询
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView daypage() {
		
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/online/useronline");
		modelAndView.addObject("targetTime", targetTime);
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime") String begintime, @RequestParam(value = "endtime") String endtime) {
		List<OpOssOnlineDayreport> opOssOnlineDayreports = reportService.getUserOnlineList(worldid, begintime, endtime);
		OpGameworld opGameworld = null;
		for (OpOssOnlineDayreport opOssOnlineDayreport : opOssOnlineDayreports) {
			if (worldid.equals("0")) {
				opOssOnlineDayreport.setWorldid("全服");
			} else {
				opGameworld = worldService.getWorldByWorldId(opOssOnlineDayreport.getWorldid());
				opOssOnlineDayreport.setWorldid(opGameworld.getWname());
			}
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/online/useronline_list");
		modelAndView.addObject("lists", opOssOnlineDayreports);
		return modelAndView;
	}
	
	@RequestMapping("/getOnlineByhour")
	@ResponseBody
	public Object getOnlineByhour(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "time") String time) {
		List<OpOssOnlineDayreport> opOssOnlineDayreports = reportService.getUserOnlineByHourList(worldid, time);
		
		String wname = "";
		if (worldid.equals("0")) {
			wname = "全服";
		} else {
			OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
			wname = opGameworld.getWname();
		}
		
		LineObj lineObj = new LineObj();
		lineObj.setName(wname);
		
		// 定位24小时数据值
		for (int i = 0; i < 24; i++) {
			OpOssOnlineDayreport onlinedata = null;
			for (OpOssOnlineDayreport obj : opOssOnlineDayreports) {
				if (Integer.parseInt(obj.getCtime().substring(11, 13)) == i) {
					onlinedata = obj;
					break;
				}
			}
			if (onlinedata != null) {
				lineObj.getData().add(onlinedata.getMaxval());
			} else { // 构造空节点
				lineObj.getData().add(null);
			}
		}
		
		Map map = new HashMap();
		map.put("hourdata", lineObj);
		map.put("title", wname);
		return map;
	}
	
}
