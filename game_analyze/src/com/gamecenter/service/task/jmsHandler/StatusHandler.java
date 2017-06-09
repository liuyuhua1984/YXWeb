package com.gamecenter.service.task.jmsHandler;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

/**
 * 上报的节点心跳
 */
@Component("statusHandler")
public class StatusHandler implements MessageListener {
	
	public void onMessage(Message message) {
//		try {
//			String msg = ((TextMessage) message).getText();
//			UpStatus obj = JSON.parseObject(msg, UpStatus.class);
//			logic(obj);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
//	private void logic(UpStatus obj) {
//		UpStatusNode.upNodes.put(obj.getWorldid(), System.currentTimeMillis() + "");
//	}
}
