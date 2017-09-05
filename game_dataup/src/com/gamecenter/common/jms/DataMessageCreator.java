package com.gamecenter.common.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 消息的发送器
 */
public class DataMessageCreator implements MessageCreator {
	
	/**
	 * 消息发布对象
	 */
	public Object obj = null;
	
	public Message createMessage(Session paramSession) throws JMSException {
		String msg = JSON.toJSONString(obj);
		return paramSession.createTextMessage(msg);
	}
}