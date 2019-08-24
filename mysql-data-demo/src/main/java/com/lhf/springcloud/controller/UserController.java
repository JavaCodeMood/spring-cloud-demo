package com.lhf.springcloud.controller;

import com.lhf.springcloud.dao.UserRepository;
import com.lhf.springcloud.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

/**
 * @ClassName: UserController
 * @Description:  http://localhost:8094/swagger-ui.html
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Controller
@Api(value = "用户接口",tags = "用户接口")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "添加用户")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addNewUser(@RequestBody User user){
        User u1 = new User();
        u1.setUsername(user.getUsername());
        u1.setPassword(user.getPassword());
        u1.setEmail(user.getEmail());
        u1.setCreateTime(new Date());

        userRepository.save(u1);
        return "Saved";
    }

    //http://localhost:8094/all
    @ApiOperation(value = "获取所有用户")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }


}
