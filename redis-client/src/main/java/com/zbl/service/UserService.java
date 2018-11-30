package com.zbl.service;

import com.zbl.dao.UserDao;
import com.zbl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaobaolong
 * @Title: UserService
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/3010:53
 */
@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}
}
