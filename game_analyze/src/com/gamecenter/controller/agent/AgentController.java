package com.gamecenter.controller.agent;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
 * ClassName:AgentController <br/> 
 * Function: TODO (代理). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月13日 下午2:51:17 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller("/agent")
public class AgentController {
	
	@RequestMapping("")
	public ModelAndView agentList(HttpSession session){
		
		ModelAndView mav = new ModelAndView("/page/agent/AgentList");
		return mav;
		
	}
}
  