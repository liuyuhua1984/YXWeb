package com.gamecenter.common.jms;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gamecenter.parBean.updataObj.StatusConCommand;
import com.gamecenter.service.tasks.UploadDataServer;

/**
 * 使用多线程接受消息
 */
public class TopicConsumerA {
	
	// ExecutorService exec = Executors.newFixedThreadPool(10);
	// SimpleMessageConverter simpleMessageConverter;
	
	public void receive(final Object message) {
		System.out.println(message.toString());
		
		StatusConCommand obj =  JSON.parseObject(message.toString(), StatusConCommand.class);
		
		if (obj.getWorldId().equals(UploadDataServer.worldid)) {
			if (obj.getAct() == 1) {
				System.out.println("开启上报...");
				UploadDataServer.isUp = true;
			} else {
				System.out.println("关闭上报...");
				UploadDataServer.isUp = false;
			}
		}
		
		// exec.submit((new Runnable() {
		// @Override
		// public void run() {
		// System.out.println(Thread.currentThread().getName());
		// System.out.println("************************************** Topic A : " + message.getId());
		// }
		// }));
	}
	
}
