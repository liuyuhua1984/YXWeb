package com.gamecenter.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.model.LoginLog;
import com.gamecenter.service.DataService;

/**
 * 上报节点状态 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 上午11:50 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	@Resource
	DataService dataService;
	
	@RequestMapping("")
	public ModelAndView msg(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		List<LoginLog> loginLogs = dataService.loginList("2014");
		return modelAndView;
	}
	
}
