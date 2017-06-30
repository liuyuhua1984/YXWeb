package com.gamecenter.controller.gmt;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.Tools;
import com.gamecenter.controller.BaseController;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpFeedbackQuestion;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.service.gmt.FeedbackQuestingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
 * ClassName:PlayerFeedBackController <br/> 
 * Function: TODO (问题反馈). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月29日 下午6:49:27 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
@RequestMapping("/gmt/player")
public class PlayerFeedBackController extends BaseController {
	
	@Autowired
	private FeedbackQuestingService feedbackService;
	
	@RequestMapping("/feedback/add")
	@ResponseBody
	public ModelMap playerFeedBackAdd(HttpSession session, HttpServletRequest req){
		ModelMap map = new ModelMap();
		String openId = req.getParameter("openId");
		String content = req.getParameter("content");
		String serverId = req.getParameter("serverId");
		String phone = req.getParameter("phone");
		OpFeedbackQuestion quest = new OpFeedbackQuestion();
		quest.setOpenId(openId);
		quest.setContent(content);
		quest.setPhone(Integer.parseInt(phone));
		quest.setCreateTime(new Date(System.currentTimeMillis()));
		feedbackService.insert(quest);
		map.put("result", 1);
		return map;
	}
	
	/** 
	 * playerFeedBack:(). <br/> 
	 * TODO().<br/> 
	 * 
	 * @author lyh 
	 * @return 
	 */  
	@RequestMapping("/feedback")
	public ModelAndView playerFeedBack(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage){
		ModelAndView view = new ModelAndView("/page/gmTools/FeedbackRequestionlList");
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		view.addObject("targetTime", targetTime);
		return view;
	}
	
	
	/**
	 * playerFeedBackPage:(). <br/>
	 * TODO().<br/>
	 * 分页列表
	 * 
	 * @author lyh
	 * @param session
	 * @param curPage
	 * @return
	 */
	@RequestMapping("/page")
	public ModelAndView playerFeedBackPage(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		// String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentListPage");
		PageHelper.startPage(curPage, Tools.PAGE_SIZE);
		List<OpFeedbackQuestion> list = feedbackService.getOpFeedbackQuestionList();
		PageInfo<OpFeedbackQuestion> pageInfo = new PageInfo<OpFeedbackQuestion>(list);
		
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
	public String deleteFeedback(HttpSession session, @RequestParam(value = "id") long id) {
		String res = "-1";
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		OpFeedbackQuestion agent = feedbackService.findById(id);
		if (agent != null) {
			feedbackService.delete(id);
			res = "1";
		}
		return res;
	}
}
  