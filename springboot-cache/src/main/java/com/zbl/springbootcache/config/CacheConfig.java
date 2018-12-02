package com.zbl.springbootcache.config;


import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.Arrays;

@Configuration
public class CacheConfig {

	@Bean
	public KeyGenerator keyGenerator(){
	return	new KeyGenerator(){

			public Object generate(Object o, Method method, Object... objects) {
				return method.getName()+"["+ Arrays.asList(objects).toString()+"]";
			}
		};
	}

	@Bean
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
		RedisTemplate<Object, Object> template = new RedisTemplate();
		template.setConnectionFactory(redisConnectionFactory);
		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
		template.setDefaultSerializer(jackson2JsonRedisSerializer);
		return template;
	}

	@Bean
	public RedisCacheManager redisCacheManager(RedisTemplate<Object, Object> redisTemplate){
		RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
		return redisCacheManager;
	}
}
