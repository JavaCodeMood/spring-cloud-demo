package com.lhf.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @ClassName: BookstoreController
 * @Description:  服务端
 * @Author: liuhefei
 * @Date: 2019/3/31
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@RestController
public class BookstoreController {

    //http://localhost:8088/book
    @RequestMapping(value = "/book")
    public String bookList(){
        List<String> list = Arrays.asList("Java编程实战","SpringBoot入门到精通","Java从入门到放弃","SpringCloud入门实战");
        Random random = new Random();

        String book = list.get(random.nextInt(list.size()));
        System.out.println("book = <<" + book + ">>");
        return "图书：" + book ;
    }
}
