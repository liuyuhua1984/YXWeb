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
 * 公告 -- 循环公告列表 Created with IntelliJ IDEA. User: gsb Date: 14-4-24 Time: 下午5:33 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gmt/notice/cyclelist")
public class Notice_cyclelist_Controller {
	
	@Resource
	GmtNoticeService gmtNoticeService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	/**
	 * 获取循环公告列表
	 * 
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView cycleNoticeList() {
		
		List<OpGmtNoticeCycle> list = gmtNoticeService.getCycleNoticeList("-1");
		for (OpGmtNoticeCycle obj : list) {
			OpGameapp opGameapp = appService.getByAppId(obj.getAppid());
			if (opGameapp != null)
				obj.setAppname(opGameapp.getAppname());
			OpGameworld opGameworld = worldService.getWorldByWid(Integer.parseInt(obj.getWorldid()));
			if (opGameworld != null)
				obj.setWorldname(opGameworld.getWname());
			
			// 回去最近发送时间
			if (obj.getStatus().equals("1") && SendNoticeCycle.cycleNotices.get(obj.getDid()) != null) {
				obj.setOpttime(SendNoticeCycle.cycleNotices.get(obj.getDid()).getOpttime());
			}
			
			if (obj.getStatus().equals("1")) {
				obj.setStatus("运行中");
			} else {
				obj.setStatus("已停止");
			}
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/gmTools/noticCycleList");
		modelAndView.addObject("lists", list);
		return modelAndView;
	}
	
	/**
	 * 控制循环公告
	 * 
	 * @param dids
	 * @param opttype 操作类型 ：stop start del
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/optCycle", method = RequestMethod.POST)
	@ResponseBody
	public Object stopCycleNotic(@RequestParam(value = "dids") String dids, @RequestParam(value = "opttype") String opttype, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		String res = "-99";
		
		UserMsg user = (UserMsg) session.getAttribute("UserMsg");
		if (user == null) {
			res = "你需要登陆";
		} else {
			if (opttype.equals("stop")) {
				res = gmtNoticeService.stopCycleNotic(dids) + "";
			} else if (opttype.equals("start")) {
				res = gmtNoticeService.startCycleNotic(dids) + "";
			} else if (opttype.equals("del")) {
				res = gmtNoticeService.del(dids) + "";
			} else {
				res = "-1";
			}
		}
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
	}
	
}
