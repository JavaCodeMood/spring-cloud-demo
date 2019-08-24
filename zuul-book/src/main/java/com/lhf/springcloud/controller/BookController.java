package com.lhf.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: BookController
 * @Description:  zuul 智能路由
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@RestController
public class BookController {

    //http://localhost:8090/available
    //http://localhost:8091/books/available
    @RequestMapping("/available")
    public String available(){
        return "没有了你，万杯觥筹只不过是提醒寂寞罢了！" ;
    }


    //http://localhost:8090/checked-out
    @RequestMapping("/checked-out")
    public String checkedout(){
        return "莫愁前路无知己，天下谁人不识君!" ;
    }


}
