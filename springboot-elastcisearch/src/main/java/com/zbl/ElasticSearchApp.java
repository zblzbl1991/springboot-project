package com.zbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaobaolong
 * @Title: ElasticSearchApp
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/12/411:34
 */
@SpringBootApplication
@MapperScan("com.zbl.mapper")
public class ElasticSearchApp {

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchApp.class,args);
	}
}
