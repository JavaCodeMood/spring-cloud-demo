package com.lhf.springcloud;

import com.lhf.springcloud.filter.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// 添加zuul代理注解
@EnableZuulProxy
public class ZuulGatewayApplication {

	/**
	 * 引入zuul过滤器到容器中
	 */
	@Bean
	public SimpleFilter simpleFilter(){
		return new SimpleFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}

}
