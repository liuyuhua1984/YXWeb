package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentConfig;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.service.agent.AgentConfigService;
import com.gamecenter.service.agent.AgentListService;

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
	@Autowired
	private AgentListService agentListService;
	
	@RequestMapping("/config")
	public ModelAndView getConfig(HttpSession session){
	//	String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null){
			agentId = userMsg.getId();
		}
		
		OpAgentList objAgent = agentListService.findById(agentId);
		
		ModelAndView view = new ModelAndView("page/agent/AgentConfig");
		List<OpAgentConfig> list = agentConfigService.getAgentConfigList();
		view.addObject("lists",list);
		view.addObject("level",objAgent.getAgentLevel());
	//	view.addObject("targetTime", targetTime);
		return view;
	}
	
	@RequestMapping("/config/add")
	public ModelAndView getConfigAdd(HttpSession session){
	//	String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null){
			agentId = userMsg.getId();
		}
		ModelAndView view = new ModelAndView("page/agent/AgentConfigAdd");
		List<OpAgentConfig> list = agentConfigService.getAgentConfigList();
		if (list.size() > 0){
			OpAgentConfig config = list.get(0);
			view.addObject("oneLevel",config.getOneLevel());
			view.addObject("twoLevel",config.getTwoLevel());
			view.addObject("threeLevel",config.getThreeLevel());
			view.addObject("noneLevel",config.getNoneLevel());
		}
//		List<OpAgentConfig> list = agentConfigService.getAgentConfigList();
//		view.addObject("lists",list);
	//	view.addObject("targetTime", targetTime);
		return view;
	}
	
	@RequestMapping("/config/update")
	@ResponseBody
	public ModelMap configUpdate(HttpSession session,HttpServletRequest request){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null){
			agentId = userMsg.getId();
		}
		ModelMap map = new ModelMap();
		String res = "-1";
		String oneLevel = request.getParameter("oneLevel");
		String twoLevel = request.getParameter("twoLevel");
		String threeLevel = request.getParameter("threeLevel");
		String noneLevel = request.getParameter("noneLevel");
		List<OpAgentConfig> list = agentConfigService.getAgentConfigList();
		if (list.size() > 0){
			OpAgentConfig config = list.get(0);
			config.setNoneLevel(noneLevel);
			config.setOneLevel(oneLevel);
			config.setThreeLevel(threeLevel);
			config.setTwoLevel(twoLevel);
			agentConfigService.update(config);
			res = "1";
		}else {
			OpAgentConfig pConfig = new OpAgentConfig();
			pConfig.setNoneLevel(noneLevel);
			pConfig.setOneLevel(oneLevel);
			pConfig.setThreeLevel(threeLevel);
			pConfig.setTwoLevel(twoLevel);
			agentConfigService.insert(pConfig);
			res = "1";
		}
		map.put("res", res);
		return map;
		
	}
}