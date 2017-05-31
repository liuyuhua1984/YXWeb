package com.gamecenter.controller.oss;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool;
import com.gamecenter.model.*;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
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
 * 活动 -- 卡密 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/activity/card")
public class Activity_card_Controller {
	
	@Resource
	ActivityService activityService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 卡密列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView cdkpage() {
		List<OpActivity> opActivities = activityService.getActivityList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/activity/cdkpage");
		modelAndView.addObject("opActivities", opActivities);
		return modelAndView;
	}
	
	/**
	 * 卡密列表数据
	 * 
	 * @param page
	 * @param aid
	 * @param cdkcode
	 * @return
	 */
	@RequestMapping("/dataList")
	public ModelAndView dataList(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "aid") String aid, @RequestParam(value = "cdkcode") String cdkcode) {
		OpActivityCdk obj = new OpActivityCdk();
		obj.setAid(Integer.parseInt(aid));
		obj.setCdkcode(cdkcode);
		
		Page p = activityService.cdkList(obj, 15, page);
		PageTool pt = new PageTool();
		String pageStr = pt.getPageStringForjs("", p);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/activity/cdkpage_List");
		modelAndView.addObject("lists", (List<OpActivityCdk>) p.getResult());
		modelAndView.addObject("pageTools", pageStr);
		
		modelAndView.addObject("count", p.getTotalSize());
		return modelAndView;
	}
	
	@RequestMapping("/addcdkpage")
	public ModelAndView addcdkpage() {
		List<OpActivity> opActivities = activityService.getActivityList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/activity/cdkAdd");
		modelAndView.addObject("opActivities", opActivities);
		return modelAndView;
	}
	
	/**
	 * 卡密生成
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/createCdk")
	@ResponseBody
	public Object createCdk(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String aid = request.getParameter("aid");
		String num = request.getParameter("num");
		String type = request.getParameter("type");
		
		int res = -1;
		if (aid != null && num != null) {
			res = 0;
		}
		if (res == 0) {
			res = activityService.createCdk(Integer.parseInt(aid), Integer.parseInt(num), type);
		}
		return res;
	}
	
}
