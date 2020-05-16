package com.young.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtils {
	public static void logstart(Method method, Object... args) {
		System.out.println(method.getName() + "方法开始执行，用的参数列表为"+ Arrays.asList(args));
	}

	public static void logreturn(Method method, Object result) {
		System.out.println(method.getName() + "方法执行完成，运行结果为" + result);
	}

	public static void logException(Method method, Exception e) {
		System.out.println(method.getName()+"方法出现异常,异常为"+e.getCause());
	}
	public static void logEnd(Method method) {
		System.out.println(method.getName()+"方法最终结束了");
	}
}
