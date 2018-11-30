package com.zbl.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaobaolong
 * @Title: RestConfiguration
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/11/3011:10
 */
@Configuration
public class RestConfiguration {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
