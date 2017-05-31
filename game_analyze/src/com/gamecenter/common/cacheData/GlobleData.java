package com.gamecenter.common.cacheData;

import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.parBean.SysConf;
import com.gamecenter.parBean.UserMsg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 全局数据缓存中心 Created by IntelliJ IDEA. User: Administrator Date: 11-7-4 Time: 下午3:50 To change this template use File | Settings | File Templates.
 */
public class GlobleData {
	
	/**
	 * 缓存 key:appid value:OpGameapp
	 */
	public static Map<String, OpGameapp> apps = new ConcurrentHashMap<String, OpGameapp>();
	
	// 用户数据map
	public static Map<String, UserMsg> users = new ConcurrentHashMap<String, UserMsg>();
	// 支付类型及编号信息
	public static Map<String, String> payShop = new ConcurrentHashMap<String, String>();
	
}
