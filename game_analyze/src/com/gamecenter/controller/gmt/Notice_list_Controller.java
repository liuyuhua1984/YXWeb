package com.gamecenter.controller.gmt;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtNotice;
import com.gamecenter.model.OpGmtNoticeCycle;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.parBean.vo.GmtSendNoticeBean;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmtServices.GmtNoticeService;
import com.gamecenter.service.task.SendNoticeCycle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公告 -- 公告列表 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/notice/list")
public class Notice_list_Controller {
	
	@Resource
	GmtNoticeService gmtNoticeService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 公告历史记录
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView list() {
		
		List<OpGmtNotice> list = gmtNoticeService.getNoticList();
		for (OpGmtNotice obj : list) {
			obj.setOptname("公告");
			obj.setAppname("热血七龙珠");
			obj.setWorldname("测试服");
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/noticMsgList");
		modelAndView.addObject("lists", list);
		return modelAndView;
	}
	
}
