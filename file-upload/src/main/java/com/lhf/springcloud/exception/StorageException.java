package com.lhf.springcloud.exception;

/**
 * @ClassName: StorageException
 * @Description: 存储异常
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class StorageException extends RuntimeException{

    public StorageException(String message){
        super(message);
    }

    public StorageException(String message, Throwable cause){
        super(message, cause);
    }
}
