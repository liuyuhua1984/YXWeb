package com.gamecenter.controller.sysmanage;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.model.OaRole;
import com.gamecenter.service.sysmanage.RoleService;

/**
 * 模块管理 Created with IntelliJ IDEA. User: gsb Date: 14-6-18 Time: 下午10:48 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/sys/role")
public class RoleController {
	
	@Resource
	RoleService roleService;
	
	@RequestMapping("")
	public ModelAndView rolepage() {
		List<OaRole> oaRoles = roleService.getRoleList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/role/roleList");
		modelAndView.addObject("list", oaRoles);
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public ModelAndView addpage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/role/role_add");
		return modelAndView;
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value = "rid") int rid) {
		OaRole oaRole = roleService.getRoleById(rid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/role/role_add");
		modelAndView.addObject("oaRole", oaRole);
		return modelAndView;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public Object savedata(OaRole oaRole, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int num = roleService.saveRole(oaRole);
		return num;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public Object del(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String rids = request.getParameter("ids");
		int num = roleService.delRole(rids);
		return num;
	}
	
}
