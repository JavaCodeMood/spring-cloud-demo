package com.lhf.springcloud.dao;

import com.lhf.springcloud.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName: UserRepository
 * @Description:  用户仓库
 * @Author: liuhefei
 * @Date: 2019/4/1
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public interface UserRepository extends CrudRepository<User, Integer> {
}
