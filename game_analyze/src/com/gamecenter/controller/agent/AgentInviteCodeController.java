package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentInviteCodeService;

/** 
 * ClassName:AgentInviteCodeController <br/> 
 * Function: TODO (代理邀请码). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午5:48:56 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/agent")
public class AgentInviteCodeController {

	@Autowired
	private  AgentInviteCodeService agentInviteCodeService;
	/** 
	 * getAgentInviteCodeList:(). <br/> 
	 * TODO().<br/> 
	 * 邀请码
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/invite/code/list")
	public ModelAndView getAgentInviteCodeList(HttpSession session){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null){
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentInviteCodeList");
		List<OpAgentInviteCode> list = agentInviteCodeService.getOpAgentInviteCodeList(agentId);
		view.addObject("lists", list);
		view.addObject("targetTime", targetTime);
		return view;
	}
}
  