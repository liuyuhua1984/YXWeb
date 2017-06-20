package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.IdGenerateUtils;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentConfig;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpAgentRechargeRequest;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.model.OpShop;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentListService;
import com.gamecenter.service.agent.AgentRechargeRequestService;
import com.gamecenter.service.agent.AgentShopService;
import com.gamecenter.service.dataup.DataUpHandleService;

/**
 * ClassName:AgentRechargeRequestController <br/>
 * Function: TODO (代理和玩家充值). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月14日 下午5:51:16 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/agent")
public class AgentRechargeRequestController {
	
	@Autowired
	private AgentRechargeRequestService agentRechargeRequestService;
	
	@Autowired
	private AgentShopService agentShopService;
	
	@Autowired
	private AgentListService agentListService;
	
	@Autowired
	private DataUpHandleService dataUpHandleService;
	
	@RequestMapping("/recharge/request/list")
	public ModelAndView getAgentRechargeRequest(HttpSession session) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null) {
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeRequestList");
		List<OpAgentRechargeRequest> list = agentRechargeRequestService.getAgentRechargeRequestList(platformName);
		view.addObject("lists", list);
		view.addObject("targetTime", targetTime);
		return view;
	}
	
	// AgentRechargeRequest
	@RequestMapping("/recharge/add")
	public ModelAndView rechargeRequest(HttpSession session) {
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeRequest");
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null) {
			platformName = userMsg.getAgentName();
		}
		OpAgentList agent = agentListService.findById(userMsg.getId());
		if (agent != null) {
			List<OpShop> list = agentShopService.findShopGoodsByType(0);
			view.addObject("lists", list);
		}
		return view;
	}
	
	@RequestMapping("/add/money")
	@ResponseBody
	public ModelMap  addMoney(HttpSession session,HttpServletRequest request){
		ModelMap map = new ModelMap();
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String res = "-1";
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String price = request.getParameter("price");
		String payedName = request.getParameter("name");
		String isAgent = request.getParameter("isAgent");
		boolean bAgent = Integer.parseInt(isAgent) > 0 ? true : false;

		
		
		OpShop goods = agentShopService.findShopGoodsByPrice(Integer.parseInt(price), 0);
		if (goods != null){
			OpAgentList parentAgent = agentListService.findById(userMsg.getId());
			int gold = goods.getGift() + goods.getNum();
			if (parentAgent != null && parentAgent.getRemainMoney() > gold){
			//添加到
			if (bAgent){
				OpAgentList agent = agentListService.findByName(payedName);
				
				if (agent != null && userMsg.getId() == agent.getParentId()){//只有上级充值下级
					//这儿暂时没有加同步
					addAgentMoney(agent, parentAgent, gold);
					//生成订单号
					String trade= "agent:"+IdGenerateUtils.makeId();
				}
			}else {
				OpOssQlzPassport player = dataUpHandleService.getPassportByName(payedName, null);
				if (player != null){
					//
					String trade= "player:"+IdGenerateUtils.makeId();
					
				}
				
			}
			}
		}
		
		map.put("res", res);
		return map;
	}
	
	@Transactional
	public void addAgentMoney(OpAgentList agent,OpAgentList parentAgent,int gold){
		agent.setRemainMoney(agent.getRemainMoney() +gold);
		agentListService.update(agent);
		parentAgent.setRemainMoney(parentAgent.getRemainMoney() - gold);
		agentListService.update(parentAgent);
	}
	
	@Transactional
	public void addPlayerMoney(OpOssQlzPassport agent,OpAgentList parentAgent,int gold){
		parentAgent.setRemainMoney(parentAgent.getRemainMoney() - gold);
		agentListService.update(parentAgent);
	}
	
	public void recordRecharge( ){
		
	}
}
