/** 
 * Project Name:DragonBallWorldServerHappy 
 * File Name:ServerGameConfig.java 
 * Package Name:com.sj.engine.config 
 * Date:2014-2-19上午10:56:06 
 * Copyright (c) 2014, chenzhou1025@126.com All Rights Reserved. 
 * 
 */

package com.gamecenter.common.properties;

import java.util.Properties;


/**
 * ClassName:ServerGameConfig <br/>
 * Function: TODO (游戏的配置文件). <br/>
 * Reason: TODO (). <br/>
 * Date: 2014-2-19 上午10:56:06 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */

public class WeChatConfig extends ServerProperties {
	private static final String BUNDLE_NAME = "/config/wechat.properties";
	
	/** APPID：绑定支付的APPID（必须配置，开户邮件中可查看）**/  
	public static  String APP_ID="wx4fb6f15e2affa0fd";
	/**APPSECRET：公众帐号secert（仅JSAPI支付的时候需要配置， 登录公众平台，进入开发者中心可设置）**/  
	public static  String APP_SECRET = "6476ef5e19a301e97debe98eb5dca157";
	
	/**MCHID：商户号（必须配置，开户邮件中可查看）**/  
	public static  String  MCH_ID = "1484046032";
	/** KEY：商户支付密钥，参考开户邮件设置（必须配置，登录商户平台自行设置）**/  
	public static  String KEY = "335086669yangle335086669yangle11";
	
	/**通知地址**/  
	public static  String NOTIFY_URL="http://192.168.0.189:8090/game/wechat/pay/notify/return";
	
	/**统一订单地址**/  
	public static final String UNIFIED_ORDER_URL="https://api.mch.weixin.qq.com/pay/unifiedorder";
	
	
	/**渠道号2=九州,0=恩施**/  
	public static  int CHANNEL = 0;
	
	public static void loadWeChatConfigConfig(String path) {
		
		Properties GAME_BUNDLE = loadProperties(path + BUNDLE_NAME);
		
		APP_ID = GAME_BUNDLE.getProperty("app_id");
		
		APP_SECRET  =GAME_BUNDLE.getProperty("app_secret");
		MCH_ID = GAME_BUNDLE.getProperty("mch_id");
		KEY = GAME_BUNDLE.getProperty("key");
		NOTIFY_URL = GAME_BUNDLE.getProperty("notify_url");
		CHANNEL = Integer.parseInt(GAME_BUNDLE.getProperty("channel"));
	}
	
}
