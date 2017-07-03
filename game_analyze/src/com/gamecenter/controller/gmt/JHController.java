package com.gamecenter.controller.gmt;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.parBean.UserMsg;

/**
 * ClassName:JHController <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年7月3日 下午6:47:40 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/gmt")
public class JHController {
	
	@RequestMapping("/jh/control")
	public ModelAndView jhCatList(HttpSession session) {
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long   userId = 0;
		if (userMsg != null) {
			userId = userMsg.getUid();
		}
		ModelAndView view = new ModelAndView("/page/gmTools/JHPlayer");
		return view;
	}
	
	@RequestMapping("/jh/cat")
	public ModelMap jhcat(HttpSession session,@RequestParam(value="name") String name){
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long   userId = 0;
		if (userMsg != null) {
			userId = userMsg.getUid();
		}
		ModelMap map = new ModelMap();
		//
	}
}
