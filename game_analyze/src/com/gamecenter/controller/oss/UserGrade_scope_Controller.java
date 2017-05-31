package com.gamecenter.controller.oss;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssOnlineDayreport;
import com.gamecenter.model.OpOssUserRemain;
import com.gamecenter.parBean.report.LineObj;
import com.gamecenter.parBean.report.UserGrade;
import com.gamecenter.parBean.report.UserGradeDetail;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataUploadServices.WorldOnlineService;
import com.gamecenter.service.ossServices.ReportService;
import com.gamecenter.service.ossServices.UserRemainService;
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
 * 用户等级 -- 分布范围 Created with IntelliJ IDEA. User: gsb Date: 14-5-24 Time: 下午5:00 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/grade/scope")
public class UserGrade_scope_Controller {
	
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	WorldOnlineService worldOnlineService;
	@Resource
	ReportService reportService;
	
	/**
	 * 等级分布
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView fenbupage() {
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/gradeFenbu");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/fenbulist")
	public ModelAndView fenbulist(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid) {
		OpGameworld opGameworld = worldService.getWorldByWorldId(worldid);
		String wname = opGameworld.getWname();
		
		List<UserGrade> userGrades = reportService.getUserGrade(worldid);
		int zong = 0;
		for (UserGrade userGrade : userGrades) {
			zong += userGrade.getNum();
		}
		for (UserGrade userGrade : userGrades) {
			userGrade.setWorldid(wname);
			userGrade.setPer(Tools.round((double) (userGrade.getNum() * 100) / zong, 2));
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/gradeFenbu_list");
		modelAndView.addObject("lists", userGrades);
		return modelAndView;
	}
	
	// 等级范围 饼图
	@RequestMapping("/gradescope")
	@ResponseBody
	public Object gradescope(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid) {
		List<UserGrade> userGrades = reportService.usergradescope(worldid);
		
		List<Object> objs = new ArrayList<Object>();
		
		int i = 0;
		for (UserGrade userGrade : userGrades) {
			if (i == 0) {
				objs.add(new Object[] { userGrade.getGrade(), userGrade.getNum() });
			} else {
				objs.add(new Object[] { userGrade.getGrade(), userGrade.getNum() });
			}
			i++;
		}
		Map map = new HashMap();
		map.put("datascope", objs);
		map.put("title", "");
		return map;
	}
	
	// 等级列表 柱状图
	@RequestMapping("/gradeList")
	@ResponseBody
	public Object gradeList(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid) {
		List<String> grades = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();
		
		List<UserGrade> userGrades = reportService.getUserGrade(worldid);
		for (UserGrade userGrade : userGrades) {
			grades.add(userGrade.getGrade());
			data.add(userGrade.getNum());
		}
		Map map = new HashMap();
		map.put("grades", grades);
		map.put("data", data);
		return map;
	}
}
