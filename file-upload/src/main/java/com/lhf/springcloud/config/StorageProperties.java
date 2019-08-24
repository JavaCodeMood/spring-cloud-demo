package com.lhf.springcloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: StorageProperties
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@ConfigurationProperties("storage")
public class StorageProperties {

    private String location = "upload-dir";

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
