package com.gamecenter.controller.oss;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssUserRemain;
import com.gamecenter.parBean.report.NewUserMonitor;
import com.gamecenter.parBean.report.UserGradeLs;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ReportService;
import com.gamecenter.service.ossServices.UserRemainService;
import com.opencsv.CSVWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 游戏玩家 -- 留存 Created with IntelliJ IDEA. User: gsb Date: 14-5-24 Time: 下午5:00 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/gameuser/remain")
public class GameUser_remain_Controller {
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	@Resource
	UserRemainService userRemainService;
	@Resource
	ReportService reportService;
	
	/**
	 * 用户留存分析
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView page() {
		
		String beginTime = Tools.getDate(Tools.getNowDate(), 1, -7).substring(0, 10);
		String endTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/userRemain");
		modelAndView.addObject("beginTime", beginTime);
		modelAndView.addObject("endTime", endTime);
		
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime") String begintime, @RequestParam(value = "endtime") String endtime) {
		
		if (worldid.equals("0")) { // 获取区服id串
			List<OpGameworld> opGameworlds = worldService.getWorldListByAppId(appid);
			worldid = "";
			for (OpGameworld opGameworld : opGameworlds) {
				worldid += opGameworld.getWorldid() + ",";
			}
			worldid = worldid.substring(0, worldid.length() - 1);
		}
		
		List<OpOssUserRemain> opOssUserRemains = userRemainService.getUserRemainList(worldid, begintime, endtime);
		OpGameworld opGameworld = null;
		for (OpOssUserRemain opOssUserRemain : opOssUserRemains) {
			opGameworld = worldService.getWorldByWorldId(opOssUserRemain.getWorldid());
			opOssUserRemain.setWorldid(opGameworld.getWname());
			opOssUserRemain.setOpentime(opGameworld.getOpentime());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/userRemain_list");
		modelAndView.addObject("newUserMonitors", opOssUserRemains);
		return modelAndView;
	}
	
	/**
	 * 等级流失统计列表
	 * 
	 * @return
	 */
	@RequestMapping("/gradeLs")
	@ResponseBody
	public Object gradeLs() {
		
		List<UserGradeLs> userGradeLses = reportService.greadeLsList("3001", "2014-07-09 00:00:00");
		int zong = 0, zsy = 0;
		for (UserGradeLs obj : userGradeLses) {
			zong += obj.getZs();
			zsy += obj.getSy();
		}
		
		for (int i = 0; i < userGradeLses.size(); i++) {
			UserGradeLs obj = userGradeLses.get(i);
			if (i == 0) {
				obj.setLjz(zong);
				obj.setLjsy(zong - obj.getLs());
			} else {
				obj.setLjz(userGradeLses.get(i - 1).getLjsy());
				obj.setLjsy(obj.getLjz() - obj.getLs());
			}
			obj.setLsper(Tools.round((double) obj.getLs() / obj.getLjz(), 4));
		}
		
		try {
			doSample(userGradeLses);
		} catch (Exception e) {
			e.printStackTrace(); // To change body of catch statement use File | Settings | File Templates.
		}
		
		return 1;
	}
	
	public void doSample(List<UserGradeLs> userGradeLses) throws Exception {
		
		List<String[]> allElements = new ArrayList<String[]>();
		
		for (UserGradeLs obj : userGradeLses) {
			allElements.add(new String[] { obj.getGrade() + "", obj.getLjz() + "", obj.getLjsy() + "", obj.getLs() + "", obj.getLsper() * 100 + "%" });
		}
		String filePath = "e:/mysample.csv";
		
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(filePath), Charset.forName("UTF-8"));
		CSVWriter writer = new CSVWriter(out);
		writer.writeAll(allElements);
		writer.close();
		System.out.println("\nComplete.  File written out to " + filePath);
		
	}
}
