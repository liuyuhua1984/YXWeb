package com.gamecenter.controller.gmt;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool;
import com.gamecenter.common.Tools;
import com.gamecenter.model.*;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.parBean.vo.GmtSendMoneyBean;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmtServices.GmtMoneyService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 内充 -- 申请 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/money/apply")
public class Money_apply_Controller {
	
	@Resource
	GmtMoneyService gmtMoneyService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 发送申请页面
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView applypage() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/sendmoney/sendMoneyApply");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	/**
	 * 发放申请保存
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/applySave", method = RequestMethod.POST)
	@ResponseBody
	public Object applySave(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		
		String content = request.getParameter("content");
		String msg = request.getParameter("msg");
		String appid = request.getParameter("appid");
		String wid = request.getParameter("wid");
		
		OpGmtSendmoney opGmtSendmoney = new OpGmtSendmoney();
		opGmtSendmoney.setAddtime(Tools.getNowDate());
		opGmtSendmoney.setAppid(appid);
		opGmtSendmoney.setContent(content);
		opGmtSendmoney.setWorldid(wid);
		opGmtSendmoney.setUsername(((UserMsg) session.getAttribute("UserMsg")).getName());
		
		res = gmtMoneyService.insertApply(opGmtSendmoney);
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
	}
	
}
