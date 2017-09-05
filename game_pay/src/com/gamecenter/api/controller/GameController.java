package com.gamecenter.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.CharUtil;
import com.gamecenter.common.MD5;
import com.gamecenter.qqsdk.service.RunLog;

/**
 * 进入游戏 
 */
@Controller
public class GameController {
	
	@RequestMapping(value = "/game/into", method = RequestMethod.POST)
	public ModelAndView game(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String openid = request.getParameter("passport");
		String worldid = request.getParameter("worldid").trim();
		String fcm = request.getParameter("fcm");
		
		ModelAndView modelAndView = new ModelAndView();
		if (openid != null && openid.trim().length() > 0 && !CharUtil.isChinese(openid)) {
			String time = System.currentTimeMillis() / 1000 + "";
			modelAndView.setViewName("main");
			modelAndView.addObject("openid", openid);
			modelAndView.addObject("worldid", worldid);
			modelAndView.addObject("time", time);
			modelAndView.addObject("fcm", fcm);
			modelAndView.addObject("flag", "1"); // 扩展
			modelAndView.addObject("rechargeUrl", BaseApiController.rechargeUrl);
			modelAndView.addObject("sig", MD5.encodeMD5(openid + worldid + time + fcm + BaseApiController.insidekey));
			
			RunLog.logDao.info("[内部]进入游戏请求>>(openid:" + openid + "),(worldid:" + worldid + "),(sig:" + MD5.encodeMD5(openid + worldid + time + fcm + BaseApiController.insidekey) + ")");
			
		} else {
			modelAndView.setViewName("redirect:/");
			modelAndView.addObject("msg", "账号异常,请重新登陆！");
		}
		return modelAndView;
	}
	
}
