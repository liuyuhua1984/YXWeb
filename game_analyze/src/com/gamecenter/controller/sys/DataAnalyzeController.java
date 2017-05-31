package com.gamecenter.controller.sys;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.service.task.DataAnalyze;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据分析 -- 配置 Created with IntelliJ IDEA. User: gsb Date: 14-5-28 Time: 下午1:44 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/sys/analyzeset")
public class DataAnalyzeController {
	
	@Resource
	DataAnalyze dataAnalyze;
	
	@RequestMapping("")
	public ModelAndView index() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/sys/DataAnalyzeSet");
		modelAndView.addObject("targetTime", targetTime);
		return modelAndView;
	}
	
	@RequestMapping("/page")
	public ModelAndView setpage() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/sys/DataAnalyzeSet");
		modelAndView.addObject("targetTime", targetTime);
		return modelAndView;
	}
	
	/**
	 * 重新分析控制
	 * 
	 * @param type
	 * @param time
	 * @return
	 */
	@RequestMapping("/reanalyze")
	@ResponseBody
	public Object analyze(@RequestParam(value = "type") String type, @RequestParam(value = "time") String time) {
		String res = "";
		if (type.equals("1")) {
			res = dataAnalyze.onlineNum(time, 1);
		} else if (type.equals("2")) {
			res = dataAnalyze.user(time, 1);
		} else if (type.equals("3")) {
			res = dataAnalyze.pay(time, 1);
		} else if (type.equals("4")) {
			res = dataAnalyze.consume(time, 1);
		} else if (type.equals("5")) {
			res = dataAnalyze.userRemain(time, 1);
		}
		
		Map map = new HashMap();
		map.put("res", res);
		return map;
	}
	
}
