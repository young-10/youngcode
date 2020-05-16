package com.young.springbootcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author young
 * @Description
 * @date 2020-04-18 17:33
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello,World";
    }


    //查出一些数据在页面显示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("msg","<h1>你好<h1>");
        map.put("users", Arrays.asList("Tom","Jerry","Nike"));
        return "success";
    }


//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "login";
//    }
}
