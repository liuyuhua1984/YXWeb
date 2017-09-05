
package com.gamecenter.api.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gamecenter.api.service.ApiService;
import com.gamecenter.common.MD5;
import com.gamecenter.qqsdk.service.RunLog;

/** 
 * ClassName:TestApiController <br/> 
 * Function: TODO (测试充值). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年6月7日 下午4:05:32 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
@Controller
public class TestApiController {
	@Autowired
	private ApiService apiService;
	
	/**
	 * 充值接口
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/test/recharge")
	@ResponseBody
	public Object recharge(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		RunLog.payLog.info("充值请求...");
		
		int res = 0;
		String msg = "";
		// 验证IP
		String ip = request.getRemoteAddr();
//		if (serverIps.size() > 0 && !serverIps.contains(ip)) {
//			res = 8;
//			msg = "无效IP";
//			RunLog.payLog.info("ip不合法（" + ip + "）");
//		} else {
			// 参数验证
			String passport = "", flag = "", billno = "";
			int sid = 0, time = 0;
			int money = 0;
//			try {
				passport = request.getParameter("passport");
				String appId = request.getParameter("appid");
//				if (passport == null || passport.length() > 60) {
//					throw new Exception("passport error");
//				}
				sid = Integer.parseInt(request.getParameter("sid"));
				money = Integer.parseInt(request.getParameter("money"));
//				if (money <= 0) {
//					throw new Exception("money error");
//				}
				billno = request.getParameter("billno");
//				if (billno == null || billno.length() > 60) {
//					throw new Exception("billno error");
//				}
				time = Integer.parseInt(request.getParameter("time"));
				// if (System.currentTimeMillis() / 1000 - time > 60) {
				// throw new Exception("time error");
				// }
//				
//				flag = request.getParameter("flag");
//			} catch (Exception e) {
//				e.printStackTrace();
//				res = 3;
//				msg = "数据异常";
//				RunLog.payLog.info("参数验证异常：" + e.toString());
//			}
			
//			// 签名验证
//			if (res == 0) {
//				String sig = MD5.encodeMD5("billno=" + billno + "&key=" + key + "&money=" + money + "&passport=" + passport + "&sid=" + sid + "&time=" + time);
//				if (sig.equals(flag)) {
//					res = 1;
//				} else {
//					RunLog.logDao.info("参数校验错误:参数（billno=" + billno + "&key=" + key + "&money=" + money + "&passport=" + passport + "&sid=" + sid + "&time=" + time + "),flag:" + flag + ",官方sig：" + sig);
//					res = 9;
//					msg = "签名不正确";
//					RunLog.payLog.info("参数校验错误！");
//				}
//			}
				res = 1;
			// 执行充值
			if (res == 1) {
				res = apiService.recharge(appId,passport, billno, money, time, sid, flag);
				if (res == 1) {
					msg = "ok";
				} else if (res == 4) {
					msg = "数据已存在";
				} else {
					msg = "数据失败";
				}
				RunLog.payLog.info("充值处理:" + msg);
			}
//		}
		
		// 执行返回
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ret", res);
		map.put("msg", msg);
		map.put("data", "");
		return map;
	}
}
  