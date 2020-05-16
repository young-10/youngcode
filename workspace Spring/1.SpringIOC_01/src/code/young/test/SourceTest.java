package code.young.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SourceTest {

	public static void main(String[] args) {
		//1、ioc容器的创建
		ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
		Object bean = ioc.getBean("person03");
		System.out.println(bean);
	}

}
