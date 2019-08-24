package com.lhf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

@SpringBootApplication
@EnableEurekaClient
public class RedisDemoApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RedisDemoApplication.class, args);
		StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);

		template.convertAndSend("chat", "Hello, Redis!");

		System.exit(0);

	}

}
