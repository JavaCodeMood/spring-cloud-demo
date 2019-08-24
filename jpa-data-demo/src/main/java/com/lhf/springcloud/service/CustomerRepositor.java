package com.lhf.springcloud.service;

import com.lhf.springcloud.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @ClassName: CustomerRepositor
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/2
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public interface CustomerRepositor extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);


}
