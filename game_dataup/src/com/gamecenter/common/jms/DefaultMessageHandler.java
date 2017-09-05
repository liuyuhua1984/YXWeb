package com.gamecenter.common.jms;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

@Component("defaultMessageHandler")
public class DefaultMessageHandler implements SessionAwareMessageListener<TextMessage> {
	
	public void onMessage(TextMessage message, Session session) throws JMSException {
		
		String text = message.getText();
		
		if (text.length() == 0) {
			System.out.println("<empty>");
		} else {
			System.out.println(text);
		}
	}
}
