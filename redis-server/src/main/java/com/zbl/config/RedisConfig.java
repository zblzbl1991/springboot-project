//package com.zbl.config;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.cache.CacheManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.Duration;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * @author zhaobaolong
// * @Title: RedisConfig
// * @ProjectName springboot
// * @Description: TODO
// * @date 2018/11/2915:01
// */
//@Configuration
//public class RedisConfig {
////	/**
////	 * @author: zhaobaolong
////	 * @description: 配置缓存管理器
////	 * @date: 15:40 2018/11/29
////	 * @param: redisTemplate
////	 * @retrun： redisCacheManager
////	 */
////	@Bean
////	public CacheManager cacheManager(RedisTemplate redisTemplate){
////		RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
////		redisCacheManager.setDefaultExpiration(60);
////		return redisCacheManager;
////	}
////	/**
////	 * @author: zhaobaolong
////	 * @description: 配置redisTemplate 模板
////	 * @date: 15:40 2018/11/29
////	 * @param: redisConnectionFactory
////	 * @retrun： redisTemplate
////	 */
////	@Bean
////	public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
////		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
////		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
////		//序列化器
////		ObjectMapper objectMapper = new ObjectMapper();
////		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
////		//对所有非final的对象都可以正确的序列化和反序列化
////		objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
////		jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
////		redisTemplate.setConnectionFactory(redisConnectionFactory);
////		//value序列化规则
////		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
////		redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
////		//key的序列化规则
////		StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
////		redisTemplate.setKeySerializer(stringRedisSerializer);
////		redisTemplate.setHashKeySerializer(stringRedisSerializer);
////		return redisTemplate;
////	}
//
//	/**
//	 * json序列化
//	 * @return
//	 */
//	@Bean
//	public RedisSerializer<Object> jackson2JsonRedisSerializer() {
//		//使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值
//		Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);
//
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//		mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//		serializer.setObjectMapper(mapper);
//		return serializer;
//	}
//
//
//	@Bean
//	public CacheManager cacheManager(RedisTemplate redisTemplate) {
//		RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
//		// 多个缓存的名称,目前只定义了一个
//		//设置缓存过期时间(秒)
//		rcm.setDefaultExpiration(600);
//		return rcm;
//	}
//
//	@Bean
//	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
//		StringRedisTemplate template = new StringRedisTemplate(factory);
//		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//		ObjectMapper om = new ObjectMapper();
//		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//		jackson2JsonRedisSerializer.setObjectMapper(om);
//		template.setValueSerializer(jackson2JsonRedisSerializer);
//		template.afterPropertiesSet();
//		return template;
//	}
//
//}
