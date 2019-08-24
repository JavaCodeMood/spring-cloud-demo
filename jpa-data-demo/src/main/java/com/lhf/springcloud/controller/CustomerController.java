package com.lhf.springcloud.controller;

import com.lhf.springcloud.entity.Customer;
import com.lhf.springcloud.service.CustomerRepositor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: CustomerController
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/2
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@RestController
@Api(value = "客户接口",tags = "客户接口")
public class CustomerController {

    @Autowired
    CustomerRepositor customerRepositor;

    //http://localhost:8096/swagger-ui.html#/
    @ApiOperation(value = "添加客户")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addCustomer(@RequestParam String name, @RequestParam String content){
        Customer c = new Customer();
        c.setName(name);
        c.setContent(content);
        c.setCreateTime(new Date());

        customerRepositor.save(c);

        return "add success";
    }

    //http://localhost:8096/findByName?name=%E5%B0%8F%E6%98%8E
    @ApiOperation(value = "添加用户")
    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> findByNameList(@RequestParam String name){

        return customerRepositor.findByName(name);
    }

}
