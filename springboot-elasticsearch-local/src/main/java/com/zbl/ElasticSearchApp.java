package com.zbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaobaolong
 * @Title: ElasticSearchApp
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019/1/49:56
 */
@SpringBootApplication
@MapperScan("com.zbl.dao")
public class ElasticSearchApp {
	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchApp.class,args);
	}
}
