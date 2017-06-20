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
import com.gamecenter.model.OpAgentList;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	public ModelAndView agentList(HttpSession session,@RequestParam(value="page", defaultValue="1") int curPage){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null){
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentList");
//		PageHelper.startPage(curPage, 10);
//		List<OpAgentList> list = agentListService.getNextOpAgentList(agentId);
//		PageInfo<OpAgentList> pageInfo=new PageInfo<OpAgentList>(list); 
//		Page page = new Page(curPage, (int)pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
//	
//
//		PageTool3 pt = new PageTool3();
//		String pageStr = pt.getPageStringForjs("",page);
//		//view.addObject("lists", list);
		view.addObject("targetTime", targetTime);
//		view.addObject("pageTools", pageStr);
//		view.addObject("count", pageInfo.getTotal());
		return view;
		
	}
	
	/** 
	 * agentListPage:(). <br/> 
	 * TODO().<br/> 
	 * 分页列表
	 * @author lyh 
	 * @param session
	 * @param curPage
	 * @return 
	 */  
	@RequestMapping("/page/list")
	public ModelAndView agentListPage(HttpSession session,@RequestParam(value="page", defaultValue="1") int curPage){
		AgentUser userMsg= (AgentUser)session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null){
			agentId = userMsg.getId();
		}
		//String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentListPage");
		PageHelper.startPage(curPage, 5);
		List<OpAgentList> list = agentListService.getNextOpAgentList(agentId);
		PageInfo<OpAgentList> pageInfo=new PageInfo<OpAgentList>(list); 
		Page page = new Page(curPage, (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
	
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("",page);
		view.addObject("lists", list);
		//view.addObject("targetTime", targetTime);
		view.addObject("pageTools", pageStr);
		view.addObject("count", pageInfo.getTotal());
		return view;
		
	}
}
  