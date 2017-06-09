package com.gamecenter.controller.oss;

import java.util.ArrayList;
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
import com.gamecenter.model.OpOssConsumeDayreport;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ReportService;

/**
 * 收入分析 -- 报表 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/consume/report")
public class Consume_report_Controller {
	
	@Resource
	ReportService reportService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 消费汇总 -- 日报
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView dayreport() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/consume/consumedayreport");
		modelAndView.addObject("targetTime", targetTime);
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/reportList")
	public ModelAndView reportList(@RequestParam(value = "begintime") String begintime, @RequestParam(value = "endtime") String endtime, @RequestParam(value = "worldid") String worldid) {
		List<OpOssConsumeDayreport> consumeList = reportService.getConsumeList(worldid, begintime, endtime);
		int usercount = 0;
		double money = 0;
		for (OpOssConsumeDayreport obj : consumeList) {
			obj.setWorldid(worldService.getWorldByWorldId(worldid).getWname());
			obj.setCtime(begintime + " - " + endtime);
			usercount += obj.getUsernum();
			money += obj.getMoney();
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/consume/consumedayreport_list");
		modelAndView.addObject("lists", consumeList);
		modelAndView.addObject("usercount", usercount);
		modelAndView.addObject("money", money);
		return modelAndView;
	}
	
	// 消费列表 柱状图
	@RequestMapping("/consumeList")
	@ResponseBody
	public Object consumeList(@RequestParam(value = "begintime") String begintime, @RequestParam(value = "endtime") String endtime, @RequestParam(value = "worldid") String worldid) {
		List<OpOssConsumeDayreport> consumeList = reportService.getConsumeList(worldid, begintime, endtime);
		
		List<String> types = new ArrayList<String>();
		List<Double> data = new ArrayList<Double>();
		
		for (OpOssConsumeDayreport obj : consumeList) {
			types.add(obj.getItemtype());
			data.add(-obj.getMoney());
		}
		Map map = new HashMap();
		map.put("types", types);
		map.put("data", data);
		return map;
	}
	
}
