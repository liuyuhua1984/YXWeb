package com.gamecenter.controller.gmt;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.Tools;
import com.gamecenter.controller.BaseController;
import com.gamecenter.model.OpFeedbackQuestion;
import com.gamecenter.model.OpGmtNoticeLeft;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.gmt.GmtNoticeLeftService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName:NoticeLeftController <br/>
 * Function: TODO (公告栏). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月30日 下午2:43:48 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/gmt/notice/left")
public class NoticeLeftController extends BaseController{
	
	@Autowired
	private GmtNoticeLeftService noticeLeftService;
	
	//NoticeLeftList
	
	/** 
	 * noticeLeftList:(). <br/> 
	 * TODO().<br/> 
	 * 公告列表
	 * @author lyh 
	 * @return 
	 */ 
	@RequestMapping("/list")
	public ModelAndView noticeLeftList(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPag){
		
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/gmTools/NoticeLeftList");
		view.addObject("targetTime", targetTime);
		

		//List<OpGmtNoticeLeft> list = noticeLeftService.getNoticList();
		//view.addObject("lists", list);
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
	public ModelAndView noticeLeftListPage(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		// String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/gmTools/NoticeLeftListPage");
		PageHelper.startPage(curPage, Tools.PAGE_SIZE);
		List<OpGmtNoticeLeft> list = noticeLeftService.getNoticList();
		PageInfo<OpGmtNoticeLeft> pageInfo = new PageInfo<OpGmtNoticeLeft>(list);
		
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
	 * delNoticeLeftList:(). <br/>
	 * TODO().<br/>
	 * 删除 公告
	 * 
	 * @author lyh
	 * @param session
	 * @param id
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public Object delNoticeLeftList(HttpSession session, @RequestParam(value="id") long id) {
		String res = "-1";
		AgentUser userMsg = (AgentUser) session.getAttribute("AgentUser");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getId();
		}
		Map<String,Object> map = new HashMap<String,Object>();
		
		OpGmtNoticeLeft agent = noticeLeftService.findById(id);
		if (agent != null) {
			noticeLeftService.delete(id);
			res = "1";
		}
	
		map.put("res", res);
		return res;
	}
	
	/** 
	 * noticeLeftSave:(). <br/> 
	 * TODO().<br/> 
	 * 
	 * @author lyh 
	 * @param session
	 * @return 
	 */  
	@RequestMapping(value="/save",method = RequestMethod.POST)
	@ResponseBody
	public Object noticeLeftSave(HttpSession session,@RequestParam(value="appid") String appid,@RequestParam(value="wid")String wid,@RequestParam(value="title")String title,@RequestParam(value="content")String content) {
		String res= "1";
		UserMsg user = (UserMsg) session.getAttribute("UserMsg");
		if (user == null) {
			res = "-1";
		}
		OpGmtNoticeLeft  notice = new OpGmtNoticeLeft();
		notice.setAppId(appid);
		notice.setContent(content);
		notice.setCreateTime(new Date(System.currentTimeMillis()));
		notice.setTitle(title);
		notice.setWorldId(wid);
		String str = noticeLeftService.sendNoticLeft(notice);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("res", str);
		return map;
	}
}
