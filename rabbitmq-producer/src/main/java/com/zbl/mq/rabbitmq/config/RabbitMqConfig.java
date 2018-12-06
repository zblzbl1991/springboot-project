package com.zbl.mq.rabbitmq.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaobaolong
 * @Title: RabbitMqConfig
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/11/2115:50
 */
@Configuration
public class RabbitMqConfig {

	@Bean
	public Queue queue(){
		return new Queue("order");
	}

	@Bean
	public MessageConverter messageConverter(){
		return new Jackson2JsonMessageConverter();
	}

	@Bean
	public AmqpAdmin amqpAdmin(ConnectionFactory connectionFactory){
		RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory);
		rabbitAdmin.declareExchange(new DirectExchange("amqpadmin.exchange"));
		rabbitAdmin.declareQueue(new Queue("amqpadmin.queue",true));
		rabbitAdmin.declareBinding(new Binding("amqpadmin.queue", Binding.DestinationType.QUEUE,"amqpadmin.exchange","amqp.default",null));
		System.out.println("创建完成");
		return rabbitAdmin;
	}
}
