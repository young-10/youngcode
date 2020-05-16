package com.young.utils;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class ValidateAspect {
	@Before("com.young.utils.LogUtils.hahaPoint()")
	public void logstart(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("Validate前置"+name+"方法开始执行，用的参数列表为"+Arrays.asList(args));
	}
	@AfterReturning(value="com.young.utils.LogUtils.hahaPoint()",returning="result")
	public void logreturn(JoinPoint joinPoint,Object result) {
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("Validate返回"+name+"方法执行完成，运行结果为"+result);
	}
	@AfterThrowing(value="com.young.utils.LogUtils.hahaPoint()",throwing="e")
	public void logException(JoinPoint joinPoint,Exception e) {
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("Validate异常"+name+"方法出现异常,异常为"+e.getMessage());
	}
	@After("com.young.utils.LogUtils.hahaPoint()")
	public  void logEnd(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		String name = signature.getName();
		System.out.println("Validate后置"+name+"方法最终结束了");
	}
}
