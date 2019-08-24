package com.lhf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 消费端
 * 使用Ribbon实现负载均衡
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonConsumerUser1Application {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerUser1Application.class, args);
	}

}
