package com.gamecenter.controller.agent;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpAgentRechargeRequest;
import com.gamecenter.model.OpAgentRequest;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentInviteCodeService;
import com.gamecenter.service.agent.AgentListService;
import com.gamecenter.service.agent.AgentRequestService;

/**
 * ClassName:AgentController <br/>
 * Function: TODO (代理添加). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月13日 下午2:51:17 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/agent")
public class AgentRequestController {
	
	@Autowired
	private AgentListService agentListService;
	
	@Autowired
	private AgentInviteCodeService agentInviteCodeService;
	
	@RequestMapping("/add")
	public ModelAndView agentAddPage(HttpSession session) {
		ModelAndView mav = new ModelAndView("/page/agent/AgentAdd");
		return mav;
	}
	
	// @RequestMapping("/request/list")
	// public ModelAndView getRequestList(HttpSession session) {
	//
	// AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
	// String platformName = "";
	// if (userMsg != null) {
	// platformName = userMsg.getAgentName();
	// }
	// String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
	// ModelAndView view = new ModelAndView("page/agent/AgentRechargeRequestList");
	// List<OpAgentRequest> list = agentRequestService.getAgentRequestList(platformName);
	// view.addObject("lists", list);
	// view.addObject("targetTime", targetTime);
	// return view;
	// }
	
	@RequestMapping("/register")
	@ResponseBody
	public Map<String, Object> addAgent(HttpServletRequest request) {
		String res = "-1";
		String name = (String) request.getParameter("name");
		String password = (String) request.getParameter("password");
		String inviteCode = (String) request.getParameter("inviteCode");
		String weChat = (String) request.getParameter("weChat");
		String phone = (String) request.getParameter("phone");
		if (!ToolUtils.isStringNull(name) && !ToolUtils.isStringNull(password) && !ToolUtils.isStringNull(inviteCode) && !ToolUtils.isStringNull(weChat) && !ToolUtils.isStringNull(phone)) {
			
			phone.trim();
			// 判断邀请码是否服合要求
			OpAgentInviteCode code = agentInviteCodeService.findOpAgentInviteCodeByCode(inviteCode);
			if (code != null) {
				if (code.getIsUse() == 1) {
					res = "-3";// 邀请码已过时
				} else if (agentListService.findByName(name) != null) {// 名称没有被占用
					res = "-4";// 代理名称已存在
				} else if (!Tools.isPhoneLegal(phone)) {
					res = "-5";// 电话号码不合法
				} else if (agentListService.findByPhone(Long.parseLong(phone)) != null){
					res = "-6";// 电话号码已存在,请另外填写
				}else if (agentListService.findByWechat(weChat) != null){
					res = "-7";// 微信号已存在,请另外填写
				}
				else {
					code.setIsUse((byte) 1);
					agentInviteCodeService.update(code);
					OpAgentList agent = new OpAgentList();
					agent.setAgentLevel(1);
					agent.setInviteCode(inviteCode);
					agent.setName(name);
					agent.setParentId(code.getAgentId());
					agent.setCreateTime(new Date(System.currentTimeMillis()));
					agent.setPassword(password);
					agent.setPhone(Long.parseLong(phone));// 没有判断 是不是数据
					agent.setWechatCode(weChat);
					agent.setStatus((byte) 1);
					agentListService.insert(agent);
					res = "1";
				}
			} else {
				res = "-2";// 邀请码不存在
			}
		}
		
		ModelMap map = new ModelMap();
		map.put("res", res);
		return map;
	}
}
