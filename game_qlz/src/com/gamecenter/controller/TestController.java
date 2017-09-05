package com.gamecenter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-14 Time: 下午2:11 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/")
public class TestController {
	
	@RequestMapping(value = "")
	public ModelAndView index(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String msg = request.getParameter("msg");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("msg", msg);
		return modelAndView;
	}
	
	@RequestMapping(value = "error")
	public ModelAndView error(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String act = request.getParameter("act");
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("msg");
		modelAndView.addObject("msg", act);
		return modelAndView;
	}
	
}
