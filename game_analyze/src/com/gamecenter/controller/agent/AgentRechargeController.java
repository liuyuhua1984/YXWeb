package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentRechargeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
 * ClassName:AgentRechargeController <br/> 
 * Function: TODO (代理充值记录). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月14日 下午5:52:24 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/agent")
public class AgentRechargeController {
	

	@Autowired
	private AgentRechargeService agentRechargeService;
	
	/** 
	 * agentBuyList:(). <br/> 
	 * TODO().<br/> 
	 * 购买记录列表
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/buy/list")
	public ModelAndView agentBuyList(HttpSession session){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView mav = new ModelAndView("page/agent/AgentBuyList");
		List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeBuyList(platformName);
		mav.addObject("lists", list);
		mav.addObject("targetTime", targetTime);
		return mav;
	}
	
	/** 
	 * agentSellList:(). <br/> 
	 * TODO().<br/> 
	 * 代理出售记录列表
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/sell/list")
	public ModelAndView agentSellList(HttpSession session){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView mav = new ModelAndView("page/agent/AgentSellList");
	//	List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeSellList(platformName);
		//mav.addObject("lists", list);
		mav.addObject("targetTime", targetTime);
		return mav;
	}
	
	/**
	 * getSellListPage:(). <br/>
	 * TODO().<br/>
	 * 销售记录分页
	 * 
	 * @author lyh
	 * @param session
	 * @param curPage
	 * @return
	 */
	@RequestMapping("/sell/list/page")
	public ModelAndView getSellListPage(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentSellListPage");
		PageHelper.startPage(curPage, Tools.PAGE_SIZE);
		List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeSellList(platformName);
		PageInfo<OpAgentRecharge> pageInfo = new PageInfo<OpAgentRecharge>(list);
		Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
		
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", page);
		view.addObject("lists", list);
		// view.addObject("targetTime", targetTime);
		view.addObject("pageTools", pageStr);
		view.addObject("count", pageInfo.getTotal());
		
		return view;
	}
	
	/** 
	 * getBuyListPage:(). <br/> 
	 * TODO().<br/> 
	 * 代理购买记录
	 * @author lyh 
	 * @param session
	 * @param curPage
	 * @return 
	 */  
	@RequestMapping("/buy/list/page")
	public ModelAndView getBuyListPage(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		String platformName = "";
		if (userMsg != null){
			platformName = userMsg.getAgentName();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentSellListPage");
		PageHelper.startPage(curPage, Tools.PAGE_SIZE);
		List<OpAgentRecharge> list = agentRechargeService.getOpAgentRechargeBuyList(platformName);
		PageInfo<OpAgentRecharge> pageInfo = new PageInfo<OpAgentRecharge>(list);
		Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
		
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", page);
		view.addObject("lists", list);
		// view.addObject("targetTime", targetTime);
		view.addObject("pageTools", pageStr);
		view.addObject("count", pageInfo.getTotal());
		
		return view;
	}
}
  