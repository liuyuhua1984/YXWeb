package com.gamecenter.controller.apps;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpOperator;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.OperatorService;
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
 * 联运商信息
 * 
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-28 Time: 下午1:51 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/apps/operator")
public class OperatorController {
	
	@Resource
	OperatorService operatorService;
	
	@RequestMapping("")
	public ModelAndView optlist() {
		List<OpOperator> lists = operatorService.getList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/operatorList");
		modelAndView.addObject("lists", lists);
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/operator_add");
		modelAndView.addObject("flag", "add");
		return modelAndView;
	}
	
	@RequestMapping("/edit")
	public ModelAndView update(@RequestParam(value = "id") int optid) {
		OpOperator opOperator = operatorService.getObj(optid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/apps/operator_add");
		modelAndView.addObject("opOperator", opOperator);
		modelAndView.addObject("flag", "edit");
		return modelAndView;
	}
	
	@RequestMapping("/savedata")
	@ResponseBody
	public Object gameAppAdd(OpOperator obj, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = 0;
		if (obj.getFlag().equals("edit")) {
			res = operatorService.update(obj);
		} else {
			res = operatorService.add(obj);
		}
		return res;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public Object gameAppDel(@RequestParam(value = "ids") String ids, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		int res = -1;
		try {
			res = operatorService.del(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
}
