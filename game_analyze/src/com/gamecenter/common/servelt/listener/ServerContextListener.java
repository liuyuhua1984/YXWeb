package com.gamecenter.common.servelt.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.gamecenter.common.ServletPath;
import com.gamecenter.common.properties.WeChatConfig;

/**
 * ClassName: ServerContextListener <br/>
 * Function: TODO (). <br/>
 * Reason: TODO (). <br/>
 * date: 2016年12月5日 下午4:31:52 <br/>
 * 
 * @author lyh
 * @version
 */
public class ServerContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext sc = event.getServletContext();
		sc.setAttribute("path", sc.getContextPath());
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		// jsp上用法${path}/css/xx.css
		ServletContext sc = event.getServletContext();
		//String CONFIG_PATH = sc.getRealPath("/");
		ServletPath.PATH = sc.getRealPath("/");
		WeChatConfig.loadWeChatConfigConfig(ServletPath.PATH );
		sc.setAttribute("path", sc.getContextPath());
		System.out.println("进来了");
	}

}
