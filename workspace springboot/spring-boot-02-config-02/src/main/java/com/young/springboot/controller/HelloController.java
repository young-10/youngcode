package com.young.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author young
 * @Description
 * @date 2020-04-16 16:49
 */
@RestController
public class HelloController {

    @Value("${person.lastname}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello "+name;
    }

}
