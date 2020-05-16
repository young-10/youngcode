package com.young.utils;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class LogUtils {
	public static void logstart(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("LogUtils前置" + name + "方法开始执行，用的参数列表为"
				+ Arrays.asList(args));
	}

	public static void logreturn(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("LogUtils返回" + name + "方法执行完成，运行结果为" + result);
	}

	public static void logException(JoinPoint joinPoint, Exception e) {
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("LogUtils异常" + name + "方法出现异常,异常为" + e.getMessage());
	}

	public static void logEnd(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("LogUtils返回" + name + "方法最终结束了");
	}
}
