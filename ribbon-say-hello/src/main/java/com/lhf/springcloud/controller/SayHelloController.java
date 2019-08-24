package com.lhf.springcloud.controller;

import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @ClassName: SayHelloController
 * @Description:  服务提供者
 * @Author: liuhefei
 * @Date: 2019/3/31
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@RestController
public class SayHelloController {

    /**
     * 随机问候语
     * http://localhost:8082/greeting
     * @return
     */
    @RequestMapping(value = "/greeting")
    public String greet(){
        List<String> greetins = Arrays.asList("你好！","早上好！","下午好!", "晚上好！", "晚安");
        Random random = new Random();

        String str = greetins.get(random.nextInt(5));
        System.out.println("say-hello str = " + str);
        return str;
    }

    @RequestMapping("/")
    public String home(){
        return "Hi!!" ;
    }

}
