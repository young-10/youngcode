package com.young.springboot.controller;

import com.young.springboot.UserRepository;
import com.young.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author young
 * @Description
 * @date 2020-04-18 17:13
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userRepository.findOne(id);
    }

    @GetMapping("/user")
    public User insert(User user){
      return   userRepository.save(user);
    }
}
