package com.gamecenter.qqsdk.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.obj.PayReqObj;
import com.gamecenter.qqsdk.common.com.qq.open.SnsSigCheck;
import com.gamecenter.qqsdk.service.RunLog;
import com.gamecenter.qqsdk.service.tasks.PayHandle;

/**
 * 腾讯 支付网关 Created with IntelliJ IDEA. User: gsb Date: 14-5-5 Time: 上午11:50 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/tx")
public class TxPayController {
	/**
	 * 充值网关
	 * 
	 * @param reqObj
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/pay")
	@ResponseBody
	public Object page(PayReqObj reqObj, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		boolean checkSig = false;
		// sig验证
		try {
			checkSig = SnsSigCheck.verifySig("GET", "/tx/pay", reqObj.putHash(), PayHandle.appkey + "&", reqObj.getSig());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if (Long.parseLong(PayHandle.stoptime) > 0)
				Thread.sleep(Long.parseLong(PayHandle.stoptime));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (checkSig) {
			PayHandle.payReqObjs.add(reqObj);
		} else {
			RunLog.payLog.error("[注意]充值网关>sig验证异常");
		}
		
		// 返回结果
		int ret = 0;
		String msg = "";
		
		if (checkSig) {
			ret = 0;
			msg = "OK";
		} else {
			ret = 1;
			msg = "error system";
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ret", ret);
		map.put("msg", msg);
		return map;
	}
	
	/**
	 * 状态获取。。。。
	 * 
	 * @param act
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/msg")
	public ModelAndView msg(@RequestParam(value = "act") String act, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		if (act.equals("reku")) {
			modelAndView.addObject("handlenum", PayHandle.handleNum);
			modelAndView.addObject("errornum", PayHandle.errorNum);
			modelAndView.addObject("oknum", PayHandle.okNum);
			modelAndView.addObject("nownum", PayHandle.payReqObjs.size());
		}
		return modelAndView;
	}
}
