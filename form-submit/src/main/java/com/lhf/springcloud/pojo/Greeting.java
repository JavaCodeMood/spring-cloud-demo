package com.lhf.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Greeting
 * @Description:  问候语
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    private Integer id;

    private String content;

}
