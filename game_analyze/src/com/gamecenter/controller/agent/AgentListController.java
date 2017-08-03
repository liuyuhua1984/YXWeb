package com.gamecenter.controller.agent;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName:AgentController <br/>
 * Function: TODO (代理). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月13日 下午2:51:17 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/agent")
public class AgentListController {
	@Autowired
	private AgentListService agentListService;
	@Autowired
	private AgentRechargeService agentRechargeService;
	
	@Autowired
	private AgentRechargeFetchService agentRechargeFetchService;
	
	/**
	 * agentList:(). <br/>
	 * TODO().<br/>
	 * 打开代理列表
	 * 
	 * @author lyh
	 * @param session
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView agentList(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentList");
		// PageHelper.startPage(curPage, 10);
		// List<OpAgentList> list = agentListService.getNextOpAgentList(agentId);
		// PageInfo<OpAgentList> pageInfo=new PageInfo<OpAgentList>(list);
		// Page page = new Page(curPage, (int)pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
		//
		//
		// PageTool3 pt = new PageTool3();
		// String pageStr = pt.getPageStringForjs("",page);
		// //view.addObject("lists", list);
		view.addObject("targetTime", targetTime);
		// view.addObject("pageTools", pageStr);
		// view.addObject("count", pageInfo.getTotal());
		return view;
		
	}
	
	/**
	 * agentListPage:(). <br/>
	 * TODO().<br/>
	 * 分页列表
	 * 
	 * @author lyh
	 * @param session
	 * @param curPage
	 * @return
	 */
	@RequestMapping("/page/list")
	public ModelAndView agentListPage(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		// String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentListPage");
		PageHelper.startPage(curPage, Tools.PAGE_SIZE);
		List<OpAgentList> list = agentListService.getChildrenOpAgentList(userMsg.getAgentName());
		PageInfo<OpAgentList> pageInfo = new PageInfo<OpAgentList>(list);
		for (OpAgentList agent : pageInfo.getList()) {
			int size = agentRechargeFetchService.countFetchSize(agent.getName());
			if (size > 0) {
				agent.setStatus((byte) 2);
			}
		}
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
	 * deleteAgent:(). <br/>
	 * TODO().<br/>
	 * 删除代理
	 * 
	 * @author lyh
	 * @param session
	 * @param id
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public String deleteAgent(HttpSession session, @RequestParam(value = "id") long id) {
		String res = "-1";
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		OpAgentList agent = agentListService.findById(id);
		if (agent != null) {
			agentListService.deleteById(id);
			res = "1";
		}
		return res;
	}
	
	/**
	 * dealMoney:(). <br/>
	 * TODO().<br/>
	 * 处理结算
	 * 
	 * @author lyh
	 * @param session
	 * @param id
	 * @return
	 */
	@RequestMapping("/deal/money/request")
	@ResponseBody
	public ModelMap dealMoneyRequest(HttpSession session, @RequestParam(value = "id") long id) {
		String res = "-1";
		ModelMap map = new ModelMap();
		
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		OpAgentList agent = agentListService.findById(id);
		if (agent != null) {
			List<OpAgentRechargeFetch> pList = agentRechargeFetchService.getAgentRechargeFetchList(agent.getName());
			if (pList.size() > 0) {
				double money = 0;
				for (OpAgentRechargeFetch fetch : pList) {
					// 弹出对确定结算对话框
					money += fetch.getMoney();
				}
				map.put("money", money);
				map.put("name", agent.getName());
			}
			res = "1";
		}
		map.put("res", res);
		return map;
	}
	
	@RequestMapping("/deal/money")
	@ResponseBody
	public ModelMap dealMoney(HttpSession session, @RequestParam(value = "id") long id) {
		String res = "-1";
		ModelMap map = new ModelMap();
		
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		OpAgentList agent = agentListService.findById(id);
		if (agent != null) {
			List<OpAgentRechargeFetch> pList = agentRechargeFetchService.getAgentRechargeFetchList(agent.getName());
			if (pList.size() > 0) {
				double money = 0;
				for (OpAgentRechargeFetch fetch : pList) {
					// 弹出对确定结算对话框
					money += fetch.getMoney();
					// 下午做
					agentRechargeFetchService.delete(fetch.getId());
					List<Long> ids = JSON.parseArray(fetch.getIds(), Long.class);
					for (long rechargeId : ids) {
						OpAgentRecharge rechargeRecord = agentRechargeService.findById(rechargeId);
						if (rechargeRecord != null) {
							rechargeRecord.setIsFetch(2);
							agentRechargeService.update(rechargeRecord);
						}
					}
				}
				// map.put("money", money);
				// map.put("name", agent.getName());
			}
			res = "1";
		}
		map.put("res", res);
		return map;
	}
	
}
