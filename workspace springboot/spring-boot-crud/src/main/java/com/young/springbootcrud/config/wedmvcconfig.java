package com.young.springbootcrud.config;

import com.young.springbootcrud.servlet.myservlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author young
 * @Description
 * @date 2020-04-19 15:29
 */
@Configuration
public class wedmvcconfig {

    //注册三大组件
    @Bean
    public ServletRegistrationBean myserlet(){

        ServletRegistrationBean<myservlet> myservletServletRegistrationBean = new ServletRegistrationBean<>(new myservlet(),"/myservlet");
        return myservletServletRegistrationBean;
    }
}
