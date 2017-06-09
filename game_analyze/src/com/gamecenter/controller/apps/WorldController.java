package com.gamecenter.controller.apps;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.DataUpHandleService;
import com.gamecenter.service.task.jmsHandler.UpStatusNode;

/**
 * 应用管理 -- 区服管理 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/apps/world")
public class WorldController {
	
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	DataUpHandleService dataUpHandleService;
	
	/**
	 * 区服列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView applist() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/apps/worldList");
		return modelAndView;
	}
	
	@RequestMapping("/dataList")
	public ModelAndView dataList(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String appid = request.getParameter("appid");
		String optid = request.getParameter("optid");
		
		List<OpGameworld> lists = worldService.getWorldList();
		
		for (OpGameworld opGameworld : lists) {
			if (UpStatusNode.upNodes.get(opGameworld.getWorldid()) != null) {
				opGameworld.setUpstatus("1");
			} else {
				opGameworld.setUpstatus("0");
			}
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/apps/world_data_list");
		modelAndView.addObject("lists", lists);
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public ModelAndView gameAppAdd() {
		// 获取应用列表
		List<OpGameapp> appList = appService.getAppList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/apps/worldAdd");
		modelAndView.addObject("appList", appList);
		return modelAndView;
	}
	
	@RequestMapping("/update")
	public ModelAndView gameUpdateAdd(@RequestParam(value = "wid") int wid) {
		// 获取应用列表
		List<OpGameapp> appList = appService.getAppList();
		OpGameworld opGameworld = worldService.getWorldByWid(wid);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/apps/worldAdd");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("opGameworld", opGameworld);
		return modelAndView;
	}
	
	/**
	 * 保存区服的数据
	 * 
	 * @param obj
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/savedata")
	@ResponseBody
	public Object worldadd(OpGameworld obj, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = worldService.save(obj);
		return res;
	}
	
	/**
	 * 区服删除
	 * 
	 * @param ids
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public Object worldDel(@RequestParam(value = "ids") String ids, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		try {
			res = worldService.del(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * 区服联动选择
	 * 
	 * @param appid
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/changeWorld")
	@ResponseBody
	public Object changeWorld(@RequestParam(value = "appid") String appid, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		List<OpGameworld> worldList = worldService.getWorldListByAppId(appid);
		return worldList;
	}
	
	/**
	 * 数据上报状态控制
	 * 
	 * @param worldid
	 * @param act
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/upstatus")
	@ResponseBody
	public Object upstatus(@RequestParam(value = "worldid") String worldid, @RequestParam(value = "act") int act, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		try {
			res = dataUpHandleService.upDataStatusCon(worldid, act);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * 服务器邀请开关
	 */
	@RequestMapping("/invite")
	@ResponseBody
	public Object invite(@RequestParam(value = "worldid") String worldid, @RequestParam(value = "act") int act, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		try {
			res = worldService.inviteStatus(worldid, act);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}
