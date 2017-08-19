package com.gamecenter.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/** 
 * ClassName:GlobalExceptionResolver <br/> 
 * TODO:异常处理
 * Date:     2017年8月18日 上午10:38:32 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		 //向前台返回错误信息
	        ModelAndView modelAndView = new ModelAndView("/page/commons/error");
	        modelAndView.addObject("message", ex.getMessage());
	        //modelAndView.setViewName("/WEB-INF/jsp/error.jsp");
	        logger.error("有异常::",ex);
		return modelAndView;
	}

}
  