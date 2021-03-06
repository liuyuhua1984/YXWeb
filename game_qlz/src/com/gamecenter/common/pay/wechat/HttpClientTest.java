package com.gamecenter.common.pay.wechat;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gamecenter.common.MD5;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.pay.wechat.PayCommonUtil;
import com.gamecenter.common.pay.wechat.WeChatAPPUtils;

/** 
 * ClassName:HttpClientTest <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年7月25日 下午3:15:31 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class HttpClientTest {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	@Test
	public void test() {
//		<xml>
//		  <appid><![CDATA[wx2421b1c4370ec43b]]></appid>
//		  <attach><![CDATA[支付测试]]></attach>
//		  <bank_type><![CDATA[CFT]]></bank_type>
//		  <fee_type><![CDATA[CNY]]></fee_type>
//		  <is_subscribe><![CDATA[Y]]></is_subscribe>
//		  <mch_id><![CDATA[10000100]]></mch_id>
//		  <nonce_str><![CDATA[5d2b6c2a8db53831f7eda20af46e531c]]></nonce_str>
//		  <openid><![CDATA[oUpF8uMEb4qRXf22hE3X68TekukE]]></openid>
//		  <out_trade_no><![CDATA[1409811653]]></out_trade_no>
//		  <result_code><![CDATA[SUCCESS]]></result_code>
//		  <return_code><![CDATA[SUCCESS]]></return_code>
//		  <sign><![CDATA[B552ED6B279343CB493C5DD0D78AB241]]></sign>
//		  <sub_mch_id><![CDATA[10000100]]></sub_mch_id>
//		  <time_end><![CDATA[20140903131540]]></time_end>
//		  <total_fee>1</total_fee>
//		  <trade_type><![CDATA[JSAPI]]></trade_type>
//		  <transaction_id><![CDATA[1004400740201409030005092168]]></transaction_id>
//		</xml>
		
		String nonceStr = PayCommonUtil.getNonceStr();
		String attach = "321654|1001";
		SortedMap<String, String> signParams = new TreeMap<String, String>();
		signParams.put("appid", WeChatAPPUtils.APP_ID);// app_id
		signParams.put("mch_id", WeChatAPPUtils.MCHID);// 微信商户账号
		signParams.put("nonce_str", nonceStr);// 32位不重复的编号
		signParams.put("bank_type", "CFT");// 回调页面
		signParams.put("fee_type", "CNY");// 回调页面
		signParams.put("out_trade_no", "11111111111");// 订单编号
		signParams.put("return_code", "SUCCESS");// 请求的实际ip地址
		signParams.put("total_fee", "" +40000);// 支付金额 单位为分
		signParams.put("trade_type", "APP");// 付款类型为APP
		signParams.put("attach", attach);
		signParams.put("openid","oUpF8uMEb4qRXf22hE3X68TekukE");
		signParams.put("transaction_id","1004400740201409030005092168");
		signParams.put("time_end","20140903131540"
			+ "");
		String sign = PayCommonUtil.createSign("UTF-8", signParams);// 生成签名
		signParams.put("sign", sign);
		signParams.remove("key");// 调用统一下单无需key（商户应用密钥）
		String requestXml = PayCommonUtil.getRequestXml(signParams);// 生成Xml格式的字符串
		logger.error("requestXml:::" + requestXml);
		String result;
		try {
			result = HttpClient.send(WeChatAPPUtils.NOTIFY_URL,  true,requestXml.getBytes("utf-8"));
			logger.error("ssss::"+result);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
	}
	/** 苹果支付 **/
	private static final String APPLE_KEY = "XXXXdeeeF#@@$@$!(*&^&#$WREQAPP";
	@Test
	public void testAppPay(){
		String openId = "123456";
		String price = ""+1;// 元
		String inviteCode = null;// 有就发没有就不发
		String receiptData = "ssssssseee";// 凭证
		String chooseEnv = ""+0;// 测试=0,正式环境=1
		//String sign = request.getParameter("sign");// md5大写
		/** 苹果支付 **/
		StringBuilder sb = new StringBuilder();
		sb.append("openId=").append(openId);
		sb.append("&fprice=").append(price);
		sb.append("&receiptData=").append(receiptData);
		sb.append("&chooseEnv=").append(chooseEnv);
		if (!ToolUtils.isStringNull(inviteCode)) {
			sb.append("&inviteCode=").append(inviteCode);
		}
		String str = sb.toString();
		
		sb.append("&key=").append(APPLE_KEY);
		
		String sign =MD5.encodeMD5(sb.toString()).toUpperCase();
		str +="&sign="+sign;
		String result;
		try {
			result = HttpClient.send("http://192.168.0.189:8090/game/apple/pay/1001/verify",  true,str.getBytes("utf-8"));
			logger.error("ssss::"+result);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
  