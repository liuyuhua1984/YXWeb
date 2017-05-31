package com.gamecenter.service.task.jmsHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * Created with IntelliJ IDEA. User: gsb Date: 14-5-16 Time: 下午4:56 To change this template use File | Settings | File Templates.
 */
public class UpStatusNode {
	
	/**
	 * 上报节点列表 worldid time
	 */
	public static Map<String, String> upNodes = new ConcurrentHashMap<String, String>();
	
	public synchronized void work() {
		try {
			for (Map.Entry<String, String> entry : upNodes.entrySet()) {
				if (System.currentTimeMillis() - Long.parseLong(entry.getValue()) > 15000) {
					upNodes.remove(entry.getKey());
				}
			}
			
		} catch (Exception e) {
			
		}
	}
}
