package com.gamecenter.controller.agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	private AgentRechargeService service;
	
	/** 
	 * agentBuyList:(). <br/> 
	 * TODO().<br/> 
	 * 购买记录列表
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/buy/list")
	public ModelAndView agentBuyList(){
		ModelAndView mav = new ModelAndView("page/agent/AgentBuyList");
		service.
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
	public ModelAndView agentSellList(){
		ModelAndView mav = new ModelAndView("page/agent/AgentSellList");
		return mav;
	}
}
  