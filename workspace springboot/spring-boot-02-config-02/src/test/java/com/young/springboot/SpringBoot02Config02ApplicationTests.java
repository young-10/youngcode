package com.young.springboot;

import com.young.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/*
Springboot的单元测试
可以在测试期间很方便的类似编码一样
 */
@SpringBootTest
class SpringBoot02Config02ApplicationTests {

    @Autowired
    Person person;


    @Autowired
    ApplicationContext ioc;


    @Test
    public void test01(){
        Object helloService = ioc.getBean("helloService");
        System.out.println(helloService);
    }
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
