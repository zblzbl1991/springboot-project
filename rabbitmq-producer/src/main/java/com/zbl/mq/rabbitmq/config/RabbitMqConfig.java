package com.zbl.mq.rabbitmq.config;

import org.springframework.amqp.core.Queue;
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
}
