package com.gamecenter.controller.pay.wechat;

import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.Tools;
import com.gamecenter.common.pay.wechat.CommonUtil;
import com.gamecenter.common.pay.wechat.PayCommonUtil;
import com.gamecenter.common.pay.wechat.WeChatAPPUtils;
import com.gamecenter.common.pay.wechat.XmlUtils;
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
	@RequestMapping(value = "pay/{serverId}/unifiedorder", method = { RequestMethod.POST })
	private String generateOrderInfoByWeiXinPay(String orderId, String fprice, String openId, String inviteCode, @PathVariable String serverId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		boolean bCheck = false;
		int price = Integer.parseInt(fprice);
		double dPrice = price/100;
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
				}
				
				if (worldServer != null) {
					OpOssQlzPassport player = dataUpHandleService.getPassportByOpenid(openId);
					if (player != null) {
						bCheck = true;
					}
				}
			}
		}
		
		if (!bCheck) {//验证没有通过false
			StringBuffer weiXinVo = new StringBuffer();
			return weiXinVo.append("return_code=").append("FAIL").toString();
		}
		
		String attach = "" + openId + "|" + serverId;
		if (!ToolUtils.isStringNull(inviteCode)) {
			attach += "|" + inviteCode;
		}
		String nonceStr = CommonUtil.getNonceStr();
		String notify_url = WeChatAPPUtils.NOTIFY_URL;// 回调地址
		logger.error(":::" + request.getLocalAddr());
		SortedMap<String, String> signParams = new TreeMap<String, String>();
		signParams.put("appid", WeChatAPPUtils.APP_ID);// app_id
		signParams.put("body", "商品");// 商品参数信息
		signParams.put("mch_id", WeChatAPPUtils.MCHID);// 微信商户账号
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
		String result = CommonUtil.httpsRequest(WeChatAPPUtils.UNIFIED_ORDER_URL, "POST", requestXml);
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
			signParam.put("appid", WeChatAPPUtils.APP_ID);// app_id
			signParam.put("partnerid", WeChatAPPUtils.MCHID);// 微信商户账号
			signParam.put("prepayid", prepay_id);// 预付订单id
			signParam.put("package", "Sign=WXPay");// 默认sign=WXPay
			signParam.put("noncestr", nonceStr);// 自定义不重复的长度不长于32位
			signParam.put("timestamp", seconds);// 北京时间时间戳
			String signAgain = PayCommonUtil.createSign("UTF-8", signParam);// 再次生成签名
			signParams.put("sign", signAgain);
			weiXinVo.append("&appid=").append(WeChatAPPUtils.APP_ID).append("&partnerid=").append(WeChatAPPUtils.MCHID).append("&prepayid=").append(prepay_id).append("&package=Sign=WXPay").append("&noncestr=").append(nonceStr).append("&timestamp=").append(seconds).append("&sign=").append(signAgain);// 拼接参数返回给移动端
			
		} else {
		
		}
		
		return weiXinVo.toString();
		
	}
	
	// 通知处理类
	@SuppressWarnings("unused")
	@RequestMapping(value = "/pay/wechat/return", produces = "text/html;charset=UTF-8", method = { RequestMethod.POST })
	public String returnmsg(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// 解析结果存储在HashMap
		Map<String, String> map = new HashMap<String, String>();
		InputStream inputStream = request.getInputStream();
		
		// 读取输入流
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		// 得到xml根元素
		Element root = document.getRootElement();
		// 得到根元素的所有子节点
		List<Element> elementList = root.elements();
		
		// 遍历所有子节点
		for (Element e : elementList) {
			map.put(e.getName(), e.getText());
		}
		// 释放资源
		inputStream.close();
		inputStream = null;
		String json = JSON.toJSONString(map);
		
		// JSONObject json = JSONObject.fromObject(map);
		
		System.out.println("===消息通知的结果：" + json.toString() + "==========================");
		System.out.println("===return_code===" + map.get("return_code"));
		System.out.println("===return_msg===" + map.get("return_msg"));
		System.out.println("===out_trade_no===" + map.get("out_trade_no"));
		
		// 验证签名的过程
		
		// 判断是否支付成功
		if (map.get("return_code").equals("SUCCESS")) {// 这儿要修改
			
			/**
			 * 支付成功之后的业务处理
			 */
			SortedMap<String, String> parameters = new TreeMap<String, String>();
			parameters.put("appid", map.get("appid"));
			parameters.put("attach", map.get("attach"));
			parameters.put("bank_type", map.get("bank_type"));
			parameters.put("cash_fee", map.get("cash_fee"));
			parameters.put("fee_type", map.get("fee_type"));
			parameters.put("is_subscribe", map.get("is_subscribe"));
			parameters.put("mch_id", map.get("mch_id"));
			parameters.put("nonce_str", map.get("nonce_str"));
			parameters.put("openid", map.get("openid"));
			parameters.put("out_trade_no", map.get("out_trade_no"));
			parameters.put("result_code", map.get("result_code"));
			parameters.put("return_code", map.get("return_code"));
			parameters.put("time_end", map.get("time_end"));
			parameters.put("total_fee", map.get("total_fee"));
			parameters.put("trade_type", map.get("trade_type"));
			parameters.put("transaction_id", map.get("transaction_id"));
			
			// 反校验签名
			String sign = PayCommonUtil.createSign("UTF-8", parameters);
			
			if (sign.equals(map.get("sign"))) {
				double dPrice = Double.parseDouble(String.valueOf(map.get("total_fee"))) / 100;
				OpShop goods = agentShopService.findShopGoodsByPrice(dPrice, 0);
				SortedMap<String, String> returnMap = new TreeMap<String, String>();
				if (goods != null) {
					
					int gold = goods.getGift() + goods.getNum();
					// 加入到玩家A账号
					
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
				
				return PayCommonUtil.getRequestXml(returnMap);
				
			} else {
				SortedMap<String, String> returnMap = new TreeMap<String, String>();
				returnMap.put("return_code", "FAIL");
				logger.error("返回结果通知::签名失败" + map.get("attach"));
				return PayCommonUtil.getRequestXml(returnMap);
			}
			
		} else {
			SortedMap<String, String> returnMap = new TreeMap<String, String>();
			returnMap.put("return_code", "FAIL");
			logger.error("返回结果通知::return_code fail" + map.get("attach"));
			return PayCommonUtil.getRequestXml(returnMap);
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
		agentRechargeService.insert(pay);
	}
}
