package com.zbl.test;

import com.zbl.RedisApplication;
import com.zbl.entity.User;
import com.zbl.entity.enumeration.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author zhaobaolong
 * @Title: RedisTest
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/2911:38
 */
@SpringBootTest(classes = RedisApplication.class)
@RunWith(SpringRunner.class)
public class RedisTest {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate redisTemplate;


	@Test
	public void test(){
		User user = new User();
		user.setId(1);
		user.setName("赵宝龙");
		user.setSex(Sex.male.getSex());
		redisTemplate.opsForValue().set("233",user);
		System.out.println("输出:"+redisTemplate.opsForValue().get("233"));
	}
}
