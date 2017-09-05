package com.gamecenter.controller.gmt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtSendmoneyLog;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.GmtMoneyService;

/**
 * GMT 资金操作 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/money/sendLog")
public class Money_sendLog_Controller {
	
	@Resource
	GmtMoneyService gmtMoneyService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 发放日志列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView sendLogList() {
		List<OpGmtSendmoneyLog> opGmtSendmoneyLogs = gmtMoneyService.getSendLogList();
		
		for (OpGmtSendmoneyLog obj : opGmtSendmoneyLogs) {
			try {
				OpGameapp opGameapp = appService.getByAppId(obj.getAppid());
				obj.setAppname(opGameapp.getAppname());
				OpGameworld opGameworld = worldService.getWorldByWid(Integer.parseInt(obj.getWorldid()));
				obj.setWorldname(opGameworld.getWname());
			} catch (Exception e) {
			}
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/sendmoney/moneySendLogList");
		modelAndView.addObject("lists", opGmtSendmoneyLogs);
		return modelAndView;
	}
}
