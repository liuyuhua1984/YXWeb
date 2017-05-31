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
 * GMT 资金操作 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/money/applyList")
public class Money_applyList_Controller {
	
	@Resource
	GmtMoneyService gmtMoneyService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 申请列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView applyList() {
		List<OpGmtSendmoney> opGmtSendmoneys = gmtMoneyService.getApplyList();
		for (OpGmtSendmoney obj : opGmtSendmoneys) {
			try {
				OpGameapp opGameapp = appService.getByAppId(obj.getAppid());
				obj.setAppname(opGameapp.getAppname());
				OpGameworld opGameworld = worldService.getWorldByWid(Integer.parseInt(obj.getWorldid()));
				obj.setWorldname(opGameworld.getWname());
			} catch (Exception e) {
			}
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/sendmoney/moneyApplyList");
		modelAndView.addObject("lists", opGmtSendmoneys);
		return modelAndView;
	}
	
	/**
	 * 金币发放页面
	 * 
	 * @return
	 */
	@RequestMapping("/sendpage")
	public ModelAndView sendpage(@RequestParam(value = "applyid") String applyid, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/sendmoney/sendMoney");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		modelAndView.addObject("applyid", applyid);
		return modelAndView;
	}
	
	/**
	 * 发放处理
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/sendSave", method = RequestMethod.POST)
	@ResponseBody
	public Object sendSave(GmtSendMoneyBean gmtSendMoneyBean, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String res = "";
		
		if (gmtSendMoneyBean != null && Double.parseDouble(gmtSendMoneyBean.getMoney()) > 0) {
			gmtSendMoneyBean.setUser(((UserMsg) session.getAttribute("UserMsg")).getName());
			res = gmtMoneyService.sendMoney(gmtSendMoneyBean);
		} else {
			res = "参数异常";
		}
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
	}
	
}
