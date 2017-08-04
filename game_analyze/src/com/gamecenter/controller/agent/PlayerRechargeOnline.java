package com.gamecenter.controller.agent;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.Tools;
import com.gamecenter.common.encrypt.Base64;
import com.gamecenter.common.encrypt.SHA1;
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
 * ClassName:PlayerRechargeOnline <br/>
 * Function: TODO (付钱拉玩家在线充值). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年7月10日 上午10:29:27 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
public class PlayerRechargeOnline extends BaseController {
	public final static String FQL_APP_ID = "wQcbxDIh2tafTCXpCnlNIg";
	public final static String FQL_MD_KEY = "8BB418FCA8A480BC3E00365AE14148A2";
	public final static String FQL_RSA = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC8YcqjoN9TQ75LwxC0cO1ywbnqRXfvtGTsC9EFh0jtBDNp/jsOvWG0nNB9z3fY9ilRU7rs/AyQt+PTuDB+ZiF+Emq+UteNw5C1RPJpj20Cpkvyf/80C6NSZrWMZjvdo1zPKo0KRz0RvCnfBry6LZZ2hEgXr2n3nDld3liMoZIDhQIDAQAB";
	
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
	
	@RequestMapping(value = "/notify/{serverId}/pay")
	public void playerPay(@PathVariable int serverId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String msg = request.getParameter("msg");
		String resMsg = "fail";
		if (!"".equals(msg) && msg != null) {
			// logger.info(String.format("接收付钱拉通知内容 msg\n%s", msg));
			// 随机返回成功失败、测试使用
			String[] str = { "SUCCESS", "SUCCESS", "SUCCESS", "FAIL", "SUCCESS" };
			int random = (int) (Math.random() * 5);
			resMsg = str[random];
		} else {
			String requestStr = readReqStr(request);
			// logger.info(String.format("接收付钱拉通知内容\n%s", requestStr));
			try {
				@SuppressWarnings("unchecked")
				Map<String, Object> objMap = (Map<String, Object>) JSON.parse(requestStr);
				boolean flag = verify(objMap);
				if (flag) {
					
					logger.info("签名验证通过");
					String ret_code = String.valueOf(objMap.get("ret_code"));
					if (ret_code.equals("0000")) {
						double dPrice = Double.parseDouble(String.valueOf(objMap.get("amount"))) / 100;
						OpShop goods = agentShopService.findShopGoodsByPrice(dPrice, 0);
						if (goods != null) {
							
							int gold = goods.getGift() + goods.getNum();
							// 加入到玩家A账号
							
							String myDefined = String.valueOf(objMap.get("optional"));// 自定义字段
							Map<String, String> opMap = Tools.splitStringToMap(myDefined, "&", "=");
							String inviteCode = opMap.get("inviteCode");
							String openId = opMap.get("openId");
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
							
							if (agent != null ) {//&& agent.getRemainMoney() >= gold在线冲值不要减money
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
										String trade = String.valueOf(objMap.get("order_no"));
										int status = playerRechargeService.recharge(player.getOpenid(), trade, dPrice, gold, (int) (System.currentTimeMillis() / 1000), worldServer.getWorldid(), "" + 1, worldServer);
										if (status == 1) {
											resMsg = "success";
											addPlayerMoney(player, agent, gold, dPrice, trade, (fetchMoneyRate * dPrice) / 100);
										}
									} else {
										resMsg = "fail";
									}
								} else {
									resMsg = "fail";
								}
							} else {
								resMsg = "fail";
							}
						} else {
							resMsg = "fail";
						}
					} else {
						resMsg = "fail";
					}
				} else {
					resMsg = "fail";
				}
			} catch (Exception e) {
				logger.error("通知报文不合法，解析请求报文error!" + e);
			}
		}
		// logger.info("接收付钱拉通知后响应信息,"+resMsg);
		response.setContentType("text/html");
		response.getWriter().write(resMsg);
	}
	
	@Transactional
	public void addPlayerMoney(OpOssQlzPassport player, OpAgentList parentAgent, int gold, double price, String staderOrder, double fetchMoney) {
//		parentAgent.setRemainMoney(parentAgent.getRemainMoney() - gold); 在线冲值不充值
//		agentListService.update(parentAgent);
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
	
	public boolean verify(Map<String, Object> objMap) {
		String signType = String.valueOf(objMap.get("sign_type"));
		if (signType.equals("md5")) {
			return md5Verify(objMap);
		} else {
			return rsaVerify(objMap);
		}
		
	}
	
	/**
	 * 请求转成string
	 * 
	 * @param request
	 * @return
	 */
	private static String readReqStr(HttpServletRequest request) {
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			ServletInputStream is = request.getInputStream();
			//System.err.println("num::"+is.available());
			reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
			String line =null;
			//System.err.println("line::"+line);
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
			try {
				if (null != reader) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	/**
	 * 验证接收付钱拉通知签名入口
	 * 
	 * @param merch_id
	 * @param sign_type
	 * @param objMap
	 * @return
	 * @throws Exception
	 */
	private boolean rsaVerify(Map<String, ?> objMap) {
		
		boolean flag = false;
		// 若通知签名方式为RSA。则是使用付钱拉服务器私钥签名通知，应该使用付钱拉服务器公钥解密（公钥固定值）
		String signKey = FQL_RSA;// 需要商户自己修改
		try {
			String hexSign = String.valueOf(objMap.get("sign_info"));
			// 得到待签名数据
			Map<String, ?> filterMap = paraFilter(objMap);
			// String linkStr = createLinkString(filterMap);
			// 得到待签名数据
			String linkStr = createLinkString(filterMap);
			String sha1Data = SHA1.getDigestOfString(linkStr.getBytes("UTF-8"));
			// logger.debug("rsa.sha1Data:["+sha1Data+"]");
			
			PublicKey pubKey = getPublicKey(signKey);
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.DECRYPT_MODE, pubKey);
			ByteArrayOutputStream out = doFinal(cipher, hex2byte(hexSign), 128);
			// 字节数组转换为字符串
			String sign = byteArraytoHexString(out.toByteArray());
			// logger.debug("rsa.sign:["+sign+"]");
			if (sign.length() > sha1Data.length()) {
				sign = sign.substring(sign.length() - sha1Data.length());
				// logger.debug("rsa.subSign:["+sign+"]");
			}
			flag = sha1Data.equalsIgnoreCase(sign);
			
		} catch (Exception e) {
			// 验证通知签名信息error
		}
		return flag;
		
	}
	
	/**
	 * This method convert byte array to String
	 * 
	 * @author sgc
	 * @return String
	 * @param byte[] b,int bLen is :b' availability length
	 */
	private static String byteArraytoHexString(byte[] b) {
		int iLen = b.length;
		// 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
		StringBuffer sb = new StringBuffer(iLen * 2);
		for (int i = 0; i < iLen; i++) {
			int intTmp = b[i];
			// 把负数转换为正数
			while (intTmp < 0) {
				intTmp = intTmp + 256;
			}
			// 小于0F的数需要在前面补0
			if (intTmp < 16) {
				sb.append("0");
			}
			sb.append(Integer.toString(intTmp, 16));
		}
		return sb.toString().toUpperCase();
	}
	
	private static byte[] hex2byte(String hex) throws IllegalArgumentException {
		if (hex.length() % 2 != 0) {
			throw new IllegalArgumentException();
		}
		char[] arr = hex.toCharArray();
		byte[] b = new byte[hex.length() / 2];
		for (int i = 0, j = 0, l = hex.length(); i < l; i++, j++) {
			String swap = "" + arr[i++] + arr[i];
			int byteint = Integer.parseInt(swap, 16) & 0xFF;
			b[j] = new Integer(byteint).byteValue();
		}
		return b;
	}
	
	/**
	 * 除去数组中的空值和签名参数
	 * 
	 * @param sArray 签名参数组
	 * @return 去掉空值与签名参数后的新签名参数组
	 */
	private static Map<String, ?> paraFilter(Map<String, ?> sArray) {
		Map<String, Object> result = new HashMap<String, Object>();
		if ((sArray == null) || (sArray.size() <= 0)) {
			return result;
		}
		for (String key : sArray.keySet()) {
			Object value = sArray.get(key);
			if ((value == null) || value.equals("") || key.equalsIgnoreCase("sign_info") || key.equalsIgnoreCase("sign_type")) {
				continue;
			}
			if (value instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, ?> m = (Map<String, ?>) value;
				result.put(key, paraFilter(m));
			} else if (value instanceof List) {
				continue;// 不应包含多集合数据
			} else {
				result.put(key, value);
			}
		}
		return result;
	}
	
	/**
	 * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
	 * 
	 * @param params 需要排序并参与字符拼接的参数组
	 * @return 拼接后字符串
	 */
	private static String createLinkString(Map<String, ?> params) {
		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		StringBuffer prestr = new StringBuffer("");
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			Object o = params.get(key);
			String value = String.valueOf(o);
			if (o instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, ?> m = (Map<String, ?>) o;
				value = "{" + createLinkString(m) + "}";
			}
			
			if (i == (keys.size() - 1)) {// 拼接时，不包括最后一个&字符
				prestr.append(key + "=" + value);
			} else {
				prestr.append(key + "=" + value + "&");
			}
		}
		return prestr.toString();
	}
	
	/**
	 * 得到公钥
	 * 
	 * @param key 密钥字符串（经过base64编码）
	 * @throws Exception
	 */
	private static PublicKey getPublicKey(String pubKey) throws Exception {
		byte[] pubkeyBytes = Base64.decode(pubKey);
		X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(pubkeyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		return keyFactory.generatePublic(pubKeySpec);
	}
	
	/**
	 * 加密解密处理 </br>
	 * 加解密的字节大小最多是128，将需要解密的内容，按128位拆开解密
	 * 
	 * @param cipher
	 * @param content
	 * @return
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws IOException
	 */
	private static ByteArrayOutputStream doFinal(Cipher cipher, byte[] content, int maxLen) throws IllegalBlockSizeException, BadPaddingException, IOException {
		InputStream ins = new ByteArrayInputStream(content);
		ByteArrayOutputStream writer = new ByteArrayOutputStream();
		byte[] buf = new byte[maxLen];
		int bufl;
		while ((bufl = ins.read(buf)) != -1) {
			byte[] block = null;
			if (buf.length == bufl) {
				block = buf;
			} else {
				block = new byte[bufl];
				System.arraycopy(buf, 0, block, 0, bufl);
			}
			byte[] eData = cipher.doFinal(block);
			writer.write(eData);
		}
		return writer;
	}
	
	/**
	 * 验证接收付钱拉通知签名入口
	 * 
	 * @param merch_id
	 * @param sign_type
	 * @param objMap
	 * @return
	 * @throws Exception
	 */
	public boolean md5Verify(Map<String, ?> objMap) {
		boolean flag = false;
		String signKey = FQL_MD_KEY;
		try {
			String hexSign = String.valueOf(objMap.get("sign_info"));
			// 得到待签名数据
			Map<String, ?> filterMap = paraFilter(objMap);
			String linkStr = createLinkString(filterMap);
			// 拼装md5串 md5.linkStr
			String templinkStr = linkStr + signKey;
			String md5Hex = DigestUtils.md5Hex(templinkStr.getBytes("UTF-8"));
			// 验证签名后数据是否相同
			flag = hexSign.equalsIgnoreCase(md5Hex);
		} catch (Exception e) {
			// 验证通知签名信息error
		}
		return flag;
		
	}
	
}
