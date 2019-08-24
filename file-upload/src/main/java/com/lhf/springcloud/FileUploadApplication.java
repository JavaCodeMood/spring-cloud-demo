package com.lhf.springcloud;

import com.lhf.springcloud.config.StorageProperties;
import com.lhf.springcloud.service.StorangeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * SpringCloud实现文件上传
 */
@SpringBootApplication
@EnableEurekaClient
//加载配置属性
@EnableConfigurationProperties(StorageProperties.class)
public class FileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorangeService storangeService){
		return (args) -> {
			storangeService.deleteAll();
			storangeService.init();
		};
	}
}
