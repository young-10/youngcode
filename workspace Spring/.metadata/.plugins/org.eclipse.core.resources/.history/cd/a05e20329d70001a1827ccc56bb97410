package com.young.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.service.BookService;
import com.young.service.MultiService;

public class Txtest {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void test() {
		BookService bookService = ioc.getBean(BookService.class);
//		bookService.checkout("Tom", "ISBN-001");
		int price = bookService.getPrice("ISBN-001");
		
		System.out.println(""+price);
		//有事务的业务逻辑，容器中保存的是这个业务逻辑的代理对象
		//class com.young.service.BookService$$EnhancerByCGLIB$$c6baf63c
		System.out.println(bookService.getClass());
	
	}
	@Test
	public void test02() {
		MultiService multiService = ioc.getBean(MultiService.class);
		multiService.multiTx();
	
	}


}
