package com.gamecenter.common.jms;

import javax.jms.*;

import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

@Component("defaultMessageHandler")
// public class LogicHandler implements SessionAwareMessageListener<TextMessage> {
public class DefaultMessageHandler implements MessageListener {
	
	// public void onMessage(TextMessage message, Session session)
	// throws JMSException {
	//
	// String text = message.getText();
	//
	// if (text.length() == 0) {
	// System.out.println("<empty>");
	// } else {
	// System.out.println(text);
	// }
	// }
	
	public void onMessage(Message message) {
		System.out.println("信息接受....");
		
		try {
			Thread.sleep(1000000);
			
			TestObj obj = (TestObj) ((ObjectMessage) message).getObject();
			
			System.out.println(obj.getName() + ";" + obj.getAct());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
