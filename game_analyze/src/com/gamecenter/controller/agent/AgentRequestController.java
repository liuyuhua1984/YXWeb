package com.gamecenter.controller.agent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentRechargeRequest;
import com.gamecenter.model.OpAgentRequest;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentRequestService;

/** 
 * ClassName:AgentController <br/> 
 * Function: TODO (代理添加). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月13日 下午2:51:17 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/agent")
public class AgentRequestController {
	
	@Autowired
	private AgentRequestService agentRequestService;
	
	@RequestMapping("/add/page")
	public ModelAndView agentAddPage(HttpSession session){
		
		ModelAndView mav = new ModelAndView("/page/agent/AgentAdd");
		return mav;
		
	}
	@RequestMapping("/request/list")
	public ModelAndView getRequestList(HttpSession session){
		
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeRequestList");
		List<OpAgentRequest> list = agentRequestService.getAgentRequestList(platformName);
		view.addObject("lists",list);
		view.addObject("targetTime", targetTime);
		return view;
	}
}
  