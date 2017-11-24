package com.yonyou.cloud.boot.amqp.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;


@Component
public class DemoListener implements ChannelAwareMessageListener{

	SimpleMessageConverter convert =  new SimpleMessageConverter();
	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(convert.fromMessage(message));
	}

}
