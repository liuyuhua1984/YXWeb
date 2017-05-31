package com.gamecenter.controller.oss;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool;
import com.gamecenter.model.*;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataUploadServices.DataUpHandleService;
import com.gamecenter.service.ossServices.ActivityService;
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
 * 活动 -- 列表 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/activity")
public class Activity_List_Controller {
	
	@Resource
	ActivityService activityService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 活动列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView activitypage() {
		List<OpActivity> opActivities = activityService.getActivityList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/activity/activityList");
		modelAndView.addObject("lists", opActivities);
		return modelAndView;
	}
	
	/**
	 * 活动增加
	 * 
	 * @return
	 */
	@RequestMapping("/activityadd")
	public ModelAndView activityadd(HttpServletRequest request) {
		
		String aid = request.getParameter("aid");
		OpActivity opActivity = null;
		if (aid != null && !"".equals(aid)) {
			opActivity = activityService.getActivity(Integer.parseInt(aid));
		}
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		List<OpGameGoods> opGameGoodses = activityService.getGoodsList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/activity/activityAdd");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		modelAndView.addObject("opActivity", opActivity);
		modelAndView.addObject("opGameGoodses", opGameGoodses);
		return modelAndView;
	}
	
	/**
	 * 活动保存
	 * 
	 * @param opActivity
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/saveActivity")
	@ResponseBody
	public Object saveActivity(OpActivity opActivity, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		
		if (opActivity.getGids() != null && opActivity.getGids().length > 0) {
			// 处理区服信息
			if (opActivity.getWtype().equals("1")) { // 全服
				opActivity.setWorldids("0");
			} else {
				String wids = "";
				for (String wid : opActivity.getWids()) {
					// 获取worldid
					OpGameworld opGameworld = worldService.getWorldByWid(Integer.parseInt(wid));
					wids += opGameworld.getWorldid() + ",";
				}
				wids = wids.substring(0, wids.length() - 1);
				opActivity.setWorldids(wids);
			}
			
			// 处理奖励物品信息
			String goods = "";
			for (String gid : opActivity.getGids()) {
				goods += gid.split("_")[0] + "#" + gid.split("_")[1] + ","; // 格式>>物品的编号#数量
			}
			goods = goods.substring(0, goods.length() - 1);
			opActivity.setAward(goods);
			
			res = 0;
		}
		if (res == 0) {
			res = activityService.addActivity(opActivity);
		}
		return res;
	}
	
}
