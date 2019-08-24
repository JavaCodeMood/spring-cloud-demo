package com.lhf.springcloud.controller;

import com.lhf.springcloud.pojo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: GreetingController
 * @Description:  问候语控制器,实现表单提交
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Controller
public class GreetingController {

    //http://localhost:8092/greeting
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greetingForm(Model model){
        model.addAttribute("greeting", new Greeting());
        return "greeting";  //跳转页面
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting){
        return "result";
    }
}
