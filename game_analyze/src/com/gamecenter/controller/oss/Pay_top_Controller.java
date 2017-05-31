package com.gamecenter.controller.oss;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.report.Paytop;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ReportService;

/**
 * 收入分析 -- 排行 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/pay/top")
public class Pay_top_Controller {
	
	@Resource
	ReportService reportService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 收入分析 -- 排行100
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView paytop() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -2).substring(0, 10);
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/pay/paytop");
		modelAndView.addObject("targetTime", targetTime);
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/paytopList")
	public ModelAndView paytopList(@RequestParam(value = "worldid") String worldid) {
		List<Paytop> paytops = reportService.getPayTop(worldid);
		for (Paytop obj : paytops) {
			try {
				obj.setWorldid(worldService.getWorldByWorldId(obj.getWorldid()).getWname());
			} catch (Exception e) {
			}
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/pay/paytop_list");
		modelAndView.addObject("lists", paytops);
		return modelAndView;
	}
	
}
