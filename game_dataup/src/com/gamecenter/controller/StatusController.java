package com.gamecenter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.service.tasks.UploadDataServer;

/**
 * 上报节点状态 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 上午11:50 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class StatusController {
	
	@RequestMapping("/")
	public ModelAndView msg(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("status", UploadDataServer.isUp);
		modelAndView.addObject("worldid", UploadDataServer.worldid);
		modelAndView.addObject("optime", UploadDataServer.opentime);
		modelAndView.addObject("excutetime", UploadDataServer.excutetime);
		modelAndView.addObject("msg", UploadDataServer.msg);
		modelAndView.addObject("time", Tools.getNowDate());
		return modelAndView;
	}
	
	/**
	 * 上报开关
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/opt")
	public ModelAndView opt(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String act = request.getParameter("act");
		String pwd = request.getParameter("pwd");
		if (pwd.equals("reku")) {
			if (act.equals("1")) {
				UploadDataServer.isUp = true;
			} else {
				UploadDataServer.isUp = false;
			}
		}
		return msg(request, response, session);
	}
}
