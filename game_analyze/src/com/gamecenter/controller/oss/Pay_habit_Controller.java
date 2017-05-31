package com.gamecenter.controller.oss;

import com.alibaba.fastjson.JSON;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.report.Payhabit;
import com.gamecenter.parBean.report.Paytop;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.ossServices.ReportService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 收入分析 -- 排行 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/pay/habit")
public class Pay_habit_Controller {
	
	@Resource
	ReportService reportService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 付费习惯
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView payhabit() {
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/pay/payhabit");
		modelAndView.addObject("targetTime", targetTime);
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	@RequestMapping("/payhabitList")
	public ModelAndView payhabitList(@RequestParam(value = "appid") String appid, @RequestParam(value = "worldid") String worldid, @RequestParam(value = "begintime") String begintime, @RequestParam(value = "endtime") String endtime) {
		
		if (worldid.equals("0")) { // 获取区服id串
			List<OpGameworld> opGameworlds = worldService.getWorldListByAppId(appid);
			worldid = "";
			for (OpGameworld opGameworld : opGameworlds) {
				worldid += opGameworld.getWorldid() + "','";
			}
			worldid = worldid.substring(0, worldid.length() - 3);
		}
		
		begintime = begintime + " 00:00:00";
		endtime = endtime + " 23:59:59";
		List<Payhabit> payhabits = reportService.getPayhabitList(worldid, begintime, endtime);
		
		for (Payhabit obj : payhabits) {
			try {
				obj.setWorldid(worldService.getWorldByWorldId(obj.getWorldid()).getWname());
			} catch (Exception e) {
			}
			
			List pietotal = new ArrayList();
			List pieusernum = new ArrayList();
			List piepaycount = new ArrayList();
			String groupDatas[] = obj.getInfo().split("#");
			
			for (String temp : groupDatas) {
				String dd[] = temp.split(",");
				Payhabit payhabit = new Payhabit();
				payhabit.setPaytotal(Double.parseDouble(dd[1]));
				payhabit.setUsernum(Integer.parseInt(dd[2]));
				payhabit.setPaycount(Integer.parseInt(dd[3]));
				payhabit.setArpu(Double.parseDouble(dd[4]));
				obj.getDetail().put(dd[0], payhabit);
				
				pietotal.add(new Object[] { dd[0], Double.parseDouble(dd[1]) });
				pieusernum.add(new Object[] { dd[0], Double.parseDouble(dd[2]) });
				piepaycount.add(new Object[] { dd[0], Double.parseDouble(dd[3]) });
			}
			
			
			
			obj.setPietotal(JSON.toJSONString(pietotal).replace("s1", "1-100").replace("s2", "100-500").replace("s3", "500-1000").replace("s4", "1000-2000").replace("s5", "2000-5000").replace("s6", "5000-10000").replace("s7", "10000以上"));
			obj.setPieusernum(JSON.toJSONString(pieusernum).toString().replace("s1", "1-100").replace("s2", "100-500").replace("s3", "500-1000").replace("s4", "1000-2000").replace("s5", "2000-5000").replace("s6", "5000-10000").replace("s7", "10000以上"));
			obj.setPiepaycount(JSON.toJSONString(piepaycount).toString().replace("s1", "1-100").replace("s2", "100-500").replace("s3", "500-1000").replace("s4", "1000-2000").replace("s5", "2000-5000").replace("s6", "5000-10000").replace("s7", "10000以上"));
			
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/pay/payhabit_list");
		modelAndView.addObject("lists", payhabits);
		return modelAndView;
	}
	
}
