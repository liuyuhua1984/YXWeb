package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentRechargeService;

/** 
 * ClassName:AgentRechargeController <br/> 
 * Function: TODO (代理充值记录). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午5:52:24 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/agent")
public class AgentRechargeController {
	
	@Autowired
	private AgentRechargeService agentRechargeService;
	
	/** 
	 * agentBuyList:(). <br/> 
	 * TODO().<br/> 
	 * 购买记录列表
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/buy/list")
	public ModelAndView agentBuyList(HttpSession session){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView mav = new ModelAndView("page/agent/AgentBuyList");
		List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeBuyList(platformName);
		mav.addObject("lists", list);
		mav.addObject("targetTime", targetTime);
		return mav;
	}
	
	/** 
	 * agentSellList:(). <br/> 
	 * TODO().<br/> 
	 * 代理出售记录列表
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/sell/list")
	public ModelAndView agentSellList(HttpSession session){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView mav = new ModelAndView("page/agent/AgentSellList");
		List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeSellList(platformName);
		mav.addObject("lists", list);
		mav.addObject("targetTime", targetTime);
		return mav;
	}
}
  