package com.gamecenter.sysmanage.controller;

import com.gamecenter.parBean.UserMsg;
import com.gamecenter.sysmanage.model.OaModule;
import com.gamecenter.sysmanage.parBean.PermitSet;
import com.gamecenter.sysmanage.service.ModuleService;
import com.gamecenter.sysmanage.service.PermitService;
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
 * 系统设置 Created with IntelliJ IDEA. User: gsb Date: 14-6-18 Time: 下午10:48 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/sys/set")
public class SysSetController {
	
	@Resource
	PermitService permitService;
	@Resource
	ModuleService moduleService;
	
	/**
	 * 权限系统设置页面
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("")
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
	
}
