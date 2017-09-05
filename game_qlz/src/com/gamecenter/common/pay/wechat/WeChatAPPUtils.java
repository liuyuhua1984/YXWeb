package com.gamecenter.common.pay.wechat;  
/** 
 * ClassName:WeChatAPPUtils <br/> 
 * Function: TODO (). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年7月24日 上午11:44:37 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class WeChatAPPUtils {
	/** APPID：绑定支付的APPID（必须配置，开户邮件中可查看）**/  
	public static final String APP_ID="wx4fb6f15e2affa0fd";
	/**APPSECRET：公众帐号secert（仅JSAPI支付的时候需要配置， 登录公众平台，进入开发者中心可设置）**/  
	public static final String APPSECRET = "6476ef5e19a301e97debe98eb5dca157";
	
	/**MCHID：商户号（必须配置，开户邮件中可查看）**/  
	public static final String  MCHID = "1484046032";
	/** KEY：商户支付密钥，参考开户邮件设置（必须配置，登录商户平台自行设置）**/  
	public static final String KEY = "335086669yangle335086669yangle11";
	
	/**通知地址**/  
	public static  String NOTIFY_URL="http://192.168.0.189:8090/game/wechat/pay/notify/return";
	
	/**统一订单地址**/  
	public static final String UNIFIED_ORDER_URL="https://api.mch.weixin.qq.com/pay/unifiedorder";
}
  