package com.gamecenter.controller.sysmanage;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.cacheData.GlobleData;
import com.gamecenter.model.OaUser;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.agent.AgentListService;
import com.gamecenter.service.sysmanage.UserService;

/**
 * 账号登陆、登出控制 Created with IntelliJ IDEA. User: gsb Date: 14-4-28 Time: 下午2:50 To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/loginOut")
public class LoginOutController {
	// private Map<String,String[]> tokens = new HashMap<String,String[]>();
	
	@Resource
	UserService userService;
	
	@Resource
	private AgentListService agentService;
	
	/**
	 * 登陆页面
	 * 
	 * @return
	 */
	@RequestMapping("/page")
	public ModelAndView page(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/login");
		String token = System.currentTimeMillis() + "" + (int) (Math.random() * 1000);
		modelAndView.addObject("token", token);
		session.setAttribute("token", token);
		return modelAndView;
	}
	
	
	/**
	 * 登陆页面
	 * 
	 * @return
	 */
	@RequestMapping("/page/agent")
	public ModelAndView pageAgent(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/login_agent");
		String token = System.currentTimeMillis() + "" + (int) (Math.random() * 1000);
		modelAndView.addObject("token", token);
		session.setAttribute("token", token);
		return modelAndView;
	}
	
	/**
	 * 登陆验证
	 * 
	 * @param userName
	 * @param pwd
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	@ResponseBody
	public Object loginCheck(@RequestParam("userName") String userName, @RequestParam("pwd") String pwd, @RequestParam("token") String token, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String res = "-1";
		
		if (token != null && session.getAttribute("token") != null && token.equals(session.getAttribute("token").toString())) {
			
			// if (check == 1) {// 代理登录
			// OpAgentList agent = agentService.findByName(userName);
			// if (agent != null) {
			// saveUser(agent.getId(), userName, agent.getAgentLevel()+"代理", response, session);
			// res = "1";
			// }
			// } else {
			int num = userService.validateUser(userName, pwd, request.getLocalAddr());
			if (num > 0) {
				OaUser oaUser = userService.getUser(num);
				// 写cookie
				// String cookieName = "UID";
				// Cookie cookie = new Cookie(cookieName, oaUser.getUid() + "");
				// // cookie.setMaxAge(60*60*1); //设置过期时间,单位是秒,1小时
				// cookie.setPath("/");// 设置路径
				// response.addCookie(cookie);
				//
				// UserMsg userMsg = new UserMsg();
				// userMsg.setName(oaUser.getUname());
				// userMsg.setPassport(userName);
				// userMsg.setUid(oaUser.getUid());
				// // 全局缓存
				// GlobleData.users.put(oaUser.getUid() + "", userMsg);
				//
				// session.setAttribute("UserMsg", userMsg);
				// session.setAttribute("status", "1");
				
				saveUser(oaUser.getUid(), userName, oaUser.getUname(), response, session);
				res = "1";
			}
			// }
		} else {
			res = "-100";
			System.out.println("token验证失败...");
		}
		session.removeAttribute("token");
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
		
	}
	
	/**
	 * 登陆验证
	 * 
	 * @param userName
	 * @param pwd
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/check/agent", method = RequestMethod.POST)
	@ResponseBody
	public Object loginAgentCheck(@RequestParam("userName") String userName, @RequestParam("pwd") String pwd, @RequestParam("token") String token, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String res = "-1";
		
		if (token != null && session.getAttribute("token") != null && token.equals(session.getAttribute("token").toString())) {
			
			OpAgentList agent = agentService.findByName(userName);
			
			if (agent != null) {
				saveAgentUser(agent.getId(), userName,agent.getAgentLevel(), response, session);
				res = "1";
			}
			
		} else {
			res = "-100";
			System.out.println("token验证失败...");
		}
		session.removeAttribute("token");
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("res", res);
		return modelMap;
		
	}
	
	
	public void saveAgentUser(long uid, String userName,int lv,HttpServletResponse response, HttpSession session) {
		String cookieName = "UID_AGENT";
		Cookie cookie = new Cookie(cookieName, uid + "");
		// cookie.setMaxAge(60*60*1); //设置过期时间,单位是秒,1小时
		cookie.setPath("/");// 设置路径
		response.addCookie(cookie);
		
		AgentUser userMsg = new AgentUser();
		userMsg.setAgentName(userName);
		userMsg.setId(uid);
		userMsg.setLevel(lv);
		
		session.setAttribute("AgentUser", userMsg);
		session.setAttribute("status", "1");
	}
	
	public void saveUser(long uid, String userName, String uName, HttpServletResponse response, HttpSession session) {
		String cookieName = "UID";
		Cookie cookie = new Cookie(cookieName, uid + "");
		// cookie.setMaxAge(60*60*1); //设置过期时间,单位是秒,1小时
		cookie.setPath("/");// 设置路径
		response.addCookie(cookie);
		
		UserMsg userMsg = new UserMsg();
		userMsg.setName(uName);
		
		userMsg.setPassport(userName);
		userMsg.setUid(uid);
		// 全局缓存
		GlobleData.users.put(uid + "", userMsg);
		
		session.setAttribute("UserMsg", userMsg);
		session.setAttribute("status", "1");
	}
	
	@RequestMapping(value = "/out", method = RequestMethod.GET)
	public ModelAndView loginOut(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String uid = AuthorityFilter.getCookie(request);
		// 清除缓存 cookie
		AuthorityFilter.delCookie(request, response);
		// 全局缓存
		if (uid != null)
			GlobleData.users.remove(uid);
		// 清除session
		session.removeAttribute("UserMsg");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("act", 1);
		modelAndView.setViewName("/login");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/out/agent", method = RequestMethod.GET)
	public ModelAndView loginAgentOut(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		// 清除缓存 cookie
		AuthorityFilter.delAgentCookie(request, response);
		// 全局缓存
	
		// 清除session
		session.removeAttribute("AgentUser");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("act_agent", 1);
		modelAndView.setViewName("/login_agent");
		
		return modelAndView;
	}
	
}
