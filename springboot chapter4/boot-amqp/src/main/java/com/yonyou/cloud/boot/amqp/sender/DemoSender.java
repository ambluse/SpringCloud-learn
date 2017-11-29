package com.yonyou.cloud.boot.amqp.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoSender {
	
	@Autowired
	AmqpTemplate client;
	
	
	public void send() {
		String context = "hello " + new Date();
		System.out.println("Sender : " + context);
		this.client.convertAndSend("hello-exchange", "",context);
	}

}
