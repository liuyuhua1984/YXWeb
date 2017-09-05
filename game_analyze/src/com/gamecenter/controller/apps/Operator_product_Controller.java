package com.gamecenter.controller.apps;

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

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpOperator;
import com.gamecenter.model.OpOperatorProduct;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.OperatorService;
import com.gamecenter.service.appServices.Operator_porduct_Service;

/**
 * 联运商产品信息 Created with IntelliJ IDEA. User: gsb Date: 14-7-28 Time: 下午1:51 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/apps/operator/product")
public class Operator_product_Controller {
	
	@Resource
	Operator_porduct_Service operator_porduct_service;
	@Resource
	OperatorService operatorService;
	@Resource
	AppService appService;
	
	@RequestMapping("")
	public ModelAndView list() {
		List<OpOperatorProduct> lists = operator_porduct_service.getList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/operator_product_List");
		modelAndView.addObject("lists", lists);
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public ModelAndView add() {
		List<OpOperator> opOperators = operatorService.getList();
		List<OpGameapp> opGameapps = appService.getAppList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/operator_product_add");
		modelAndView.addObject("flag", "add");
		modelAndView.addObject("opOperators", opOperators);
		modelAndView.addObject("opGameapps", opGameapps);
		return modelAndView;
	}
	
	@RequestMapping("/edit")
	public ModelAndView update(@RequestParam(value = "id") int id) {
		OpOperatorProduct opOperatorProduct = operator_porduct_service.getObj(id);
		List<OpOperator> opOperators = operatorService.getList();
		List<OpGameapp> opGameapps = appService.getAppList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/operator_product_add");
		modelAndView.addObject("opOperatorProduct", opOperatorProduct);
		modelAndView.addObject("flag", "edit");
		modelAndView.addObject("opOperators", opOperators);
		modelAndView.addObject("opGameapps", opGameapps);
		return modelAndView;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public Object gameAppAdd(OpOperatorProduct obj, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = 0;
		if (obj.getFlag().equals("edit")) {
			res = operator_porduct_service.update(obj);
		} else {
			res = operator_porduct_service.add(obj);
		}
		return res;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public Object gameAppDel(@RequestParam(value = "ids") String ids, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		try {
			res = operator_porduct_service.del(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	@RequestMapping("/selectOperatorByAppId")
	@ResponseBody
	public Object selectOperatorByAppId(@RequestParam(value = "appid") String appid, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		List<OpOperator> opOperators = operator_porduct_service.getOperatorListByAppId(appid);
		return opOperators;
	}
	
}
