package com.gamecenter.controller.oss;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.report.DayCurSurvey;
import com.gamecenter.parBean.report.LineObj;
import com.gamecenter.parBean.vo.OnlineDataByHour;
import com.gamecenter.parBean.vo.WorldOnlineData;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.WorldOnlineService;
import com.gamecenter.service.ossServices.ReportService;
import com.gamecenter.service.task.WorldOnlineNum;

/**
 * 在线分析 -- 实时 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/online/now")
public class Online_now_Controller {
	
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	WorldOnlineService worldOnlineService;
	@Resource
	ReportService reportService;
	
	/**
	 * 实时在线页面
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView chartPage() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/oss/chart");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	/**
	 * 获取实时在线人数
	 * 
	 * @param wid
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/online", method = RequestMethod.POST)
	@ResponseBody
	public Object online(@RequestParam(value = "wid") String wid, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String worldid = worldService.getWorldByWid(Integer.parseInt(wid)).getWorldid();
		WorldOnlineData obj = WorldOnlineNum.onlineMap.get(worldid);
		
		// 实时概况
		if (obj != null) {
			DayCurSurvey dayCurSurvey = reportService.selectCurSurvey(Tools.getNowDate("yyyy-MM-dd"), worldid);
			obj.chuangjue = dayCurSurvey.getChuangjue();
			obj.dau = dayCurSurvey.getDau();
		}
		return obj;
	}
	
	/**
	 * 今日PCU 曲线
	 * 
	 * @param wid
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/onlineDayByHour", method = RequestMethod.POST)
	@ResponseBody
	public Object onlineDayByHour(@RequestParam(value = "wid", defaultValue = "0") String wid, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		if (wid.equals("")) {
			wid = "0";
		}
		String worldid = worldService.getWorldByWid(Integer.parseInt(wid)).getWorldid();
		// 获取数据
		List<OnlineDataByHour> lists = worldOnlineService.onlineDayByHour(Tools.getNowDate("yyyy-MM-dd"), worldid);
		
		LineObj lineObj = new LineObj();
		lineObj.setName("今日PCU");
		
		for (int i = 0; i < 24; i++) {
			OnlineDataByHour onlinedata = null;
			for (OnlineDataByHour obj : lists) {
				if (Integer.parseInt(obj.getTimex()) == i) {
					onlinedata = obj;
					break;
				}
			}
			if (onlinedata != null) {
				lineObj.getData().add(onlinedata.getNums());
			} else { // 构造空节点
				lineObj.getData().add(null);
			}
		}
		Map map = new HashMap();
		map.put("hourdata", lineObj);
		map.put("title", "今日PCU");
		return map;
	}
	
}
