package com.gamecenter.common;

import java.util.Date;
import java.util.ResourceBundle;

/**
 * 读取系统配置文件
 */
public class Config {
	private static Object lock = new Object();
	private static Config config = null;
	private static ResourceBundle rb = null;
	private static String CONFIG_FILE = "payName"; // 并发是危险哦
	
	private Config() {
		rb = ResourceBundle.getBundle(CONFIG_FILE);
	}
	
	// 同步语句块
	public static Config getInstance(String fileName) {
		synchronized (lock) {
			CONFIG_FILE = fileName;
			config = new Config();
		}
		return (config);
	}
	
	public String getValue(String key) {
		String result = "";
		try {
			result = new String(rb.getString(key).getBytes("ISO-8859-1"), "GBK");
		} catch (Exception e) {
		}
		return result;
	}
	
	public ResourceBundle getResourceBundle() {
		return rb;
	}
	
	public static void main(String[] args) {
		// Config config = Config.getInstance("bankCode");
		// Enumeration<String> keys = config.getResourceBundle().getKeys();
		// while (keys.hasMoreElements()){
		// String s = keys.nextElement(); //获取下一个元素
		// System.out.println(s);
		// }
		// System.out.println(Config.getInstance("bankCode").getValue("ss"));
		
		Date nowDate = new Date(System.currentTimeMillis());
		System.out.println(nowDate);
	}
}
