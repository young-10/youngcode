package com.young.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.young.inter.Calculator;
import com.young.utils.LogUtils;

/**
 * 动态代理
 * 
 * @author young
 * 
 */
public class CalculatorProxy {
	/**
	 * 为传入的参数对象创建一个动态代理对象
	 * 
	 * @param calculator
	 *            ：被代理对象
	 * @return 代理对象
	 */
	public static Calculator getProxy(final Calculator calculator) {
		ClassLoader loader = calculator.getClass().getClassLoader();
		Class<?>[] interfaces = calculator.getClass().getInterfaces();
		// 方法执行器，帮目标对象执行目标方法
		InvocationHandler h = new InvocationHandler() {
			/**
			 * Object proxy :代理对象，给jdk使用，任何时候都不要使用 Method method：当前将要执行的目标对象的方法
			 * Object[] args:这个方法调用时外界传入的参数值
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// 利用反射执行目标方法
				// 目标方法执行后的返回值
				// System.out.println("这是动态代理将要执行的方法");
				Object result = null;
				try {
					LogUtils.logstart(method, args);
					result = method.invoke(calculator, args);
					LogUtils.logreturn(method, result);
				} catch (Exception e) {
					LogUtils.logException(method, e);
				} finally {
					LogUtils.logEnd(method);
				}
				// 返回值必须返回出去外界才能拿到真正执行后的返回值
				return result;
			}
		};
		// Proxy为目标对象创建代理对象
		Object proxy = Proxy.newProxyInstance(loader, interfaces, h);
		return (Calculator) proxy;
	}

}
