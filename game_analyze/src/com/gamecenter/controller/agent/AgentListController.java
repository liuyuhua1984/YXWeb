package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentListService;

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
	@Autowired
	private AgentListService agentListService;
	
	/** 
	 * agentList:(). <br/> 
	 * TODO().<br/> 
	 * 打开代理列表
	 * @author lyh 
	 * @param session
	 * @return 
	 */  
	@RequestMapping("/list")
	public ModelAndView agentList(HttpSession session){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null){
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentList");
		List<OpAgentList> list = agentListService.getNextOpAgentList(agentId);
		view.addObject("lists", list);
		view.addObject("targetTime", targetTime);
		return view;
		
	}
}
  