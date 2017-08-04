package com.gamecenter.controller.pay.alipay;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.gamecenter.alipay.AlipayConstants;
import com.gamecenter.alipay.internal.util.AlipaySignature;
import com.gamecenter.common.IdGenerateUtils;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.pay.alipay.AlipayUtil;
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
 * ClassName:AliPayController <br/>
 * Function: TODO (支付宝支付). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年8月3日 下午5:09:01 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/alipay/")
public class AliPayController extends BaseController {
	
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
	 * 统一收单交易支付接口
	 * 
	 * @param request
	 * @param response
	 * @param cashnum 支付金额
	 * @param mercid 商品id
	 * @param callback
	 */
	@RequestMapping(value = "{serverId}/pay", method = RequestMethod.POST)
	public void orderPay(HttpServletRequest request, HttpServletResponse response, String fprice, String openId, String inviteCode, @PathVariable String serverId) throws Exception {
		logger.info("[/order/pay]");
		PrintWriter write = response.getWriter();
		boolean bCheck = false;
		double dPrice = Double.parseDouble(fprice);
		// double dPrice = ((double) price) / 100;
		int gold = 0;
		OpOssQlzPassport player = null;
		OpAgentList agent = null;
		double fetchMoneyRate = 0;
		OpShop goods = agentShopService.findShopGoodsByPrice(dPrice, 0);
		
		if (goods != null) {
			gold = goods.getGift() + goods.getNum();
			
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
			
			OpAgentConfig agentConfig = agentConfigService.findById(1);
			if (agentConfig != null && agentConfig.getOneLevel() != null) {
				fetchMoneyRate = Double.parseDouble(agentConfig.getOneLevel());
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
					player = dataUpHandleService.getPassportByOpenid(openId);
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
		
		Map<String, String> param = new HashMap<>();
		// 公共请求参数
		param.put("app_id", AlipayUtil.ALIPAY_APPID);// 商户订单号
		param.put("method", "alipay.trade.app.pay");// 交易金额
		param.put("format", AlipayConstants.FORMAT_JSON);
		param.put("charset", AlipayConstants.CHARSET_UTF8);
		param.put("timestamp", ToolUtils.dateFormat("yyyy-MM-dd HH:mm:ss", new Date()));// "yyyy-MM-dd HH:mm:ss"
		
		param.put("version", "1.0");
		param.put("notify_url", AlipayUtil.NOTIFY_URL); // 支付宝服务器主动通知商户服务
		param.put("sign_type", AlipayConstants.SIGN_TYPE_RSA);
		String orderId = String.valueOf(IdGenerateUtils.makeId());
		Map<String, Object> pcont = new HashMap<>();
		// 支付业务请求参数
		pcont.put("out_trade_no", orderId); // 商户订单号
		pcont.put("total_amount", String.valueOf(dPrice));// 交易金额
		pcont.put("subject", "商品"); // 订单标题
		pcont.put("body", "虚拟商品");// 对交易或商品的描述
		pcont.put("product_code", "QUICK_MSECURITY_PAY");// 销售产品码
		
		param.put("biz_content", JSON.toJSONString(pcont)); // 业务请求参数 不需要对json字符串转义
		// Map<String, String> payMap = new HashMap<>();
		try {
			
			param.put("sign", AlipaySignature.rsaSign(param, AlipayUtil.APP_PRIVATE_KEY, "UTF-8")); // 业务请求参数
			
			addPlayerMoney(player, agent, gold, dPrice, orderId, (fetchMoneyRate * dPrice) / 100);
			
			StringBuilder builder = new StringBuilder();
			builder.append("return_code=").append("SUCCESS");
			builder.append("&orderStr=").append(AlipayUtil.getSignEncodeUrl(param, true));
			write.write(builder.toString());
			// payMap.put("orderStr", PayUtil.getSignEncodeUrl(param, true));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("下订单异常::", e);
			StringBuffer weiXinVo = new StringBuffer();
			write.write(weiXinVo.append("return_code=").append("FAIL").toString());
		}
		
	}
	
	/**
	 * 订单支付微信服务器异步通知
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/pay/notify", method = RequestMethod.POST)
	public void orderPayNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("[/order/pay/notify]");
		PrintWriter write = response.getWriter();
		// 获取到返回的所有参数 先判断是否交易成功trade_status 再做签名校验
		// 1、商户需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
		// 2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
		// 3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email），
		// 4、验证app_id是否为该商户本身。上述1、2、3、4有任何一个验证不通过，则表明本次通知是异常通知，务必忽略。在上述验证通过后商户必须根据支付宝不同类型的业务通知，正确的进行不同的业务处理，并且过滤重复的通知结果数据。在支付宝的业务通知中，只有交易通知状态为TRADE_SUCCESS或TRADE_FINISHED时，支付宝才会认定为买家付款成功。
		if ("TRADE_SUCCESS".equals(request.getParameter("trade_status")) || "TRADE_FINISHED".equals(request.getParameter("trade_status"))) {
			Enumeration<?> pNames = request.getParameterNames();
			Map<String, String> param = new HashMap<String, String>();
			try {
				while (pNames.hasMoreElements()) {
					String pName = (String) pNames.nextElement();
					param.put(pName, request.getParameter(pName));
				}
				
				boolean signVerified = AlipaySignature.rsaCheckV1(param, AlipayUtil.ALIPAY_PUBLIC_KEY, AlipayConstants.CHARSET_UTF8); // 校验签名是否正确
				if (signVerified) {
					// TODO 验签成功后
					// 按照支付结果异步通知中的描述，对支付结果中的业务内容进行1\2\3\4二次校验，校验成功后在response中返回success，校验失败返回failure
					String orderId = param.get("out_trade_no");
					OpAgentRecharge myRecharge = agentRechargeService.getOpAgentRechargeByOrder(orderId);
					if (myRecharge == null) {
						logger.info("订单支付失败：" + orderId);
						write.write("failure");
						return;
					}
					
					boolean bCheck = false;
					double dPrice = myRecharge.getMoney();
					int gold = 0;
					OpOssQlzPassport player = null;
					OpAgentList agent = null;
					double fetchMoneyRate = 0;
					OpGameworld worldServer = null;
					
					OpShop goods = agentShopService.findShopGoodsByPrice(dPrice, 0);
					if (goods != null) {
						gold = goods.getGift() + goods.getNum();
						
						//OpAgentInviteCode agentInviteCode = null;
						// if (ToolUtils.isStringNull(myRecharge.get)) {
						// agent = agentListService.findByName(name)
						// } else {
						// agentInviteCode = agentInviteCodeService.findOpAgentInviteCodeByCode(inviteCode);
						// agent = agentListService.findById(agentInviteCode.getAgentId());
						// }
						
						agent = agentListService.findByName(myRecharge.getAgentName());
						
						if (agent.getRemainMoney() == null) {
							agent.setRemainMoney(0);
						}
						
						OpAgentConfig agentConfig = agentConfigService.findById(1);
						if (agentConfig != null && agentConfig.getOneLevel() != null) {
							fetchMoneyRate = Double.parseDouble(agentConfig.getOneLevel());
						}
						if (agent != null) {// && agent.getRemainMoney() >= gold在线冲值不要减money
							List<OpGameapp> appList = appService.getAppList();
							OpGameapp gameApp = appList.size() > 0 ? appList.get(0) : null;
							
							if (gameApp != null) {
								List<OpGameworld> worldList = worldService.getWorldListByAppId(gameApp.getAppid());
								worldServer = worldList.size() > 0 ? worldList.get(0) : null;
							} else {
								logger.error("没有找到world::" + myRecharge.getName());
							}
							
							if (worldServer != null) {
								player = dataUpHandleService.getPassportByOpenid(myRecharge.getName());
								if (player != null) {
									bCheck = true;
								} else {
									logger.error("没有找到玩家::" + myRecharge.getName());
								}
							}
						}
					} else {
						logger.error(dPrice + ":没有找到商品::" + myRecharge.getName());
					}
					
					if (!bCheck) {
						logger.error("openid验证没有通过：" + JSON.toJSONString(param));
						write.write("failure");
						return;
					}
					
					int status = playerRechargeService.recharge(myRecharge.getName(), myRecharge.getTraderOrder(), dPrice, gold, (int) (System.currentTimeMillis() / 1000), worldServer.getWorldid(), "" + 1, worldServer);
					if (status == 1) {
						//addPlayerMoney(player, agent, gold, dPrice, myRecharge.getTraderOrder(), (fetchMoneyRate * dPrice) / 100);
						myRecharge.setFlag(1);
						agentRechargeService.update(myRecharge);
					} else {
						logger.error("游戏服务器验证没有通过：" + status);
						write.write("failure");
						return;
					}
					logger.info("订单支付成功：" + orderId);
					write.write("success");
				} else {
					logger.error("订单支付签名失败11：" + JSON.toJSONString(param));
					// TODO 验签失败则记录异常日志，并在response中返回failure.
					write.write("failure");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
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
	 * 预支付保存充值记录
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
		pay.setFlag(0);
		agentRechargeService.insert(pay);
	}
	
	
}
