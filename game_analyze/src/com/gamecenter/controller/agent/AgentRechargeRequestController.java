package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentConfig;
import com.gamecenter.model.OpAgentRechargeRequest;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentRechargeRequestService;

/** 
 * ClassName:AgentRechargeRequestController <br/> 
 * Function: TODO (代理和玩家充值). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午5:51:16 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/agent")
public class AgentRechargeRequestController {

	@Autowired
	private AgentRechargeRequestService agentRechargeRequestService;
	
	
	@RequestMapping("/recharge/request/list")
	public ModelAndView getAgentRechargeRequest(HttpSession session){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeRequestList");
		List<OpAgentRechargeRequest> list = agentRechargeRequestService.getAgentRechargeRequestList(platformName);
		view.addObject("lists",list);
		view.addObject("targetTime", targetTime);
		return view;
	}
	
	//AgentRechargeRequest
	@RequestMapping("/recharge/add")
	public ModelAndView  rechargeRequest(){
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeRequest");
		return view;
	}
	
}
  