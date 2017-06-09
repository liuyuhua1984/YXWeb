package com.gamecenter.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试页面入口 Created with IntelliJ IDEA. User: gsb Date: 14-6-26 Time: 下午2:15 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/test")
public class TestPageController {
	
	@RequestMapping("/dialog")
	public ModelAndView dialog() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/test/dialog");
		return modelAndView;
	}
	
	@RequestMapping("/msg")
	@ResponseBody
	public Object msg() {
		Map ss = new HashMap();
		ss.put("name", "男孩");
		ss.put("sex", "1");
		ss.put("old", "22");
		return ss;
	}
}
