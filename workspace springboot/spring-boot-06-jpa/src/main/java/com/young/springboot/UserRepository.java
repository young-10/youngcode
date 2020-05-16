package com.young.springboot;

import com.young.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author young
 * @Description
 * @date 2020-04-18 17:00
 */
//继承JpaRepository完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {
}
