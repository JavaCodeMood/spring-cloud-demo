package com.lhf.springcloud.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @ClassName: StorangeService
 * @Description: 存储服务接口,模拟存储服务
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public interface StorangeService {

    //初始化
    void init();

    //存储
    void store(MultipartFile file);

    //加载文件
    Stream<Path> loadAll();

    //加载文件路径
    Path load(String filename);

    //加载资源文件
    Resource loadResource(String filename);

    //删除全部文件
    void deleteAll();
}
