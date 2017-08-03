package com.gamecenter.controller.agent;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.Tools;
import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.service.agent.AgentInviteCodeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName:AgentInviteCodeController <br/>
 * Function: TODO (代理邀请码). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月14日 下午5:48:56 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/agent")
public class AgentInviteCodeController {
	
	public static final String randomInviteArray[] = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z" };
	@Autowired
	private AgentInviteCodeService agentInviteCodeService;
	
	public static final int PAGE_SIZE = 10;
	
	/**
	 * getAgentInviteCodeList:(). <br/>
	 * TODO().<br/>
	 * 邀请码
	 * 
	 * @author lyh
	 * @return
	 */
	@RequestMapping("/invite/code/list")
	public ModelAndView getAgentInviteCodeList(HttpSession session) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentInviteCodeList");
		// List<OpAgentInviteCode> list = agentInviteCodeService.getOpAgentInviteCodeList(agentId);
		// view.addObject("lists", list);
		view.addObject("targetTime", targetTime);
		return view;
	}
	
	/**
	 * getAgentInviteCodeListPage:(). <br/>
	 * TODO().<br/>
	 * 邀请码分页
	 * 
	 * @author lyh
	 * @param session
	 * @param curPage
	 * @return
	 */
	@RequestMapping("/invite/code/list/page")
	public ModelAndView getAgentInviteCodeListPage(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentInviteCodeListPage");
		PageHelper.startPage(curPage, PAGE_SIZE);
		List<OpAgentInviteCode> list = agentInviteCodeService.getOpAgentInviteCodeList(agentId);
		PageInfo<OpAgentInviteCode> pageInfo = new PageInfo<OpAgentInviteCode>(list);
		Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
		
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", page);
		view.addObject("lists", list);
		// view.addObject("targetTime", targetTime);
		view.addObject("pageTools", pageStr);
		view.addObject("count", pageInfo.getTotal());
		
		return view;
	}
	
	/// agent/invite/code
	
	@RequestMapping("/invite/code/create")
	public ModelAndView getAgentInviteCodeCreate(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage, @RequestParam(value = "code", defaultValue = "1") int code) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		if (code == 1) {
			long count = agentInviteCodeService.remainInviteCode(agentId);
			if (count < 100) {
				// 生成邀请码
				createCode(userMsg, (int) (100 - count));
			}
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentInviteCodeListPage");
		PageHelper.startPage(curPage, PAGE_SIZE);
		List<OpAgentInviteCode> list = agentInviteCodeService.getOpAgentInviteCodeList(agentId);
		PageInfo<OpAgentInviteCode> pageInfo = new PageInfo<OpAgentInviteCode>(list);
		Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
		
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", page);
		view.addObject("lists", list);
		// view.addObject("targetTime", targetTime);
		view.addObject("pageTools", pageStr);
		view.addObject("count", pageInfo.getTotal());
		
		return view;
	}
	
	@Transactional
	public void createCode(AgentUser user, int count) {
		if (count <= 0) {
			return;
		}
		for (int i = count; i > 0; i--) {
			OpAgentInviteCode code = new OpAgentInviteCode();
			code.setCreateTime(new Date(System.currentTimeMillis()));
			code.setIsPutOut((byte) 0);
			code.setIsUse((byte) 0);
			code.setAgentId(user.getId());
			// int inviteCode = ThreadLocalRandom.current().nextInt();
			String inviteCode = "";
			for (int j = 0; j < 6; j++) {
				int rNum = ThreadLocalRandom.current().nextInt(0, randomInviteArray.length);
				inviteCode += randomInviteArray[rNum];
			}
			if (agentInviteCodeService.findOpAgentInviteCodeByCode(inviteCode) == null) {
				code.setInviteCode(inviteCode);
				agentInviteCodeService.insert(code);
			}
		}
	}
	
	@RequestMapping("/invite/code/copy")
	public ModelAndView getAgentInviteCodeCopy(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage, @RequestParam(value = "code", defaultValue = "1") String code) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		OpAgentInviteCode fOutCode = agentInviteCodeService.findOpAgentInviteCodeByCode(code);
		if (fOutCode != null && fOutCode.getIsPutOut() < 1) {
			fOutCode.setIsPutOut((byte) 1);
			agentInviteCodeService.update(fOutCode);
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/agent/AgentInviteCodeListPage");
		PageHelper.startPage(curPage, PAGE_SIZE);
		List<OpAgentInviteCode> list = agentInviteCodeService.getOpAgentInviteCodeList(agentId);
		PageInfo<OpAgentInviteCode> pageInfo = new PageInfo<OpAgentInviteCode>(list);
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
