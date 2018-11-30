package com.zbl.controller;

import com.zbl.entity.User;
import com.zbl.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaobaolong
 * @Title: RedisController
 * @ProjectName springboot
 * @Description: redisController
 * @date 2018/11/2911:23
 */
@RestController
public class RedisController {
	@Autowired
	RedisService redisService;

	@RequestMapping("/redis/user")
	public User getUser(String id){
		return redisService.getUser(id);
	}
}
