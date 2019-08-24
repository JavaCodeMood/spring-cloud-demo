package com.lhf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * hystrix 熔断器   服务端
 */
@SpringBootApplication
@EnableEurekaClient
public class HystrixServerBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixServerBookstoreApplication.class, args);
	}

}
