package com.young.springboot.bean;

import org.springframework.stereotype.Component;

/**
 * @author young
 * @Description
 * @date 2020-04-16 15:34
 */
public class Dog {
    public  String name;
    public  Integer age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
