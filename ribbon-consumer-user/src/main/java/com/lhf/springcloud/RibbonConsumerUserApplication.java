package com.lhf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 消费者
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerUserApplication.class, args);
	}

}
