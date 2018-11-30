package com.zbl.service;

import com.zbl.dao.RedisDao;
import com.zbl.entity.User;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author zhaobaolong
 * @Title: RedisService
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/2916:06
 */
@Service
@Log
public class RedisService {
	@Autowired
	RedisDao redisDao;

	@Cacheable(value = "users" ,key = "#id")
	public User getUser(String id) {
		log.info("通过数据库查询");
		return redisDao.getUser(Integer.valueOf(id));

	}
}
