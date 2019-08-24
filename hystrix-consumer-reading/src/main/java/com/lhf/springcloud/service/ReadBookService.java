package com.lhf.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @ClassName: ReadBookService
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/3/31
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Service
public class ReadBookService {

    //如果服务发生异常，就调用默认的collbackMethod方法
    @HystrixCommand(fallbackMethod = "collbackMethod")
    public String readBook(){
        RestTemplate restTemplate = new RestTemplate();
        URI uri = URI.create("http://localhost:8088/book");
        return restTemplate.getForObject(uri, String.class);  //请求服务方
    }

    /**
     * 熔断回调方法
     * 如果服务端挂了，执行熔断机制，调用此方法
     * @return
     */
    public String collbackMethod(){
        return "<<你的孤独虽败犹荣>>";
    }

}
