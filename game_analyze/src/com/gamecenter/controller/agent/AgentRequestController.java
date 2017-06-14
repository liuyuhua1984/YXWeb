package com.gamecenter.controller.agent;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/add/page")
	public ModelAndView agentAddPage(HttpSession session){
		
		ModelAndView mav = new ModelAndView("/page/agent/AgentAdd");
		return mav;
		
	}
	@RequestMapping("/add/agent")
	@ResponseBody
	public Map<String, Object> addAgent(){
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", 1);
		return modelMap;
	}
}
  