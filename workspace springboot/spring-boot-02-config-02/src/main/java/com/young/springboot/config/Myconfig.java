package com.young.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author young
 * @Description
 * @date 2020-04-16 17:05
 */
//@Configuration 指明当前类是配置类,代替之前的spring的xml配置文件

@Configuration
@ComponentScan(value = {"com.young.springboot.service"})
public class Myconfig {

//    @Bean("helloService")
//    public HelloService helloService(){
//        return new HelloService();
//    }
}
