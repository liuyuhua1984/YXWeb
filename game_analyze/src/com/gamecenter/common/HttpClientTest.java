package com.gamecenter.common;

import java.io.UnsupportedEncodingException;
import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gamecenter.common.pay.wechat.CommonUtil;
import com.gamecenter.common.pay.wechat.PayCommonUtil;
import com.gamecenter.common.properties.WeChatConfig;

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
		String nonceStr = CommonUtil.getNonceStr();
		String attach = "321654|1001";
		SortedMap<String, String> signParams = new TreeMap<String, String>();
		signParams.put("appid", WeChatConfig.APP_ID);// app_id
		signParams.put("mch_id", WeChatConfig.MCH_ID);// 微信商户账号
		signParams.put("nonce_str", nonceStr);// 32位不重复的编号
		signParams.put("bank_type", "CFT");// 回调页面
		signParams.put("fee_type", "CNY");// 回调页面
		signParams.put("out_trade_no", "11111111111");// 订单编号
		signParams.put("result_code", "SUCCESS");// 请求的实际ip地址
		signParams.put("total_fee", "" +40000);// 支付金额 单位为分
		signParams.put("trade_type", "APP");// 付款类型为APP
		signParams.put("attach", attach);
		signParams.put("openid"," oUpF8uMEb4qRXf22hE3X68TekukE");
		signParams.put("transaction_id"," 1004400740201409030005092168");
		signParams.put("time_end"," 20140903131540"
			+ "");
		String sign = PayCommonUtil.createSign("UTF-8", signParams);// 生成签名
		signParams.put("sign", sign);
		signParams.remove("key");// 调用统一下单无需key（商户应用密钥）
		String requestXml = PayCommonUtil.getRequestXml(signParams);// 生成Xml格式的字符串
		logger.error("requestXml:::" + requestXml);
		String result;
		try {
			result = HttpClient.send(WeChatConfig.NOTIFY_URL,  true,requestXml.getBytes("utf-8"));
			logger.error("ssss::"+result);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
	}
	
}
  