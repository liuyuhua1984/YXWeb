package com.gamecenter.controller.gmt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.GmtForbidService;

/**
 * GMT封禁系统 -- 账号禁言 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/forbid/wordsforpassport")
public class Forbid_wordsforPassport_Controller {
	
	@Resource
	GmtForbidService gmtForbidService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 禁言
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView words() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/forbid/forbidWords");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
}
