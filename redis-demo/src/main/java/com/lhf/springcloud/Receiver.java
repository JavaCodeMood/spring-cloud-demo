package com.lhf.springcloud;

/**
 * @ClassName: Receiver
 * @Description:  消息接收者
 * @Author: liuhefei
 * @Date: 2019/4/2
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class Receiver {
    public void receiveMessage(String msg){
        System.out.printf("received : %s\r\n"  , msg);
    }
}
