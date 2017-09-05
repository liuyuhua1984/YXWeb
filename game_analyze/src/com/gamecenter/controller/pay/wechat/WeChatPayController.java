package com.gamecenter.controller.pay.wechat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.game.protocol.gm.GmInviteCodeProtocolRequest;
import com.gamecenter.common.HttpClient;
import com.gamecenter.common.IdGenerateUtils;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.pay.wechat.CommonUtil;
import com.gamecenter.common.pay.wechat.PayCommonUtil;
import com.gamecenter.common.pay.wechat.XmlUtils;
import com.gamecenter.common.properties.WeChatConfig;
import com.gamecenter.controller.BaseController;
import com.gamecenter.model.OpAgentConfig;
import com.gamecenter.model.OpAgentInviteCode;
import com.gamecenter.model.OpAgentList;
import com.gamecenter.model.OpAgentRecharge;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.model.OpShop;
import com.gamecenter.service.agent.AgentConfigService;
import com.gamecenter.service.agent.AgentInviteCodeService;
import com.gamecenter.service.agent.AgentListService;
import com.gamecenter.service.agent.AgentRechargeService;
import com.gamecenter.service.agent.AgentShopService;
import com.gamecenter.service.agent.PlayerRechargeService;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.dataup.DataUpHandleService;
import com.gamecenter.service.task.InviteCodeTask;

