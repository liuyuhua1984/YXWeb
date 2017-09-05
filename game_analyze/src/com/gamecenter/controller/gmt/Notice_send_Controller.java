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
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.parBean.vo.GmtSendNoticeBean;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.GmtNoticeService;

/**
 * 公告 -- 发送公告 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/notice/send")
public class Notice_send_Controller {
	
	@Resource
	GmtNoticeService gmtNoticeService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 公告发送页面
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
		modelAndView.setViewName("/page/gmTools/sendNotice");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	/**
	 * 发送公告
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Object sendNotic(GmtSendNoticeBean gmtSendNoticeBean, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String res = "-99";
		
		UserMsg user = (UserMsg) session.getAttribute("UserMsg");
		if (user == null) {
			res = "你需要登陆";
		} else {
			if (gmtSendNoticeBean != null) {
				gmtSendNoticeBean.setUser(user.getName());
				
				if (gmtSendNoticeBean.getType().equals("2")) {
					res = gmtNoticeService.sendCycleNotic(gmtSendNoticeBean) + "";
				} else {
					res = gmtNoticeService.sendNotic(gmtSendNoticeBean,true);
				}
				
			} else {
				res = "参数异常";
			}
		}
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
	}
	
}
