package com.zbl.dao;

import com.zbl.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhaobaolong
 * @Title: UserDao
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/3010:53
 */
public interface UserDao {
	@Select("select * from user where id=#{id}")
	User getUserById(Integer id);
}
