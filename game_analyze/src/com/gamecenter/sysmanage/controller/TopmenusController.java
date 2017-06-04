package com.gamecenter.sysmanage.controller;

import com.gamecenter.parBean.UserMsg;
import com.gamecenter.sysmanage.model.OaModule;
import com.gamecenter.sysmanage.parBean.ModuleSort;
import com.gamecenter.sysmanage.service.PermitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 13-5-9 Time: 上午9:54 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/topmenus")
public class TopmenusController {
	
	@Resource
	PermitService permitService;
	
	/**
	 * 动态菜单处理
	 * 
	 * @param mid
	 * @return
	 */
	@RequestMapping(value = "/{mid}")
	public ModelAndView menus(@PathVariable int mid, HttpSession session) {
		// 获取用户权限菜单
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		List<OaModule> oaModules = permitService.getModuleListByUserByPid(userMsg.getUid(), mid);
		
		// 处理二级模块的嵌套处理
		List<OaModule> oaModule2222 = new ArrayList<OaModule>();
		OaModule tempObj = null;
		String firstUrl = ""; // 第一个菜单链接
		for (OaModule oaModule : oaModules) {
			if (oaModule.getModuleurl() == null || oaModule.getModuleurl().equals(""))
				oaModule.setModuleurl("xx");
			if (oaModule.getLevel() == 3 && tempObj != null) {
				tempObj.getChildList().add(oaModule);
			} else {
				tempObj = oaModule;
				oaModule2222.add(tempObj);
			}
		}
		
		// 排序二级菜单列表
		Collections.sort(oaModule2222, new ModuleSort());
		try {
			firstUrl = oaModule2222.get(0).getChildList().get(0).getModuleurl();
		} catch (Exception e) {
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/leftmenus/menu");
		modelAndView.addObject("list", oaModule2222);
		modelAndView.addObject("firstUrl", firstUrl);
		return modelAndView;
	}
	
	@RequestMapping("/menu1")
	public ModelAndView menu1(HttpSession session) {
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		
		ModelAndView modelAndView = new ModelAndView();
		if (userMsg != null && userMsg.getPassport().equals("admin")) {
			modelAndView.setViewName("/page/leftmenus/menu1");
		} else {
			modelAndView.setViewName("/page/leftmenus/menu");
		}
		return modelAndView;
	}
	
	@RequestMapping("/menu2")
	public ModelAndView menu2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/leftmenus/menu2");
		return modelAndView;
	}
	
	@RequestMapping("/menu3")
	public ModelAndView menu3() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/leftmenus/menu3");
		return modelAndView;
	}
	
	/**
	 * 支撑管理菜单
	 * 
	 * @return
	 */
	@RequestMapping("/menu4")
	public ModelAndView menu4() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/leftmenus/menu4");
		return modelAndView;
	}
	
	@RequestMapping("/menu5")
	public ModelAndView menu5() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/leftmenus/menu5");
		return modelAndView;
	}
}
