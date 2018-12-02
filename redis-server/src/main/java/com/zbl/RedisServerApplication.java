package com.zbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhaobaolong
 * @Title: RedisApplication
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/2911:24
 */
@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class RedisServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisServerApplication.class,args);
	}
}
