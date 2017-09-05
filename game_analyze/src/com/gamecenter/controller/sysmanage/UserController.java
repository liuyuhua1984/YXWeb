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
import com.gamecenter.model.OaUser;
import com.gamecenter.model.OaUserPermit;
import com.gamecenter.service.sysmanage.RoleService;
import com.gamecenter.service.sysmanage.UserService;

/**
 * 账号管理 Created with IntelliJ IDEA. User: gsb Date: 14-6-19 Time: 上午9:25 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/sys/user")
public class UserController {
	
	@Resource
	UserService userService;
	@Resource
	RoleService roleService;
	
	@RequestMapping("")
	public ModelAndView userpage() {
		List<OaUser> oaUsers = userService.getUserList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/user/userList");
		modelAndView.addObject("list", oaUsers);
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public ModelAndView addpage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/user/user_add");
		return modelAndView;
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value = "uid") int uid) {
		OaUser oaUser = userService.getUser(uid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/user/user_add");
		modelAndView.addObject("oaUser", oaUser);
		return modelAndView;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public Object savedata(OaUser oaUser, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int num = userService.savaUser(oaUser);
		return num;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public Object del(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String uids = request.getParameter("uids");
		int num = userService.delUser(uids);
		return num;
	}
	
	/**
	 * 授权页面
	 * 
	 * @return
	 */
	@RequestMapping("/shouquan")
	public ModelAndView shouquanpage(@RequestParam(value = "uid") int uid) {
		// 获取人员的授权信息
		OaUserPermit oaUserPermit = userService.getUserPermit(uid);
		
		List<OaRole> oaRoles = roleService.getRoleList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/user/user_shouquan");
		modelAndView.addObject("roleList", oaRoles);
		modelAndView.addObject("oaUserPermit", oaUserPermit);
		modelAndView.addObject("uid", uid);
		return modelAndView;
	}
	
	@RequestMapping("/saveshouquan")
	@ResponseBody
	public Object saveshouquan(OaUserPermit oaUserPermit, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int num = userService.shouquan(oaUserPermit);
		return num;
	}
	
}
