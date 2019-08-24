package com.lhf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 消费端
 */
@SpringBootApplication
@EnableEurekaClient
public class HystrixConsumerReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixConsumerReadingApplication.class, args);
	}

}
