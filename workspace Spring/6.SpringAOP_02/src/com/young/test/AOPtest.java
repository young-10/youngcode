package com.young.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.Impl.CalculatorImpl;
import com.young.inter.Calculator;

public class AOPtest {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	/**
	 * 多个切面的测试
	 *环绕前置add方法开始执行，用的参数列表为
		LogUtils前置add方法开始执行，用的参数列表为[1, 2]
		Validate前置add方法开始执行，用的参数列表为[1, 2]
		Validate后置add方法最终结束了
		Validate返回add方法执行完成，运行结果为3
		环绕返回add方法开始返回，返回值为3
		环绕后置add最终结束
		LogUtils返回add方法最终结束了
		LogUtils返回add方法执行完成，运行结果为3
		
		前面（首字母顺序）进来的切面后出去
		
		环绕只会影响当前切面，不会影响其他切面
		
		
		
	 */
	@Test
	public void test05(){
		Calculator bean = ioc.getBean(Calculator.class);
		bean.add(1, 2);
		bean.mul(3, 4);
		bean.sub(3, 4);
		bean.div(78, 8);
	}
	/**
	 * 细节四的测试
	 */
	@Test
	public void test04(){
		CalculatorImpl bean = ioc.getBean(CalculatorImpl.class);
		bean.add(1, 2);
		bean.mul(3, 4);
		bean.sub(3, 4);
		bean.div(78, 8);
	}
	/**细节三：
	 * 通知方法的执行顺序
	 * try{
	 * 		@Before
	 * 
	 * 		@AfterReturning
	 * }catch{
	 * 		@AtferThrowing
	 * }finally{
	 * 		@After
	 * }
	 * 正常执行:@Before(前置通知)--@After(后置通知)--@AfterReturning（正常返回）
	 * 异常执行@Before(前置通知)--@After(后置通知)--@AtferThrowing（方法异常）
	 */
	@Test
	public void test03(){
		CalculatorImpl bean = ioc.getBean(CalculatorImpl.class);
		int div = bean.div(4, 2);
		System.out.println(div);
	}
	@Test
	public void test02(){
		CalculatorImpl bean = ioc.getBean(CalculatorImpl.class);
		bean.add(1, 2);
		//class com.young.Impl.CalculatorImpl$$EnhancerByCGLIB$$647ebba
		//还是一个代理对象，cglib帮我们创建代理对象爱，没有接口也能创建对象
		System.out.println(bean.getClass());
	}
	@Test
	public void test() {
		//1、从ioc容器中拿到目标对象，注意，如果使用类型，一定要用他的接口类型，不要用他本类
		//细节一：com.young.Impl.CalculatorImpl@6ae5aa72
		//class com.sun.proxy.$Proxy12
		//AOP的底层就是动态代理，容器中保存的组件是他的代理对象，$Proxy12当然不是本类的类型，因为代理对象和被代理对象的唯一关联就是同一个接口
		Calculator calculator = ioc.getBean(Calculator.class);
		calculator.add(4, 5);
		System.out.println(calculator);//com.young.Impl.CalculatorImpl@6ae5aa72
		System.out.println(calculator.getClass());//class com.sun.proxy.$Proxy12
		

	}

}
