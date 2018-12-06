package com.zbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhaobaolong
 * @Title: RedisClientApplication
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/3010:49
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zbl.dao")
public class RedisClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisClientApplication.class,args);
	}
}
