package com.gamecenter.controller.sysmanage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.sysmanage.ModuleService;
import com.gamecenter.service.sysmanage.PermitService;

/**
 * 权限过滤 Created by IntelliJ IDEA. User: Administrator Date: 11-8-16 Time: 上午11:32 To change this template use File | Settings | File Templates.
 */
public class AuthorityFilter implements Filter {
	@Resource
	PermitService permitService;
	
	private String name;
	
	private static boolean isOpen = true;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.print("init");
	}
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) servletResponse;
		HttpServletRequest req = (HttpServletRequest) servletRequest;
		String UrlStr = req.getRequestURI();
		HttpSession session = req.getSession();
		
		// 登陆验证
		if (session.getAttribute("UserMsg") == null && session.getAttribute("AgentUser") == null ) {
			
			String path = req.getContextPath();
			String basePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + path + "/";
			
			String url = basePath + "loginOut/page";
			((HttpServletResponse) servletResponse).sendRedirect(url);
			return;
		}
	
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		if (userMsg != null && !userMsg.getPassport().equals("admin")) { // admin时绕开权限验证
			// 权限验证
			if ((ModuleService.modules.get(UrlStr) != null || ModuleService.modules.get(UrlStr.substring(0, UrlStr.lastIndexOf("/"))) != null) && session.getAttribute("UserMsg") != null) {
				// 获取动作码
				String actionCode = "";
				if (ModuleService.modules.get(UrlStr) != null) {
					actionCode = "see";
				} else {
					actionCode = UrlStr.substring(UrlStr.lastIndexOf("/") + 1);
					UrlStr = UrlStr.substring(0, UrlStr.lastIndexOf("/"));
				}
				
				// 校验对应模块的动作码
				boolean isOk = false;
				if (!(actionCode == null || actionCode.equals(""))) {
					isOk = permitService.checkUserPermit(UrlStr, actionCode, (int)userMsg.getUid());
				}
				if (!isOk) {
					// 没有权限的
					PrintWriter out = resp.getWriter();
					out.print("-100");
					out.flush();
					return;
				}
			}
		}
		
		filterChain.doFilter(servletRequest, servletResponse);
	}
	
	public void destroy() {
		// To change body of implemented methods use File | Settings | File Templates.
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * 获取session
	 * 
	 * @param request
	 * @return
	 */
	public static String getCookie(HttpServletRequest request) {
		String msg = null;
		Cookie cookies[] = request.getCookies();
		Cookie sCookie = null;
		String svalue = null;
		String sname = null;
		
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				sCookie = cookies[i];
				svalue = sCookie.getValue();
				sname = sCookie.getName();
				
				if (sname.equals("UID") && svalue != null) {
					msg = svalue;
					break;
				}
				
			}
		}
		return msg;
	}
	
	public static void delCookie(HttpServletRequest request, HttpServletResponse response) {
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				String sp = cookies[i].getName();
				String value = "";
				if (sp.equals("UID")) {
					
					Cookie newCookie = new Cookie("UID", null); // 假如要删除名称为username的Cookie
					
					newCookie.setMaxAge(0); // 立即删除型
					// newCookie.setDomain("juugoo.com"); //设置域名
					
					newCookie.setPath("/"); // 项目所有目录均有效，这句很关键，否则不敢保证删除
					
					response.addCookie(newCookie); // 重新写入，将覆盖之前的
					
					System.out.print("删除了cookie：" + sp + ",,值：" + value);
				}
			}
		}
	}
	
	public static void delAgentCookie(HttpServletRequest request, HttpServletResponse response) {
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				String sp = cookies[i].getName();
				String value = "";
				if (sp.equals("UID_AGENT")) {
					
					Cookie newCookie = new Cookie("UID_AGENT", null); // 假如要删除名称为username的Cookie
					
					newCookie.setMaxAge(0); // 立即删除型
					// newCookie.setDomain("juugoo.com"); //设置域名
					
					newCookie.setPath("/"); // 项目所有目录均有效，这句很关键，否则不敢保证删除
					
					response.addCookie(newCookie); // 重新写入，将覆盖之前的
					
					System.out.print("删除了cookie：" + sp + ",,值：" + value);
				}
			}
		}
	}
}
