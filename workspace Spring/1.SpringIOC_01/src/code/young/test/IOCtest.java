package code.young.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import code.young.bean.Person;

public class IOCtest {
	
	/**
	 * 存在的几个问题
	 * 1）src源码包开始路径称为类路径的开始
	 * 源码包里面的东西都会被合并在类路径里面
	 * Java：/bin/
	 * web:/WEB_INF/classes/
	 * 2)先导包commons-logging-1.1.3.jar（依赖）
	 * 3)再创建配置文件
	 * 4）Spring的容器接管了标志了s的类
	 */
	/**
	 * 1）几个细节：ApplicationContext（IOC容器的接口）
	 * 2）给容器中注册一个组件，我们也从容器中按照id拿到了这个组件的对象
	 * 组件的创建工作，是由容器完成
	 * 
	 * Person对象创建的时机：
	 * 容器中对象的创建在容器创建的时候就已经创建
	 * 3)同一个组件在ioc容器中是单实例的，而是在容器启动前就已经创建完成
	 * 4）容器如果没有组件，
	 *  org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
	 *  会报异常
	 *  5）ioc容器在创建这个组件对象的是时候，（property）会调用setXXX 方法来给JavaBean的属性赋值
	 *  6）JavaBean的属性名是由什么决定的？getter/setter方法是属性名，set去掉豁免那一串首字母小写
	 *  所有getter/setter使用自动生成
	 *  
	 */
	/**
	 * 从容器中拿到这个组件
	 */
	@Test
	public void test() {
		//ApplicationContext代表ioc容器
		//ClassPathXmlApplicationContext：当前应用配置的xml文件在ClassPathXmlApplicationContext
		//根据spring配置文件得到ioc容器对象
		ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
		System.out.println("容器启动完成");
		//容器帮我们创建好对象
		Person bean = (Person) ioc.getBean("person01");
		Person bean1 = (Person) ioc.getBean("person01");
		Person bean2 = (Person) ioc.getBean("person02");
		System.out.println(bean==bean1);
		System.out.println(bean);
		System.out.println(bean2);
//		Object bean3 = ioc.getBean("person03");
//		System.out.println(bean3);
		
	}

}
