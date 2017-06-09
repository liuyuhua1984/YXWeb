package com.gamecenter.controller.sysmanage;

import java.util.ArrayList;
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

import com.gamecenter.model.OaAction;
import com.gamecenter.model.OaModule;
import com.gamecenter.service.sysmanage.ModuleService;
import com.gamecenter.sysmanage.parBean.TreeObj;

/**
 * 模块管理 Created with IntelliJ IDEA. User: gsb Date: 14-6-18 Time: 下午10:48 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/sys/module")
public class ModuleController {
	
	@Resource
	ModuleService moduleService;
	
	/**
	 * 模块列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView modulepage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/module/moduleManage");
		return modelAndView;
	}
	
	/**
	 * 模块功能明细列表
	 * 
	 * @return
	 */
	@RequestMapping("/detaillist")
	public ModelAndView detaillist() {
		List<OaModule> oaModules = moduleService.getModuleDetailList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/module/module_actionList");
		modelAndView.addObject("oaModules", oaModules);
		return modelAndView;
	}
	
	/**
	 * 获取模块列表树
	 */
	@RequestMapping("/getmoduletree")
	@ResponseBody
	public Object getmoduletree(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		List<TreeObj> treeObjs = new ArrayList<TreeObj>();
		TreeObj treeObj = new TreeObj();
		treeObj.setId(0);
		treeObj.setpId(-100);
		treeObj.setName("系统");
		treeObj.setOpen("true");
		treeObj.setIsParent("true");
		treeObjs.add(treeObj);
		
		List<OaModule> oaModules = moduleService.getModuleList();
		for (OaModule oaModule : oaModules) {
			treeObj = new TreeObj();
			treeObj.setId(oaModule.getMid());
			treeObj.setpId(oaModule.getPid());
			treeObj.setName(oaModule.getModulename());
			// if (oaModule.getLevel() == 1) {
			// treeObj.setOpen("true");
			// } else {
			// treeObj.setOpen("false");
			// }
			treeObj.setOpen("true");
			
			if (oaModule.getType().equals("1")) {
				treeObj.setIsParent("true");
			} else {
				treeObj.setIsParent("false");
			}
			treeObjs.add(treeObj);
		}
		return treeObjs;
	}
	
	/**
	 * 模块保存
	 */
	@RequestMapping("/savemodule")
	@ResponseBody
	public Object savemodule(OaModule oaModule, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int num = 0;
		if (oaModule.getMid() != null) {
			num = moduleService.updateModule(oaModule);
		} else {
			num = moduleService.addModule(oaModule);
		}
		return num;
	}
	
	/**
	 * 获取节点
	 */
	@RequestMapping("/getmoduleById")
	@ResponseBody
	public Object getmoduleById(@RequestParam(value = "mid") int mid, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		OaModule oaModule = moduleService.getModule(mid);
		return oaModule;
	}
	
	/* 删除 */
	@RequestMapping("/delmodule")
	@ResponseBody
	public Object delmodule(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String mid = request.getParameter("mid");
		int num = moduleService.delModuleAndChild(Integer.parseInt(mid));
		
		return num;
	}
	
	/* 获取模块的功能列表 */
	@RequestMapping("/actionList")
	public ModelAndView actionList(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String mid = request.getParameter("mid");
		List<OaAction> oaActions = moduleService.getActionList(Integer.parseInt(mid));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/module/actionList");
		modelAndView.addObject("actions", oaActions);
		return modelAndView;
	}
	
	/* 新增功能页面 */
	@RequestMapping("/addaction")
	public ModelAndView addaction(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String mid = request.getParameter("mid");
		String aid = request.getParameter("aid");
		
		OaAction oaAction = new OaAction();
		if (aid != null) {
			oaAction = moduleService.getAction(Integer.parseInt(aid));
		} else {
			oaAction.setMid(Integer.parseInt(mid));
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/syspage/module/addaction");
		modelAndView.addObject("oaAction", oaAction);
		return modelAndView;
	}
	
	/* 保存模块功能 */
	@RequestMapping("/saveaction")
	@ResponseBody
	public Object addaction(OaAction oaAction, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int num = 0;
		if (oaAction.getAid() != null) {
			num = moduleService.updateAction(oaAction);
		} else {
			num = moduleService.addAction(oaAction, oaAction.getMid());
		}
		return num;
	}
	
	/* 删除功能点 */
	@RequestMapping("/delaction")
	@ResponseBody
	public Object delaction(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String aids = request.getParameter("aids");
		int num = moduleService.delAction(aids);
		return num;
	}
	
}
