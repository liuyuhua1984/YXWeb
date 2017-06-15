package com.gamecenter.controller.agent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentConfig;
import com.gamecenter.service.agent.AgentConfigService;

/** 
 * ClassName:AgentConfigController <br/> 
 * Function: TODO (代理配置). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午5:47:57 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/agent")
public class AgentConfigController {
	    
	@Autowired
	private AgentConfigService agentConfigService;
	
	@RequestMapping("/config")
	public ModelAndView getConfig(){
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("page/agent/AgentConfig");
		List<OpAgentConfig> list = agentConfigService.getAgentConfigList();
		view.addObject("lists",list);
		view.addObject("targetTime", targetTime);
		return view;
	}
}
  