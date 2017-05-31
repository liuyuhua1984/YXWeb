package com.gamecenter.controller.gmt;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtForbidmsg;
import com.gamecenter.parBean.vo.GmtForbidBean;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmtServices.GmtForbidService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GMT封禁系统 -- 记录列表 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/forbid/msglist")
public class Forbid_msgList_Controller {
	
	@Resource
	GmtForbidService gmtForbidService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 封禁历史信息
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView msglist() {
		
		// 获取列表信息
		List<OpGmtForbidmsg> msgList = gmtForbidService.getGmtForbidmsgList();
		
		for (OpGmtForbidmsg obj : msgList) {
			if (obj.getOpttype() == 5050) {
				obj.setOptname("禁言");
			} else if (obj.getOpttype() == 5051) {
				obj.setOptname("禁言解禁");
			} else if (obj.getOpttype() == 5052) {
				obj.setOptname("IP禁言");
			} else if (obj.getOpttype() == 5053) {
				obj.setOptname("IP禁言解禁");
			} else if (obj.getOpttype() == 5060) {
				obj.setOptname("封号");
			} else if (obj.getOpttype() == 5061) {
				obj.setOptname("解封");
			} else if (obj.getOpttype() == 5070) {
				obj.setOptname("踢人");
			}
			obj.setAppname("热血七龙珠");
			obj.setWorldname("测试服");
			obj.setMsg(obj.getIp() + ";" + obj.getForbidtime() + ";" + obj.getMsg());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/forbid/ForbidMsgList");
		modelAndView.addObject("msgList", msgList);
		return modelAndView;
	}
	
}
