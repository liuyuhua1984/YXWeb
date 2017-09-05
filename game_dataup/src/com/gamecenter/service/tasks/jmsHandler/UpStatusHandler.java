package com.gamecenter.service.tasks.jmsHandler;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

/**
 * 上报数据状态控制 Created with IntelliJ IDEA. User: gsb Date: 14-5-10 Time: 下午1:35 To change this template use File | Settings | File Templates.
 */
@Component("upStatusHandler")
public class UpStatusHandler implements MessageListener {
	
	@Override
	public void onMessage(Message message) {
		try {
			String msg = ((TextMessage) message).getText();
			
			System.out.println("msg:" + msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
