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
import com.gamecenter.model.OpOssPayDayreport;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ReportService;

/**
 * 收入分析 -- 报表 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/pay/dayreport")
public class Pay_dayreport_Controller {
	
	@Resource
	ReportService reportService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 收入分析 -- 日报
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView dayreport() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -2).substring(0, 10);
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/pay/payreport");
		modelAndView.addObject("targetTime", targetTime);
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/reportList")
	public ModelAndView reportList(@RequestParam(value = "begintime") String begintime, @RequestParam(value = "endtime") String endtime, @RequestParam(value = "worldid") String worldid) {
		List<OpOssPayDayreport> opOssPayDayreports = reportService.getPayDayReport(begintime, endtime, worldid);
		
		int apa = 0, newapa = 0, paycount = 0;
		double maxpay = 0;
		double totalpay = 0;
		for (OpOssPayDayreport obj : opOssPayDayreports) {
			if (obj.getTotal() == null)
				obj.setTotal(0.0);
			if (obj.getApa() == null)
				obj.setApa(0);
			if (obj.getNewapa() == null)
				obj.setNewapa(0);
			if (obj.getPaycount() == null)
				obj.setPaycount(0);
			if (obj.getMaxpay() == null)
				obj.setMaxpay(0.0);
			try {
				obj.setAppid(appService.getByAppId(obj.getAppid()).getAppname());
				obj.setWorldid(worldService.getWorldByWorldId(obj.getWorldid()).getWname());
			} catch (Exception e) {
			}
			totalpay += obj.getTotal();
			if (obj.getMaxpay() > maxpay) {
				maxpay = obj.getMaxpay();
			}
			apa += obj.getApa();
			newapa += obj.getNewapa();
			paycount += obj.getPaycount();
			
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/pay/payreport_list");
		modelAndView.addObject("lists", opOssPayDayreports);
		modelAndView.addObject("apa", apa);
		modelAndView.addObject("newapa", newapa);
		modelAndView.addObject("paycount", paycount);
		modelAndView.addObject("maxpay", maxpay);
		modelAndView.addObject("totalpay", totalpay);
		
		return modelAndView;
	}
}
