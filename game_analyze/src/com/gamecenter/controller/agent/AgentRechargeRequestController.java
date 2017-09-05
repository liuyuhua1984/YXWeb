package com.gamecenter.controller.agent;

import java.util.Date;
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
import com.gamecenter.model.OpAgentConfig;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.model.OpShop;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.service.agent.AgentConfigService;
import com.gamecenter.service.agent.AgentListService;
import com.gamecenter.service.agent.AgentRechargeFetchService;
import com.gamecenter.service.agent.AgentRechargeService;
import com.gamecenter.service.agent.AgentShopService;
import com.gamecenter.service.agent.PlayerRechargeService;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
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
	private AgentRechargeService agentRechargeService;
	
	@Autowired
	private AgentRechargeFetchService agentRechargeRequestService;
	
	@Autowired
	private AgentShopService agentShopService;
	
	@Autowired
	private AgentListService agentListService;
	
	@Autowired
	private DataUpHandleService dataUpHandleService;
	
	@Autowired
	private PlayerRechargeService playerRechargeService;
	
	@Autowired
	private WorldService worldService;
	
	@Autowired
	private AppService appService;
	
	@Autowired
	private AgentConfigService agentConfigService;
	
//	@RequestMapping("/recharge/fetch/list")
//	public ModelAndView getAgentRechargeRequest(HttpSession session) {
//		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
//		String platformName = "";
//		if (userMsg != null) {
//			platformName = userMsg.getAgentName();
//		}
//		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
//		ModelAndView view = new ModelAndView("page/agent/AgentRechargeRequestList");
////		List<OpAgentRechargeRequest> list = agentRechargeRequestService.getAgentRechargeRequestList(platformName);
////		view.addObject("lists", list);
//		view.addObject("targetTime", targetTime);
//		return view;
//	}
	
	/** 
	 * rechargeRequest:(). <br/> 
	 * TODO().<br/> 
	 * 打开充值页面
	 * @author lyh 
	 * @param session
	 * @return 
	 */  
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
	
	/** 
	 * addMoney:(). <br/> 
	 * TODO().<br/> 
	 * 购买道具,代理给下一级买
	 * @author lyh 
	 * @param session
	 * @param request
	 * @return 
	 */  
	@RequestMapping("/add/money")
	@ResponseBody
	public ModelMap addMoney(HttpSession session, HttpServletRequest request) {
		ModelMap map = new ModelMap();
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		String res = "-1";
		String platformName = "";
		if (userMsg != null) {
			platformName = userMsg.getAgentName();
		}
		String price = request.getParameter("price");
		String payedName = request.getParameter("name");
		String isAgent = request.getParameter("isAgent");
		boolean bAgent = Integer.parseInt(isAgent) > 0 ? true : false;
		double dPrice = Double.parseDouble(price);
		
		OpShop goods = agentShopService.findShopGoodsByPrice(dPrice, 0);
		if (goods != null) {
			OpAgentList parentAgent = agentListService.findById(userMsg.getId());
			int gold = goods.getGift() + goods.getNum();
			if (parentAgent != null) {
				
				// 添加到
				if (bAgent) {
					OpAgentList agent = agentListService.findByName(payedName);
					if (agent != null && userMsg.getAgentName().equals(agent.getParentName()) && parentAgent.getRemainMoney() >= gold) {// 只有上级充值下级
						// 这儿暂时没有加同步
						// 生成订单号
						String trade = "a" + IdGenerateUtils.makeId();
						addAgentMoney(agent, parentAgent, gold, dPrice, trade);
						res = "1";
					}else {
						res="-2";
					}
				} else {
					
					OpAgentList agent = agentListService.findByName(platformName);
					if (agent.getRemainMoney() == null){
						agent.setRemainMoney(0);
					}
					if (agent != null && agent.getRemainMoney() >= gold) {
						List<OpGameapp> appList = appService.getAppList();
						OpGameapp gameApp = appList.size() > 0 ? appList.get(0) : null;
						OpGameworld worldServer = null;
						if (gameApp != null) {
							List<OpGameworld> worldList = worldService.getWorldListByAppId(gameApp.getAppid());
							worldServer = worldList.size() > 0 ? worldList.get(0) : null;
						}
						
						if (worldServer != null) {
							OpOssQlzPassport player = dataUpHandleService.getPassportByName(payedName, worldServer.getWorldid());
							if (player != null && player.getInviteCode() == agent.getInviteCode()) {
								//
								double fetchMoneyRate = 0;
								OpAgentConfig agentConfig =  agentConfigService.findById(1);
								if (agentConfig != null && agentConfig.getOneLevel() != null){
									fetchMoneyRate = Double.parseDouble(agentConfig.getOneLevel() );
								}
								String trade = "p" + IdGenerateUtils.makeId();
								int status = playerRechargeService.recharge(player.getOpenid(), trade, dPrice,gold, (int) (System.currentTimeMillis() / 1000), worldServer.getWorldid(), "" + 1, worldServer);
								if (status == 1) {
									res = "1";
									addPlayerMoney(player, agent, gold, dPrice, trade,(fetchMoneyRate*dPrice)/100);
								}
							}else {
								res="-3";
							}
						}
					}else {
						res="-2";
					}
				}
			}
		}
		
		map.put("res", res);
		return map;
	}
	
	@Transactional
	public void addAgentMoney(OpAgentList agent, OpAgentList parentAgent, int gold, double price, String staderOrder) {
		if (agent.getRemainMoney() == null){
			agent.setRemainMoney(0);
		}
		agent.setRemainMoney(agent.getRemainMoney() + gold);
		agentListService.update(agent);
		parentAgent.setRemainMoney(parentAgent.getRemainMoney() - gold);
		agentListService.update(parentAgent);
		
		saveRecharge(parentAgent.getName(), 1, price, agent.getName(), staderOrder, 0,0);
	}
	
	@Transactional
	public void addPlayerMoney(OpOssQlzPassport player, OpAgentList parentAgent, int gold, double price, String staderOrder,double fetchMoney) {
		parentAgent.setRemainMoney(parentAgent.getRemainMoney() - gold);
		agentListService.update(parentAgent);
		saveRecharge(parentAgent.getName(), 0, price, player.getRolename(), staderOrder, 0,fetchMoney);
	}
	
	/**
	 * saveRecharge:(). <br/>
	 * TODO().<br/>
	 * 保存充值记录
	 * 
	 * @author lyh
	 * @param agentName
	 * @param isAgent
	 * @param rmb
	 * @param rechageName
	 * @param traderOrder
	 * @param onlinePay
	 */
	public void saveRecharge(String agentName, int isAgent, double rmb, String rechageName, String traderOrder, int onlinePay,double fetchMoney) {
		OpAgentRecharge pay = new OpAgentRecharge();
		pay.setAgentName(agentName);
		pay.setIsAgent((byte) isAgent);
		pay.setMoney(rmb);
		pay.setName(rechageName);
		pay.setTraderOrder(traderOrder);
		pay.setOnlinePay(onlinePay);
		pay.setCreateTime(new Date(System.currentTimeMillis()));
		pay.setIsFetch(0);
		pay.setFetchMoney(fetchMoney);
		pay.setFlag(1);
		agentRechargeService.insert(pay);
	}
}
