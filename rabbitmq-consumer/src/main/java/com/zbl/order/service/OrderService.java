package com.zbl.order.service;

import com.zbl.order.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaobaolong
 * @Title: OrderService
 * @ProjectName demo
 * @Description: TODO
 * @date 2018/11/2115:32
 */
@Service
public class OrderService {

	@Autowired
	OrderDao orderDao;

	public int createOrder(String orderNo) {
		return orderDao.createOrder(orderNo);
	}
}
