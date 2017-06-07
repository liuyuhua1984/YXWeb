package com.gamecenter.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gamecenter.common.MD5;
import com.gamecenter.common.http.HttpReq;
import com.gamecenter.common.packets.PassportMsg_response;
import com.gamecenter.parBean.Par_OperatorMsg;
import com.gamecenter.parBean.Par_role;
import com.gamecenter.service.ApiService;
import com.gamecenter.service.RunLog;

/**
 * 基础接口 Created with IntelliJ IDEA. User: gsb Date: 14-7-26 Time: 下午1:50 To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/api")
public class BaseApiController {
	
	@Resource
	ApiService apiService;
	// 通信key值
	public static String key = "";
	// 区服ID
	public static String worldid = "";
	// 合法IP
	public static List<String> serverIps = new ArrayList<String>();
	// 返回地址
	public static String pfUrl = "";
	// 内部通信key
	public static String insidekey = "";
	public static String rechargeUrl = "";
	// 游戏的配置
	public static String gameip = "127.0.0.1";
	public static String gameport = "8005";
	
	// 充值比例
	public static String rechargeRatio = "1:10";
	
	/**
	 * 数据初始化
	 */
	@PostConstruct
	public void init() {
		RunLog.logDao.info("等待数据初始化...");
		
		ResourceBundle bundle = PropertyResourceBundle.getBundle("runConfig");
		worldid = bundle.getString("worldid").trim();
		String appid = bundle.getString("appid").trim();
		String serverUrl = bundle.getString("serverUrl").trim();
		insidekey = bundle.getString("insidekey").trim();
		rechargeUrl = bundle.getString("rechargeUrl").trim();
		rechargeRatio = bundle.getString("rechargeRatio").trim();
		
		// 从服务器获取配置数据
		HashMap params = new HashMap<String, String>();
		params.put("appid", appid);
		params.put("worldid", worldid);
	        String flag = HttpReq.http(serverUrl, params);
		
		try {
			// 获取的信息解析
			Par_OperatorMsg par_operatorMsg = null;
			if (flag.length() > 0) {
				par_operatorMsg = JSON.parseObject(flag, Par_OperatorMsg.class);
			}
			if (par_operatorMsg != null) {
				key = par_operatorMsg.getAppkey();
				// IP初始化
				if (par_operatorMsg.getCheckip() != null && !par_operatorMsg.getCheckip().equals("")) {
					String[] ips = par_operatorMsg.getCheckip().split(",");
					for (String ip : ips) {
						serverIps.add(ip);
					}
				}
				pfUrl = par_operatorMsg.getPfurl();
				gameip = par_operatorMsg.getIp();
				gameport = par_operatorMsg.getPort();
				RunLog.logDao.info("数据：key:" + key + ",checkIp:" + par_operatorMsg.getCheckip() + ",pfurl:" + pfUrl);
			}
		} catch (Exception e) {
			flag = "-3";
			RunLog.logDao.error("初始化异常：", e);
		}
		
		RunLog.logDao.info("初始化完毕！");
	}
	
	/**
	 * 登陆接口
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "login")
	public ModelAndView login(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		RunLog.logDao.info("登陆请求...");
		int res = 0;
		// 参数验证
		String passport = "", flag = "";
		int sid = 0, time = 0, fcm = 0;
		try {
			passport = request.getParameter("passport");
			if (passport == null || passport.length() > 60) {
				throw new Exception("passport error");
			}
			sid = Integer.parseInt(request.getParameter("sid"));
			time = Integer.parseInt(request.getParameter("time"));
			// if (System.currentTimeMillis() / 1000 - time > 60) {
			// throw new Exception("time error");
			// }
			fcm = Integer.parseInt(request.getParameter("fcm"));
			if (fcm != 0 && fcm != 1 && fcm != 2) {
				throw new Exception("fcm error");
			}
			flag = request.getParameter("flag");
		} catch (Exception e) {
			e.printStackTrace();
			res = 3;
			RunLog.logDao.info("参数错误:" + e.toString());
		}
		
		// 签名验证
		if (res == 0) {
			String sig = MD5.encodeMD5("fcm=" + fcm + "&key=" + key + "&passport=" + passport + "&sid=" + sid + "&time=" + time);
			if (sig.equals(flag)) {
				res = 1;
			} else {
				RunLog.logDao.info("参数校验错误:参数（fcm=" + fcm + "&key=" + key + "&passport=" + passport + "&sid=" + sid + "&time=" + time + "),flag:" + flag + ",官方sig：" + sig);
			}
		}
		
		// 进入游戏
		ModelAndView modelAndView = new ModelAndView();
		if (res == 1) {
			modelAndView.setViewName("intoreq");
			modelAndView.addObject("passport", passport);
			modelAndView.addObject("worldid", worldid);
			modelAndView.addObject("fcm", fcm);
			RunLog.logDao.info("进入游戏...");
		} else {
			// 返回官网
			modelAndView.setViewName("/back");
			modelAndView.addObject("pfurl", pfUrl);
			RunLog.logDao.info("返回官网...");
		}
		return modelAndView;
	}
	
	/**
	 * 充值接口
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "recharge")
	@ResponseBody
	public Object recharge(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		RunLog.payLog.info("充值请求...");
		
		int res = 0;
		String msg = "";
		// 验证IP
		String ip = request.getRemoteAddr();
		if (serverIps.size() > 0 && !serverIps.contains(ip)) {
			res = 8;
			msg = "无效IP";
			RunLog.payLog.info("ip不合法（" + ip + "）");
		} else {
			// 参数验证
			String passport = "", flag = "", billno = "";
			int sid = 0, time = 0;
			int money = 0;
			try {
				passport = request.getParameter("passport");
				if (passport == null || passport.length() > 60) {
					throw new Exception("passport error");
				}
				sid = Integer.parseInt(request.getParameter("sid"));
				money = Integer.parseInt(request.getParameter("money"));
				if (money <= 0) {
					throw new Exception("money error");
				}
				billno = request.getParameter("billno");
				if (billno == null || billno.length() > 60) {
					throw new Exception("billno error");
				}
				time = Integer.parseInt(request.getParameter("time"));
				// if (System.currentTimeMillis() / 1000 - time > 60) {
				// throw new Exception("time error");
				// }
				
				flag = request.getParameter("flag");
			} catch (Exception e) {
				e.printStackTrace();
				res = 3;
				msg = "数据异常";
				RunLog.payLog.info("参数验证异常：" + e.toString());
			}
			
			// 签名验证
			if (res == 0) {
				String sig = MD5.encodeMD5("billno=" + billno + "&key=" + key + "&money=" + money + "&passport=" + passport + "&sid=" + sid + "&time=" + time);
				if (sig.equals(flag)) {
					res = 1;
				} else {
					RunLog.logDao.info("参数校验错误:参数（billno=" + billno + "&key=" + key + "&money=" + money + "&passport=" + passport + "&sid=" + sid + "&time=" + time + "),flag:" + flag + ",官方sig：" + sig);
					res = 9;
					msg = "签名不正确";
					RunLog.payLog.info("参数校验错误！");
				}
			}
			
			// 执行充值
			if (res == 1) {
				res = apiService.recharge(passport, billno, money, time, sid, flag);
				if (res == 1) {
					msg = "ok";
				} else if (res == 4) {
					msg = "数据已存在";
				} else {
					msg = "数据失败";
				}
				RunLog.payLog.info("充值处理:" + msg);
			}
		}
		
		// 执行返回
		Map map = new HashMap();
		map.put("ret", res);
		map.put("msg", msg);
		map.put("data", "");
		return map;
	}
	
	/**
	 * 核实账号是否存在
	 * 
	 * @param session
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "checkuser")
	@ResponseBody
	public Object checkuser(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		RunLog.logDao.info("核实账号是否存在...");
		int res = 0;
		// 参数验证
		String passport = "", flag = "";
		int sid = 0, time = 0;
		String msg = "";
		try {
			passport = request.getParameter("passport");
			if (passport == null || passport.length() > 60) {
				throw new Exception("passport error");
			}
			sid = Integer.parseInt(request.getParameter("sid"));
			time = Integer.parseInt(request.getParameter("time"));
			// if (System.currentTimeMillis() / 1000 - time > 60) {
			// throw new Exception("time error");
			// }
			flag = request.getParameter("flag");
		} catch (Exception e) {
			e.printStackTrace();
			res = 3;
			msg = "数据异常";
			RunLog.logDao.info(msg + e.toString());
		}
		
		// 签名验证
		if (res == 0) {
			String sig = MD5.encodeMD5("key=" + key + "&passport=" + passport + "&sid=" + sid + "&time=" + time);
			if (sig.equals(flag)) {
				res = 1;
			} else {
				res = 9;
				msg = "签名不正确";
				RunLog.logDao.info(msg);
			}
		}
		
		// 执行验证
		Par_role par_role = new Par_role();
		if (res == 1) {
			Object obj = apiService.checkUser(passport, sid);
			if (obj instanceof PassportMsg_response) {
				msg = "ok";
				res = 1;
				par_role.setLevel(((PassportMsg_response) obj).getGrade());
				par_role.setPassport(((PassportMsg_response) obj).getOpenid());
				par_role.setRolename(((PassportMsg_response) obj).getName());
				par_role.setGold(((PassportMsg_response) obj).getMoney());
				
			} else if (obj instanceof String) {
				if (obj.equals("5")) {
					msg = "数据不存在";
					res = 5;
				} else {
					msg = "数据失败";
					res = 2;
				}
			}
			RunLog.logDao.info("账号验证结果:" + msg);
		}
		
		// 执行返回
		Map map = new HashMap();
		map.put("ret", res);
		map.put("msg", msg);
		map.put("data", par_role);
		return map;
	}
	
}
