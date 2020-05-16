package com.young.test;

import java.util.Arrays;

import org.junit.Test;

import com.young.Impl.CalculatorImpl;
import com.young.inter.Calculator;
import com.young.proxy.CalculatorProxy;

public class AOPtest {
	/**
	 * 有了动态代理，日志记录可以执行的很强大,而且与业务逻辑解耦
	 * 
	 * jdk默认的动态代理：如果目标对象没有实现任何接口，则无法为他创建代理对象
	 */
	@Test
	public void test() {
		Calculator calculator = new CalculatorImpl();
		calculator.add(4, 5);
		calculator.mul(4, 5);
		System.out.println("==============");
		//如果拿到了这个对象的代理对象，代理对象执行加减乘除
		Calculator proxy = CalculatorProxy.getProxy(calculator);
		proxy.add(4, 5);
		proxy.div(3, 4);
		//class com.sun.proxy.$Proxy2
		//代理对象和被代理对象唯一能产生的关联就是实现了同一个接口
		System.out.println(proxy.getClass());
		System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));
	}

}
