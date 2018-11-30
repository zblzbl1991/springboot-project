package com.zbl.dao;

import com.zbl.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhaobaolong
 * @Title: RedisDao
 * @ProjectName springboot
 * @Description:
 * @date 2018/11/2916:15
 */
public interface RedisDao {

	@Select("select * from user where id=#{id}")
	User getUser(Integer id);
}
