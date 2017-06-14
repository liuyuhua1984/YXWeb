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
@Controller
@RequestMapping("/agent")
public class AgentListController {
	
	/** 
	 * agentList:(). <br/> 
	 * TODO().<br/> 
	 * 打开代理列表
	 * @author lyh 
	 * @param session
	 * @return 
	 */  
	@RequestMapping("")
	public ModelAndView agentList(HttpSession session){
		
		ModelAndView mav = new ModelAndView("/page/agent/AgentList");
		return mav;
		
	}
}
  