/**
 * ClassName:WeChatPayController <br/>
 * Function: TODO (微信app支付). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年7月24日 上午10:57:49 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
public class WeChatPayController extends BaseController {
	
	/** 恩施公众号app **/
	public static final String ES_PUBLIC_APPID = "wx903640e0c1782e08";
	/** 恩施公众号app密钥 **/
	public static final String ES_PUBLIC_APPSECRET = "ab0e4cb4020bfd78e21b51ccc2d554b1";
	
	@Autowired
	private AgentRechargeService agentRechargeService;
	
	@Autowired
	private AgentInviteCodeService agentInviteCodeService;
	
	@Autowired
	private AgentShopService agentShopService;
	
	@Autowired
	private AgentListService agentListService;
	
	@Autowired
	private DataUpHandleService dataUpHandleService;
	
	@Autowired
	private PlayerRechargeService playerRechargeService;
	
	@Autowired
	private WorldService worldService;
	
	@Autowired
	private AppService appService;
	
	@Autowired
	private AgentConfigService agentConfigService;
	
	/**
	 * 重点：封装参数调用统一下单接口，生成prepay_id(预支付订单Id) 微信支付
	 * 
	 * @param orderId 订单编号
	 * @param actualPay 实际支付金额
	 * @return
	 */
	@RequestMapping(value = "/wechat/pay/{serverId}/unifiedorder", method = { RequestMethod.POST })
	private void generateOrderInfoByWeiXinPay(String fprice, String openId, String inviteCode, @PathVariable String serverId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PrintWriter write = response.getWriter();
		boolean bCheck = false;
		int price = Integer.parseInt(fprice);
		double dPrice = ((double) price) / 100;
		OpShop goods = agentShopService.findShopGoodsByPrice(dPrice, 0);
		SortedMap<String, String> returnMap = new TreeMap<String, String>();
		if (goods != null) {
			
			int gold = goods.getGift() + goods.getNum();
			OpAgentList agent = null;
			OpAgentInviteCode agentInviteCode = null;
			if (ToolUtils.isStringNull(inviteCode)) {
				agent = agentListService.findById(1);
			} else {
				agentInviteCode = agentInviteCodeService.findOpAgentInviteCodeByCode(inviteCode);
				agent = agentListService.findById(agentInviteCode.getAgentId());
			}
			
			if (agent.getRemainMoney() == null) {
				agent.setRemainMoney(0);
			}
			
			if (agent != null) {// && agent.getRemainMoney() >= gold在线冲值不要减money
				List<OpGameapp> appList = appService.getAppList();
				OpGameapp gameApp = appList.size() > 0 ? appList.get(0) : null;
				OpGameworld worldServer = null;
				if (gameApp != null) {
					List<OpGameworld> worldList = worldService.getWorldListByAppId(gameApp.getAppid());
					worldServer = worldList.size() > 0 ? worldList.get(0) : null;
				} else {
					logger.error("没有找到world::" + openId);
				}
				
				if (worldServer != null) {
					OpOssQlzPassport player = dataUpHandleService.getPassportByOpenid(openId);
					if (player != null) {
						bCheck = true;
					} else {
						logger.error("没有找到玩家::" + openId);
					}
				}
			}
		} else {
			logger.error(dPrice + ":没有找到商品::" + openId);
		}
		
		if (!bCheck) {// 验证没有通过false
			StringBuffer weiXinVo = new StringBuffer();
			write.write(weiXinVo.append("return_code=").append("FAIL").toString());
			return;
		}
		
		String orderId = String.valueOf(IdGenerateUtils.makeId());
		String attach = "" + openId + "|" + serverId;
		if (!ToolUtils.isStringNull(inviteCode)) {
			attach += "|" + inviteCode;
		}
		String nonceStr = CommonUtil.getNonceStr();
		String notify_url = WeChatConfig.NOTIFY_URL;// 回调地址
		logger.error(":::" + request.getLocalAddr());
		SortedMap<String, String> signParams = new TreeMap<String, String>();
		signParams.put("appid", WeChatConfig.APP_ID);// app_id
		signParams.put("body", "商品");// 商品参数信息
		signParams.put("mch_id", WeChatConfig.MCH_ID);// 微信商户账号
		signParams.put("nonce_str", nonceStr);// 32位不重复的编号
		signParams.put("notify_url", notify_url);// 回调页面
		signParams.put("out_trade_no", orderId);// 订单编号
		signParams.put("spbill_create_ip", request.getRemoteAddr());// 请求的实际ip地址
		signParams.put("total_fee", "" + (price));// 支付金额 单位为分
		signParams.put("trade_type", "APP");// 付款类型为APP
		signParams.put("attach", attach);
		String sign = PayCommonUtil.createSign("UTF-8", signParams);// 生成签名
		signParams.put("sign", sign);
		signParams.remove("key");// 调用统一下单无需key（商户应用密钥）
		String requestXml = PayCommonUtil.getRequestXml(signParams);// 生成Xml格式的字符串
		logger.error("requestXml:::" + requestXml);
		String result = CommonUtil.httpsRequest(WeChatConfig.UNIFIED_ORDER_URL, "POST", requestXml);
		// 以post请求的方式调用统一下单接口
		// （注：ConstantUtil.UNIFIED_ORDER_URL=https://api.mch.weixin.qq.com/pay/unifiedorder;）
		
		// 返回的result成功结果取出prepay_id：
		Map map = XmlUtils.doXMLParse(result);
		logger.error("统一订单号:::" + result);
		String return_code = (String) map.get("return_code");
		
		String prepay_id = null;
		if (return_code.equals("SUCCESS")) {
			prepay_id = (String) map.get("prepay_id");// 获取到prepay_id
		}
		
		StringBuffer weiXinVo = new StringBuffer();
		weiXinVo.append("return_code=").append(return_code);
		if (prepay_id != null) {
			long currentTimeMillis = System.currentTimeMillis();// 生成时间戳
			long second = currentTimeMillis / 1000L;// （转换成秒）
			String seconds = String.valueOf(second).substring(0, 10);// （截取前10位）
			SortedMap<String, String> signParam = new TreeMap<String, String>();
			signParam.put("appid", WeChatConfig.APP_ID);// app_id
			signParam.put("partnerid", WeChatConfig.MCH_ID);// 微信商户账号
			signParam.put("prepayid", prepay_id);// 预付订单id
			signParam.put("package", "Sign=WXPay");// 默认sign=WXPay
			signParam.put("noncestr", nonceStr);// 自定义不重复的长度不长于32位
			signParam.put("timestamp", seconds);// 北京时间时间戳
			String signAgain = PayCommonUtil.createSign("UTF-8", signParam);// 再次生成签名
			signParams.put("sign", signAgain);
			weiXinVo.append("&appid=").append(WeChatConfig.APP_ID).append("&partnerid=").append(WeChatConfig.MCH_ID).append("&prepayid=").append(prepay_id).append("&noncestr=").append(nonceStr).append("&timestamp=").append(seconds).append("&sign=").append(signAgain);// 拼接参数返回给移动端
			
		} else {
		
		}
		write.write(weiXinVo.toString());
		
	}
	
	// 通知处理类
	/**
	 * notifyUrlMsg:(). <br/>
	 * TODO().<br/>
	 * 支付结果通知
	 * 
	 * @author lyh
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	@RequestMapping(value = "/wechat/pay/notify/return", method = { RequestMethod.POST })
	public void notifyUrlMsg(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.error("===进来了没有!!!===");
		// 解析结果存储在HashMap
		InputStream inputStream = request.getInputStream();
		PrintWriter write = response.getWriter();
		// 读取输入流
		StringBuffer sb = new StringBuffer();
		String s = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
		while ((s = in.readLine()) != null) {
			sb.append(s);
		}
		
		// 释放资源
		inputStream.close();
		inputStream = null;
		in.close();
		String result = sb.toString();
		Map<String, String> map = XmlUtils.doXMLParse(result);
		
		String json = JSON.toJSONString(map);
		
		// JSONObject json = JSONObject.fromObject(map);
		
		logger.error(result + ":===消息通知的结果：" + "==========================");
		if (map != null) {
			logger.error("===return_code===" + map.get("return_code"));
			logger.error("===return_msg===" + map.get("return_msg"));
			logger.error("===out_trade_no===" + map.get("out_trade_no"));
		} else {
			map = new HashMap<String, String>();
		}
		// 验证签名的过程
		SortedMap<String, String> returnMap = new TreeMap<String, String>();
		// 判断是否支付成功
		if (map.get("return_code").equals("SUCCESS")) {// 这儿要修改
			
			/**
			 * 支付成功之后的业务处理
			 */
			boolean bVerify = verifyWeChatNotify(map);
			if (bVerify) {
				double dPrice = Double.parseDouble(String.valueOf(map.get("total_fee"))) / 100;
				OpShop goods = agentShopService.findShopGoodsByPrice(dPrice, 0);
				
				if (goods != null) {
					
					int gold = goods.getGift() + goods.getNum();
					String myDefined = String.valueOf(map.get("attach"));// 自定义字段
					String attach[] = ToolUtils.split(myDefined, "|");
					String inviteCode = null;
					String openId = null;
					if (attach.length > 2) {
						inviteCode = attach[2];
					}
					openId = attach[0];
					String serverId = attach[1];
					OpAgentList agent = null;
					OpAgentInviteCode agentInviteCode = null;
					if (ToolUtils.isStringNull(inviteCode)) {
						agent = agentListService.findById(1);
					} else {
						agentInviteCode = agentInviteCodeService.findOpAgentInviteCodeByCode(inviteCode);
						agent = agentListService.findById(agentInviteCode.getAgentId());
					}
					
					if (agent.getRemainMoney() == null) {
						agent.setRemainMoney(0);
					}
					
					if (agent != null) {// && agent.getRemainMoney() >= gold在线冲值不要减money
						List<OpGameapp> appList = appService.getAppList();
						OpGameapp gameApp = appList.size() > 0 ? appList.get(0) : null;
						OpGameworld worldServer = null;
						if (gameApp != null) {
							List<OpGameworld> worldList = worldService.getWorldListByAppId(gameApp.getAppid());
							worldServer = worldList.size() > 0 ? worldList.get(0) : null;
						}
						
						if (worldServer != null) {
							OpOssQlzPassport player = dataUpHandleService.getPassportByOpenid(openId);
							if (player != null) {
								//
								double fetchMoneyRate = 0;
								OpAgentConfig agentConfig = agentConfigService.findById(1);
								if (agentConfig != null && agentConfig.getOneLevel() != null) {
									fetchMoneyRate = Double.parseDouble(agentConfig.getOneLevel());
								}
								String trade = String.valueOf(map.get("out_trade_no"));
								int status = playerRechargeService.recharge(player.getOpenid(), trade, dPrice, gold, (int) (System.currentTimeMillis() / 1000), worldServer.getWorldid(), "" + 1, worldServer);
								if (status == 1) {
									addPlayerMoney(player, agent, gold, dPrice, trade, (fetchMoneyRate * dPrice) / 100);
									returnMap.put("return_code", "SUCCESS");
									logger.error("返回结果通知::成功" + map.get("attach"));
								} else {
									returnMap.put("return_code", "FAIL");
									logger.error("返回结果通知::没收连上服务器" + map.get("attach"));
								}
							} else {
								returnMap.put("return_code", "FAIL");
								logger.error("返回结果通知::玩家不存在" + map.get("attach"));
							}
						} else {
							returnMap.put("return_code", "FAIL");
							logger.error("返回结果通知::服务器不存在" + map.get("attach"));
						}
					} else {
						returnMap.put("return_code", "FAIL");
						logger.error("返回结果通知::玩代理不能充值" + map.get("attach"));
					}
				} else {
					returnMap.put("return_code", "FAIL");
					logger.error(dPrice + ":返回结果通知::玩商品不能充值" + map.get("attach"));
				}
				
				write.write(PayCommonUtil.getRequestXml(returnMap));
				
			} else {
				
				returnMap.put("return_code", "FAIL");
				logger.error("返回结果通知::签名失败" + map.get("attach"));
				write.write(PayCommonUtil.getRequestXml(returnMap));
			}
			
		} else {
			
			returnMap.put("return_code", "FAIL");
			logger.error("返回结果通知::return_code fail" + map.get("attach"));
			
		}
		write.write(PayCommonUtil.getRequestXml(returnMap));
	}
	
	/**
	 * verifyWeixinNotify:(). <br/>
	 * TODO().<br/>
	 * 验证微信
	 * 
	 * @author lyh
	 * @param map
	 * @return
	 */
	public boolean verifyWeChatNotify(Map<String, String> map) {
		SortedMap<String, String> parameterMap = new TreeMap<String, String>();
		String sign = (String) map.get("sign");
		for (Object keyValue : map.keySet()) {
			if (!keyValue.toString().equals("sign")) {
				parameterMap.put(keyValue.toString(), map.get(keyValue));
			}
			
		}
		String createSign = PayCommonUtil.createSign("UTF-8", parameterMap);
		if (createSign.equals(sign)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Transactional
	public void addPlayerMoney(OpOssQlzPassport player, OpAgentList parentAgent, int gold, double price, String staderOrder, double fetchMoney) {
		// parentAgent.setRemainMoney(parentAgent.getRemainMoney() - gold); 在线冲值不充值
		// agentListService.update(parentAgent);
		saveRecharge(parentAgent.getName(), 0, price, player.getRolename(), staderOrder, 0, fetchMoney);
	}
	
	/**
	 * saveRecharge:(). <br/>
	 * TODO().<br/>
	 * 保存充值记录
	 * 
	 * @author lyh
	 * @param agentName
	 * @param isAgent
	 * @param rmb
	 * @param rechageName
	 * @param traderOrder
	 * @param onlinePay
	 */
	public void saveRecharge(String agentName, int isAgent, double rmb, String rechageName, String traderOrder, int onlinePay, double fetchMoney) {
		OpAgentRecharge pay = new OpAgentRecharge();
		pay.setAgentName(agentName);
		pay.setIsAgent((byte) isAgent);
		pay.setMoney(rmb);
		pay.setName(rechageName);
		pay.setTraderOrder(traderOrder);
		pay.setOnlinePay(onlinePay);
		pay.setCreateTime(new Date(System.currentTimeMillis()));
		pay.setIsFetch(0);
		pay.setFetchMoney(fetchMoney);
		pay.setFlag(1);
		agentRechargeService.insert(pay);
	}
	
	/**
	 * playerUnbind:(). <br/>
	 * TODO().<br/>
	 * 在色众号里解除绑定
	 * 
	 * @author lyh
	 * @param httpSession
	 * @param request
	 */
	@RequestMapping(value = "/player/unbind")
	public void playerUnbind(HttpSession httpSession, HttpServletRequest request, HttpServletResponse response) {
		
		request.getRequestURL();
	
		// ES_PUBLIC_APPID
		
		// public function getopenid(){
		// $appid = $this->appId;
		// $secret = $this->appSecret;
		// $redirect_url = "http://".$_SERVER['HTTP_HOST']."/";
		// $openid = $_SESSION['openid'];
		// if(!$openid){
		// header("Location:https://open.weixin.qq.com/connect/oauth2/authorize?appid=$appid&redirect_uri=".urlencode($redirect_url)."&response_type=code&scope=snsapi_base&state=blinq#wechat_redirect");
		// $code_state =$_REQUEST;
		// $token = json_decode(file_get_contents("https://api.weixin.qq.com/sns/oauth2/access_token?appid=$appid&secret=$secret&code={$code_state['code']}&grant_type=authorization_code"), true);
		// $_SESSION['openid']=$token['openid'];
		// }
		//
		// return $token;
		// }
		
		// request.getRequestURL() http://localhost:8080/CarsiLogCenter_new/idpstat.jsp
		// request.getRequestURI() /CarsiLogCenter_new/idpstat.jsp
		// request.getContextPath()/CarsiLogCenter_new
		// request.getServletPath() /idpstat.jsp
		//
		// request.getQueryString()action=idp.sptopn
		
		String requestPath = request.getContextPath();
		String redirect_uri = request.getRequestURL().toString();
		int index = redirect_uri.indexOf(requestPath);
		if (index <= 0) {
			return;
		}
		String subRedirectUri = redirect_uri.substring(0, index + requestPath.length()) + "/player/code";
		
		try {

			String url = " https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + ES_PUBLIC_APPID + "&redirect_uri=" + URLEncoder.encode(subRedirectUri, "utf-8") + "&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect";
			response.sendRedirect(url);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * authCode:(). <br/>
	 * TODO().<br/>
	 * 
	 * 
	 * @author lyh
	 * @param httpSession
	 * @param request
	 */
	@RequestMapping(value = "/player/code")
	public ModelAndView authCode(HttpSession httpSession, HttpServletRequest request) {
		String code = request.getParameter("code");
		if (ToolUtils.isStringNull(code)) {
			logger.error("微信code获得失败");
		}
		 ModelAndView view = new ModelAndView("/page/commons/error");
		
//		access_token 网页授权接口调用凭证,注意：此access_token与基础支持的access_token不同 
//		expires_in access_token接口调用凭证超时时间，单位（秒）
//		refresh_token 用户刷新access_token
//		openid 用户唯一标识，请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID
//		scope 用户授权的作用域，使用逗号（,）分隔 
//		错误时微信会返回JSON数据包如下（示例为Code无效错误）: {"errcode":40029,"errmsg":"invalid code"
//		 }
		String tokenUrl = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + ES_PUBLIC_APPID + "&secret=" + ES_PUBLIC_APPSECRET + "&code=" + code + "&grant_type=authorization_code";
		JSONObject json = HttpClient.httpsRequest(tokenUrl, "GET", "");
		 String weOpenId = String.valueOf(json.get("openid"));
		if (!ToolUtils.isStringNull(weOpenId)){
			//查数据库的openId
			OpOssQlzPassport player = dataUpHandleService.getPassportByOpenid(weOpenId);
			
			if (player != null && (player.getInviteTime() == null || System.currentTimeMillis() >= player.getInviteTime().getTime())){
				GmInviteCodeProtocolRequest req = new GmInviteCodeProtocolRequest();
				req.setInviteCode("");
				req.setOpenId(weOpenId);
				if (player.getInviteTime() == null){
					player.setInviteTime(new Date(0));
				}else{
					 player.getInviteTime().setTime(0);
				}
				player.setInviteCode("");
				dataUpHandleService.updatePassport(player, "refresh");
				
				InviteCodeTask.inviteCodeList.add(req);
				 logger.error("player解绑成功");
				   view.addObject("message", "解绑成功");
			}else{
				 logger.error("player解绑失败");
				 view.addObject("message", "解绑失败,玩家不存在,或时间不足.");
			}
		}else{
			 int errorCode = json.getIntValue("errcode");
		                String errorMsg = json.getString("errmsg");
		                logger.error("获取网页授权凭证失败 errcode:{} errmsg:{}", errorCode, errorMsg);
		                view.addObject("message", "获取网页授权凭证失败::"+errorCode+"::"+errorMsg);
		}
		return view;
		
	}
}
