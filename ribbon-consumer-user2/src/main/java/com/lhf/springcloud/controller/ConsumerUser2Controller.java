package com.lhf.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConsumerUserController
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/3/31
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@RestController
public class ConsumerUser2Controller {

    @Bean
    @LoadBalanced  //实现负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    //http://localhost:8083/hi?name=liuhefei
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "springcloud") String name){
        String greeting = this.restTemplate.getForObject("http://say-hello/greeting", String.class);

        return String.format("%s, %s", name, greeting);
    }
}
