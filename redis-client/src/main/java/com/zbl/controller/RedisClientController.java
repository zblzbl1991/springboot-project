package com.zbl.controller;

import com.zbl.entity.User;
import com.zbl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaobaolong
 * @Title: RedisController
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/3010:51
 */
@RestController
public class RedisClientController {
	@Autowired
	UserService userService;
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Integer id){
		return userService.getUserById(id);
	}
}
