package com.zbl.mq.rabbitmq.controller;

import com.zbl.entity.User;
import com.zbl.entity.enumeration.Sex;
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
public class ProducerController {
	@Autowired
	AmqpTemplate rabbitTemplate;

	@RequestMapping("/order/create/")
	public String crateOrder(){
		for(int i=0;i<100;i++){
			User user = new User();
			user.setId(i);
			user.setName("姓名"+i);
//			user.setSex(i%2==0? Sex.female:Sex.male);
			System.out.println("发送的第"+i+"条消息..");
			rabbitTemplate.convertAndSend("order",user);
			rabbitTemplate.convertAndSend("order2",user);
		}

		return "success";

	}
}
