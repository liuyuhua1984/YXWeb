package com.gamecenter.controller.apps;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.parBean.vo.GmtForbidBean;
import com.gamecenter.service.appServices.AppService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 应用管理 -- 游戏应用 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/apps/game")
public class GameAppController {
	
	@Resource
	AppService appService;
	
	@RequestMapping("")
	public ModelAndView applist() {
		List<OpGameapp> lists = appService.getAppList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/gameAppList");
		modelAndView.addObject("lists", lists);
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/gameAppAdd");
		modelAndView.addObject("flag", "add");
		return modelAndView;
	}
	
	@RequestMapping("/edit")
	public ModelAndView update(@RequestParam(value = "id") String appid) {
		OpGameapp opGameapp = appService.getByAppId(appid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/gameAppAdd");
		modelAndView.addObject("opGameapp", opGameapp);
		modelAndView.addObject("flag", "edit");
		return modelAndView;
	}
	
	@RequestMapping("/savedata")
	@ResponseBody
	public Object gameAppAdd(OpGameapp obj, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = 0;
		if (obj.getFlag().equals("edit")) {
			res = appService.update(obj);
		} else {
			res = appService.add(obj);
		}
		return res;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public Object gameAppDel(@RequestParam(value = "ids") String ids, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		try {
			res = appService.del(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	@RequestMapping("/getJsonList")
	@ResponseBody
	public Object getJsonList(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		List<OpGameapp> opGameapps = appService.getAppList();
		return opGameapps;
	}
	
}
