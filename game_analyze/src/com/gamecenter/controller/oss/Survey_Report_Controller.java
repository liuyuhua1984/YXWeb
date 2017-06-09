package com.gamecenter.controller.oss;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.parBean.report.DayReport;
import com.gamecenter.service.ossServices.ReportService;

/**
 * 游戏概况 -- 日报 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/survey/report")
public class Survey_Report_Controller {
	
	@Resource
	ReportService reportService;
	
	@RequestMapping("")
	public ModelAndView reportpage() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/oss/dayreport");
		modelAndView.addObject("targetTime", targetTime);
		return modelAndView;
	}
	
	@RequestMapping("/reportList")
	public ModelAndView reportList(@RequestParam(value = "time") String time) {
		List<DayReport> dayReports = reportService.selectDayReport(time);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/dayreport_list");
		modelAndView.addObject("dayReports", dayReports);
		return modelAndView;
	}
	
}
