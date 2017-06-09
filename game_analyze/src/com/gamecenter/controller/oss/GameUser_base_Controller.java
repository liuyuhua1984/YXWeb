package com.gamecenter.controller.oss;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.DataUpHandleService;

/**
 * 运行分析 -- 游戏玩家 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/oss/gameuser/base")
public class GameUser_base_Controller {
	
	@Resource
	DataUpHandleService dataUpHandleService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	@RequestMapping("")
	public ModelAndView page() {
		// 获取区服信息
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/oss/passport/base/passportPage");
		modelAndView.addObject("appList", appList);
		modelAndView.addObject("worldList", worldList);
		return modelAndView;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param page
	 * @param appid
	 * @param wid
	 * @return
	 */
	@RequestMapping("/dataList")
	public ModelAndView dataList(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "appid") String appid, @RequestParam(value = "wid", defaultValue = "0") String wid, @RequestParam(value = "openid") String openid, @RequestParam(value = "rolename", required = false) String rolename, @RequestParam(value = "sort", required = false) String sort) {
		if (wid == null || wid.length() <= 0)
			wid = "0";
		OpGameworld opGameworld = worldService.getWorldByWid(Integer.parseInt(wid));
		if (opGameworld == null)
			return null;
		
		OpOssQlzPassport obj = new OpOssQlzPassport();
		obj.setWorldid(opGameworld.getWorldid());
		obj.setOpenid(openid);
		obj.setRolename(rolename);
		obj.setInfo(sort);
		
		Page p = dataUpHandleService.getPassportList(obj, 15, page);
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", p);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/base/passportPage_List");
		modelAndView.addObject("lists", (List<OpOssQlzPassport>) p.getResult());
		modelAndView.addObject("pageTools", pageStr);
		
		for (OpOssQlzPassport opOssQlzPassport : (List<OpOssQlzPassport>) p.getResult()) {
			opOssQlzPassport.setWorldid(worldService.getWorldByWorldId(opOssQlzPassport.getWorldid()).getWname());
			opOssQlzPassport.setTotalmoney(Tools.round(opOssQlzPassport.getTotalmoney() / 10, 2));
		}
		modelAndView.addObject("count", p.getTotalSize());
		return modelAndView;
	}
	
	/**
	 * 账号详细信息
	 * 
	 * @param openid
	 * @return
	 */
	@RequestMapping("/datamsg")
	public ModelAndView datamsg(@RequestParam(value = "openid", defaultValue = "0") String openid) {
		OpOssQlzPassport obj = dataUpHandleService.getPassportByOpenid(openid);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/oss/passport/base/passportPage_data");
		modelAndView.addObject("obj", obj);
		return modelAndView;
	}
	
}
