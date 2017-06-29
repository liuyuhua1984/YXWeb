package com.gamecenter.controller.gmt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class PlayerFeedBackController {
	
	@RequestMapping("/feedback")
	@ResponseBody
	public ModelMap playerFeedBack(HttpSession session, HttpServletRequest req){
		ModelMap map = new ModelMap();
		String openId = req.getParameter("openId");
		String content = req.getParameter("content");
		String serverId = req.getParameter("serverId");
		String phone = req.getParameter("phone");
		
		map.put("result", 1);
		return map;
	}
}
  