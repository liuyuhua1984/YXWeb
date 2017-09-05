package com.gamecenter.common.jms;

import javax.annotation.Resource;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;

/**
 * 数据上报处理 Created by IntelliJ IDEA. User: Administrator Date: 13-8-15 Time: 下午3:38 To change this template use File | Settings | File Templates.
 */
public class Sendmsg {
	
	private static int i = 0;
	
	@Resource
	private JmsTemplate jmsTempalte;
	
	@Resource
	private ActiveMQQueue defaultDestination;
	
	/**
	 * 任务入口，3秒
	 * <p/>
	 * 思考 一次链接发送 几个消息包的问题
	 */
	public synchronized void work() {
		System.out.println("[生产者222] ： 发送消息》》》》》》》》》》");
		
		i++;
		System.out.println("发送 i=" + i);
		// 消息产生者
		MyMessageCreator myMessageCreator = new MyMessageCreator();
		// myMessageCreator.n = i;
		jmsTempalte.send(defaultDestination, myMessageCreator);
		
	}
	
}
