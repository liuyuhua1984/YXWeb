package com.gamecenter.controller.agent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.model.OpAgentRechargeFetch;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.service.agent.AgentListService;
import com.gamecenter.service.agent.AgentRechargeFetchService;
import com.gamecenter.service.agent.AgentRechargeService;
import com.gamecenter.service.agent.AgentShopService;
import com.gamecenter.service.agent.PlayerRechargeService;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.DataUpHandleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName:AgentRechargeRequestController <br/>
 * Function: TODO (代理结算). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月14日 下午5:51:16 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/agent")
public class AgentRechargeFetchController {
	
	@Autowired
	private AgentRechargeService agentRechargeService;
	
	@Autowired
	private AgentRechargeFetchService agentRechargeFetchService;
	
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
	
	@RequestMapping("/recharge/fetch/list")
	public ModelAndView getAgentRechargeRequest(HttpSession session) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null) {
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeFetch");
//		List<OpAgentRechargeRequest> list = agentRechargeRequestService.getAgentRechargeRequestList(platformName);
//		view.addObject("lists", list);
		view.addObject("targetTime", targetTime);
		return view;
	}
	
	/** 
	 * rechargeRequest:(). <br/> 
	 * TODO().<br/> 
	 * 结算页面
	 * @author lyh 
	 * @param session
	 * @return 
	 */  
	@RequestMapping("/recharge/fetch/page")
	public ModelAndView rechargeFetchPage(HttpSession session,@RequestParam(value = "page", defaultValue = "1") int curPage) {
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeFetchPage");
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null) {
			platformName = userMsg.getAgentName();
		}
		OpAgentList agent = agentListService.findById(userMsg.getId());
		
		if (agent != null) {
		
			PageHelper.startPage(curPage, Tools.PAGE_SIZE);
			List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeFetchList(platformName,0,agent.getAgentLevel());
			PageInfo<OpAgentRecharge> pageInfo = new PageInfo<OpAgentRecharge>(list);
			Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
			
			PageTool3 pt = new PageTool3();
			String pageStr = pt.getPageStringForjs("", page);
			view.addObject("lists", list);
			// view.addObject("targetTime", targetTime);
			view.addObject("pageTools", pageStr);
			view.addObject("count", pageInfo.getTotal());
			
			double money = 0;
			double dMoney = 0;
			List<OpAgentRecharge>  fetchList = agentRechargeService.getOpAgentRechargeFetchList(platformName, 0,agent.getAgentLevel());
			for(OpAgentRecharge recharge : fetchList){
				dMoney+=recharge.getFetchMoney();
				money +=recharge.getMoney();
			}
			view.addObject("total", money);
			view.addObject("fetch", dMoney);
		}
		return view;
	}
	
	///agent/recharge/fetch/request
	/** 
	 * rechargeFetchRequest:(). <br/> 
	 * TODO().<br/> 
	 * 结算请求申请
	 * @author lyh 
	 * @param session
	 * @param curPage
	 * @return 
	 */  
	@RequestMapping("/recharge/fetch/request")
	public ModelAndView rechargeFetchRequest(HttpSession session,@RequestParam(value = "page", defaultValue = "1") int curPage) {
		ModelAndView view = new ModelAndView("page/agent/AgentRechargeFetchPage");
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null) {
			platformName = userMsg.getAgentName();
		}
		OpAgentList agent = agentListService.findById(userMsg.getId());
		
		if (agent != null) {
			
			//结算
			List<OpAgentRecharge>  fetchList = agentRechargeService.getOpAgentRechargeFetchList(platformName, 0,agent.getAgentLevel());
			List<Long> rList = new ArrayList<Long>();
			double fMoney = 0;
			for(OpAgentRecharge recharge : fetchList){
				recharge.setIsFetch(1);
				fMoney +=recharge.getFetchMoney();
				agentRechargeService.update(recharge);
				rList.add(recharge.getId());
			}
			
			if (rList.size() > 0){
				//存入请求库
				OpAgentRechargeFetch pObj = new OpAgentRechargeFetch();
				pObj.setCreateTime(new Date(System.currentTimeMillis()));
				pObj.setName(platformName);
				pObj.setMoney(fMoney);
				pObj.setIds(JSON.toJSONString(rList));
				agentRechargeFetchService.insert(pObj);
			}
			
			PageHelper.startPage(curPage, Tools.PAGE_SIZE);
			List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeFetchList(platformName, 0,agent.getAgentLevel());
			PageInfo<OpAgentRecharge> pageInfo = new PageInfo<OpAgentRecharge>(list);
			Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
			
			PageTool3 pt = new PageTool3();
			String pageStr = pt.getPageStringForjs("", page);
			view.addObject("lists", list);
			// view.addObject("targetTime", targetTime);
			view.addObject("pageTools", pageStr);
			view.addObject("count", pageInfo.getTotal());
			
			double money = 0;
			double dMoney = 0;
			fetchList = agentRechargeService.getOpAgentRechargeFetchList(platformName, 0,agent.getAgentLevel());
			for(OpAgentRecharge recharge : fetchList){
				dMoney+=recharge.getFetchMoney();
				money +=recharge.getMoney();
			}
			view.addObject("total", money);
			view.addObject("fetch", dMoney);
		}
		return view;
	}

}
