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
 * 内充 -- 记录列表 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/money/getmoney")
public class Money_getmoney_Controller {
	
	@Resource
	GmtMoneyService gmtMoneyService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 内充金币获取日志
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView getmoneypage() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/sendmoney/getmoney");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/getmoneyList")
	public ModelAndView getmoneyList(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime", defaultValue = "2000-00-00") String begintime, @RequestParam(value = "endtime", defaultValue = "3000-00-00") String endtime) {
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		if (opGameworld == null)
			return null;
		
		OpGmtSendmoneyPay obj = new OpGmtSendmoneyPay();
		obj.setWorldid(opGameworld.getWorldid());
		obj.setAddtime(begintime + " 00:00:00" + "#" + endtime + " 23:59:59");
		
		Page p = gmtMoneyService.getMoneyList(obj, 15, page);
		PageTool pt = new PageTool();
		String pageStr = pt.getPageStringForjs("", p);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/sendmoney/getmoney_List");
		modelAndView.addObject("lists", (List<OpGmtSendmoneyPay>) p.getResult());
		modelAndView.addObject("pageTools", pageStr);
		modelAndView.addObject("count", p.getTotalSize());
		
		return modelAndView;
	}
	
	@RequestMapping("/getpaycount")
	@ResponseBody
	public Object getpaycount(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime", defaultValue = "2000-00-00") String begintime, @RequestParam(value = "endtime", defaultValue = "3000-00-00") String endtime) {
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		if (opGameworld == null)
			return null;
		
		OpGmtSendmoneyPay obj = new OpGmtSendmoneyPay();
		obj.setWorldid(opGameworld.getWorldid());
		obj.setAddtime(begintime + " 00:00:00" + "#" + endtime + " 23:59:59");
		
		double count = gmtMoneyService.getPayCount(obj);
		return count;
	}
}
