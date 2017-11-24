package com.yonyou.cloud.boot.amqp.config;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yonyou.cloud.boot.amqp.listener.DemoListener;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue mqOps() {
        return new Queue("hello-queue");
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("hello-exchange");
    }

    @Bean
    Binding bindingMqMsgExchange(Queue mqOps,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(mqOps).to(fanoutExchange);
    }
    
    @Bean
	public SimpleMessageListenerContainer messageContainer1(ConnectionFactory connectionFactory,
			DemoListener mqMsgListener) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
		container.setQueues(mqOps());
		container.setExposeListenerChannel(true);
		container.setConcurrentConsumers(10);
		container.setAcknowledgeMode(AcknowledgeMode.AUTO); // 设置确认模式手工确认
		container.setMessageListener(mqMsgListener);
		container.setMaxConcurrentConsumers(10);//设置最大消费者数量 防止大批量涌入
		return container;
	}
	
}