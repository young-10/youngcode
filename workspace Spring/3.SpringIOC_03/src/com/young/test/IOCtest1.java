package com.young.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.young.servlet.BookServlet;
/**
 * 使用Spring单元测试
 * 1.导包:Spring单元测试包 spring-test-4.0.0.RELEASE.jar
 * 2.@ContextConfiguration(locations="")指定配置文件的路径
 * 3.@RunWith()指定用哪种驱动进行单元测试,默认是junit
 * @RunWith(SpringJUnit4ClassRunner.class) 
 * 	使用spring的单元测试模块来执行标了标了@Test注解的测试方法
 * 	以前的@Test是使用junit执行好处:我们不用ioc.getBean来获取组件了.直接@Autowaired组件,spring为我们自动创建
 * @author young
 *
 */
@ContextConfiguration(locations="classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IOCtest1 {
	ApplicationContext ioc = null;
	@Autowired
	BookServlet bookServlet;
	@Test
	public void test(){
		System.out.println(bookServlet);
	}
}
