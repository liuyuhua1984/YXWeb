package com.gamecenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 13-5-9 Time: 上午9:54 To change this template use File | Settings | File Templates.
 */
@Controller
public class MainController {
	
	public ModelAndView main() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/main");
		return modelAndView;
	}
	
	@RequestMapping("/")
	public ModelAndView main2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/index");
		return modelAndView;
	}
	
	@RequestMapping("/main")
	public ModelAndView getFooter() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/main");
		return modelAndView;
	}
	
	@RequestMapping("/headmsg")
	public ModelAndView headmsg() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/commons/headmsg");
		return modelAndView;
	}
	
	/**
	 * 头部页面
	 * 
	 * @return
	 */
	@RequestMapping("/top")
	public ModelAndView toppage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/top");
		return modelAndView;
	}
}
