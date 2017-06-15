package com.gamecenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 13-5-9 Time: 上午9:54 To change this template use File | Settings | File Templates.
 */
@Controller
public class MainController {
	
	public ModelAndView main() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/main");
		return modelAndView;
	}
	
	@RequestMapping("/")
	public ModelAndView main2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/index");
		return modelAndView;
	}
	
	@RequestMapping("/main")
	public ModelAndView getFooter() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/main");
		return modelAndView;
	}
	
	@RequestMapping("/main_agent")
	public ModelAndView getAgentFooter() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/main_agent");
		return modelAndView;
	}
	
	@RequestMapping("/headmsg")
	public ModelAndView headmsg() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/commons/headmsg");
		return modelAndView;
	}
	
	@RequestMapping("/head/agent")
	public ModelAndView headAgent() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/page/commons/HeadAgent");
		return modelAndView;
	}
	
	/**
	 * 头部页面
	 * 
	 * @return
	 */
	@RequestMapping("/top")
	public ModelAndView toppage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/top");
		return modelAndView;
	}
	
	/**
	 * 头部页面
	 * 
	 * @return
	 */
	@RequestMapping("/top_agent")
	public ModelAndView topAgentPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/top_agent");
		return modelAndView;
	}
	
	@RequestMapping("/buttom")
	public String getButtom(){
		return "/buttom";
	}
	
	@RequestMapping("/buttom_agent")
	public String getAgentButtom(){
		return "/buttom_agent";
	}
	
	@RequestMapping("/content")
	public String getContent(){
		return "content";
	}
	
	@RequestMapping("/content_agent")
	public String getAgentContent(){
		return "content_agent";
	}
}
