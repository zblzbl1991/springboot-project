package com.zbl.mq.rabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaobaolong
 * @Title: OrderController
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/11/2115:46
 */
@RestController
public class OrderController {
	@Autowired
	AmqpTemplate rabbitTemplate;

	@RequestMapping("/order/create/")
	public String crateOrder(){
		for(int i=0;i<100;i++){
			System.out.println("发送的第"+i+"条消息..");
			rabbitTemplate.convertAndSend("order","发送的第"+i+"条消息..");
			rabbitTemplate.convertAndSend("order2","发送的第"+i+"条消息..");
		}

		return "success";

	}
}
