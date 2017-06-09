package com.gamecenter.controller.gmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.GmtPassportService;

/**
 * 账号白名单 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/passport/allow")
public class Passport_allow_Controller {
	
	@Resource
	GmtPassportService gmtPassportService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 账号白名单页面
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView allowpage() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/gmTools/passportAllow");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Object allowSave(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String res = "-99";
		String type = request.getParameter("type");
		String passport = request.getParameter("passports");
		String wid = request.getParameter("wid");
		String appid = request.getParameter("appid");
		
		String passports[] = passport.split("\\n");
		List<String> pList = new ArrayList<String>();
		for (String pas : passports) {
			pList.add(pas);
		}
		res = gmtPassportService.allowPassport(Integer.parseInt(type), pList, wid) + "";
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
	}
	
}
