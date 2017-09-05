package com.gamecenter.controller.gmt;

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
import com.gamecenter.parBean.vo.GmtForbidBean;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.GmtForbidService;

/**
 * GMT封禁系统 -- 封号 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/forbid/passport")
public class Forbid_passport_Controller {
	
	@Resource
	GmtForbidService gmtForbidService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 封号
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView passport() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/forbid/forbidPassport");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	/**
	 * 执行封禁操作
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/execute", method = RequestMethod.POST)
	@ResponseBody
	public Object execute(GmtForbidBean gmtForbidBean, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String res = "-99";
		
		String username = (String) session.getAttribute("username");
		if (username == null) {
			username = "admin";
		}
		
		if (gmtForbidBean != null && !gmtForbidBean.getAct().equals("")) {
			gmtForbidBean.setUser(username);
			res = gmtForbidService.executeForbid(gmtForbidBean);
		}
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
	}
	
}
