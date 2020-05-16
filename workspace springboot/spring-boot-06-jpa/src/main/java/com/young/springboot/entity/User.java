package com.young.springboot.entity;

import javax.persistence.*;

/**
 * @author young
 * @Description
 * @date 2020-04-18 16:46
 */
//使用JPA注解配置映射关系
@Entity//告诉JPA这是一个实体类，（和数据表映射的类）
@Table(name = "tbl_user")//@table来指定和哪个数据表来对应，如果省略默认表明是类名小写
public class User {

    @Id//这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(name = "last_name", length = 50)
    private String username;
    @Column//省略列表就是属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
