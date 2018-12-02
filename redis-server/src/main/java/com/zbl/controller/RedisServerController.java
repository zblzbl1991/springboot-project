package com.zbl.controller;

import com.netflix.discovery.converters.Auto;
import com.zbl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaobaolong
 * @Title: RedisController
 * @ProjectName springboot
 * @Description: redisController
 * @date 2018/11/2911:23
 */
@RestController
public class RedisServerController {
	private final String  url="http://REDIS-CLIENT";

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable Integer id){
		return restTemplate.getForObject(url+"/user/"+id,User.class);
	}
}
