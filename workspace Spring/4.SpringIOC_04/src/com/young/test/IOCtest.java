package com.young.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.service.BookService;
import com.young.service.UserService;

public class IOCtest {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	@Test
	public void test() {
		BookService bookService = ioc.getBean(BookService.class);
		UserService userService = ioc.getBean(UserService.class);
		bookService.save();
		userService.save();
		//父类的类型：com.young.service.BaseService
		//带泛型的父类类型：com.young.service.BaseService<com.young.Bean.Book>
		//Spring中可以使用带泛型的父类类型来去认这个子类的类型
		System.out.println(bookService.getClass().getGenericSuperclass());
		//ioc是一个容器，帮我们管理所有的组件
		//1、依赖注入 ：@Autowired,自动赋值
		//2、某个组件要使用spring提供更多（IOC、AOP）必须加到容器中
		//3、容器启动，创建所有的单实例bean
		//4、Autowired自动装配的时候，是从容器中找到符合要求的bean
		//5、容器中保存所有的bean
		//6、调试spring的源码,容器到底是什么？其实就是一个map
		//6、这个map中保存了所有创建的bean,并提供外界获取功能，
		//探索：单实例bean保存在哪个map中？
		//源码调试的思路：
		//从hello world开始，给hello world的每一个关键功能打上断点，进去看里里面在工作什么
		//1、翻译这个方法干了什么？
		//2、放行这个方法，看控制台，看debug每一个变量的变化
		//3、看方法注释
		//学到的：规范注释，规范类名和方法名
	}

}
