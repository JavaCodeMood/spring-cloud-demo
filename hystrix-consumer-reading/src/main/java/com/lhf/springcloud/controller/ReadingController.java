package com.lhf.springcloud.controller;

import com.lhf.springcloud.service.ReadBookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @ClassName: ReadingController
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/3/31
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@RestController
//启用熔断器
@EnableCircuitBreaker
public class ReadingController {

    @Autowired
    ReadBookService readBookService;

    RestTemplate restTemplate = new RestTemplate();

    // 此种方式不能起到融合熔断的作用，因此如果服务提供者故障，程序得到 500异常。
    //http://localhost:8089/read
    //http://localhost:8089/read/123
    @RequestMapping(value = "/read")
    public String readBook(){
        String bookStr = restTemplate.getForObject("http://localhost:8088/book", String.class);
        return bookStr;
    }

    /**
     * http://localhost:8089/book
     * @return
     */
    @RequestMapping(value = "/book")
    public String readBookList(){
        return readBookService.readBook();
    }

}
