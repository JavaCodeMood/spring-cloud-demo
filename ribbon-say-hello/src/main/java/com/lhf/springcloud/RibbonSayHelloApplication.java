package com.lhf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonSayHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonSayHelloApplication.class, args);
	}

}
