package com.youn.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.youn.springboot.mapper")
@SpringBootApplication
public class SpringBoot06MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06MybatisApplication.class, args);
    }

}
