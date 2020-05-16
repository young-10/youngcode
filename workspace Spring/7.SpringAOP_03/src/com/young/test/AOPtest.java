package com.young.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.Impl.CalculatorImpl;


public class AOPtest {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void test(){
		CalculatorImpl bean = ioc.getBean(CalculatorImpl.class);
		bean.add(1, 2);
		bean.mul(3, 4);
		bean.sub(3, 4);
		bean.div(78, 8);
	}
}
