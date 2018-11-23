package com.zbl.order.controller;

import com.zbl.entity.User;
import com.zbl.order.service.OrderService;
import lombok.extern.java.Log;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhaobaolong
 * @Title: OrderController
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/11/2115:27
 */

@Controller
@RabbitListener(queues = "order2")
@Log
public class ConsumerReceiver2 {

	@Autowired
	OrderService orderService;

	@RabbitHandler
	public void createOrder(User user){
		System.out.println("第二个队列接收到:"+user);
	}

}
