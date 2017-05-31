package com.gamecenter.controller.gmt;

import com.gamecenter.common.packets.PassportMsg_response;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.vo.GmtSelectPassportBean;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmtServices.GmtPassportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 账号信息查询 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/passport/select")
public class Passport_select_Controller {
	
	@Resource
	GmtPassportService gmtPassportService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 账号信息查询页面
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView sendpage() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/gmTools/passportMsg");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	/**
	 * 发送查询
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	@ResponseBody
	public Object sendNotic(GmtSelectPassportBean gmtSelectPassportBean, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String res = "-99";
		String username = (String) session.getAttribute("username");
		if (username == null) {
			username = "admin";
		}
		
		PassportMsg_response passportMsg_response = null;
		if (gmtSelectPassportBean != null) {
			gmtSelectPassportBean.setUser(username);
			passportMsg_response = gmtPassportService.selectPassport(gmtSelectPassportBean);
		}
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", passportMsg_response);
		return modelMap;
	}
	
}
