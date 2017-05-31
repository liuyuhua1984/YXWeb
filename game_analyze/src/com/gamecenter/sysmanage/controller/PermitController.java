package com.gamecenter.sysmanage.controller;

import com.gamecenter.parBean.UserMsg;
import com.gamecenter.sysmanage.model.OaModule;
import com.gamecenter.sysmanage.model.OaRole;
import com.gamecenter.sysmanage.parBean.PermitSet;
import com.gamecenter.sysmanage.service.ModuleService;
import com.gamecenter.sysmanage.service.PermitService;
import com.gamecenter.sysmanage.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 权限管理 Created with IntelliJ IDEA. User: gsb Date: 14-6-18 Time: 下午10:48 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/sys/permit")
public class PermitController {
	
	@Resource
	PermitService permitService;
	@Resource
	ModuleService moduleService;
	
	/**
	 * 权限列表
	 * 
	 * @return
	 */
	@RequestMapping("/permitList")
	public ModelAndView permitList(@RequestParam(value = "type", required = false, defaultValue = "0") String type, @RequestParam(value = "sourceid", required = false, defaultValue = "0") String sourceid) {
		List<OaModule> oaModules = moduleService.getModuleDetailList();
		// 获取权限源名称
		String sourcename = permitService.getPrivilegeSourceName(Integer.parseInt(type), Integer.parseInt(sourceid));
		// 获取现有权限列表
		List<Integer> permitIds = permitService.getPermits(Integer.parseInt(type), Integer.parseInt(sourceid));
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/module/module_actionList");
		modelAndView.addObject("oaModules", oaModules);
		modelAndView.addObject("type", type);
		modelAndView.addObject("sourceid", sourceid);
		modelAndView.addObject("sourcename", sourcename);
		
		modelAndView.addObject("permitIds", permitIds);
		return modelAndView;
	}
	
	/**
	 * 权限保存
	 * 
	 * @param permitSet
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Object savedata(PermitSet permitSet, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int num = permitService.savePermitSet(permitSet);
		return num;
	}
	
	/**
	 * 权限系统设置页面
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/permitSetting")
	public ModelAndView permitSetting(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/setting");
		return modelAndView;
	}
	
	/**
	 * 缓存模块数据
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/cacheModule")
	@ResponseBody
	public Object cacheModule(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		boolean status = moduleService.cacheData();
		return status;
	}
	
	/**
	 * 顶部菜单列表
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/topMenu")
	public ModelAndView topMenu(HttpSession session) {
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		List<OaModule> oaModules = permitService.getModuleListByUser(userMsg.getUid(), 1);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/topMenuList");
		modelAndView.addObject("oaModules", oaModules);
		return modelAndView;
	}
	
}
