package com.gamecenter.controller.oss;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.report.UserGrade;
import com.gamecenter.parBean.report.UserGradeDetail;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataUploadServices.WorldOnlineService;
import com.gamecenter.service.ossServices.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户等级 -- 明细 Created with IntelliJ IDEA. User: gsb Date: 14-5-24 Time: 下午5:00 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/grade/detail")
public class UserGrade_detail_Controller {
	
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	WorldOnlineService worldOnlineService;
	@Resource
	ReportService reportService;
	
	/**
	 * 等级分布 -- 详细
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView detailpage() {
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/gradeDetail");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/detaillist")
	public ModelAndView detaillist(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid) {
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		String wname = opGameworld.getWname();
		
		List<UserGradeDetail> userGrades = reportService.getUserGradeDetails(worldid);
		int zong = 0;
		for (UserGradeDetail userGrade : userGrades) {
			zong += userGrade.getNum();
		}
		for (UserGradeDetail userGrade : userGrades) {
			userGrade.setWorldid(wname);
			userGrade.setPer(Tools.round((double) (userGrade.getNum() * 100) / zong, 2));
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/gradeDetail_list");
		modelAndView.addObject("lists", userGrades);
		return modelAndView;
	}
	
}
