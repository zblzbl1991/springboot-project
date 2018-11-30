package com.zbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author zhaobaolong
 * @Title: RedisApplication
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/2911:24
 */
@SpringBootApplication
@EnableCaching
@MapperScan("com.zbl.dao")
public class RedisApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class,args);
	}
}
