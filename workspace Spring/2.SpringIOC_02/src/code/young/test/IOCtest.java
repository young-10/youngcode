package code.young.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import code.young.bean.Car;
import code.young.bean.Person;

public class IOCtest {
	ConfigurableApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
	ConfigurableApplicationContext ioc2=new ClassPathXmlApplicationContext("applicationContext2.xml");
	ConfigurableApplicationContext ioc3=new ClassPathXmlApplicationContext("applicationContext3.xml");
	/**
	 * Bean 的生命周期
	 * 单实例：
	 * （容器启动）构造器---初始化方法---（容器关闭）销毁方法
	 * 多实例：
	 * （获取）构造器---初始化方法---（容器关闭）不会调用bean的销毁方法
	 * 
	 * 后置处理器：（容器启动）构造器--后置处理器的before---初始化方法---后置处理器的after
	 * 
	 * 无论bean是否有初始化方法，后置处理器都会默认有，还会继续工作
	 */
	@Test
	public void test() {
		Object bean = ioc.getBean("book01");
		System.out.println(bean);
//		System.out.println("容器关闭了");
//		ioc.close();
	}
	@Test
	public void test02() throws SQLException {
		//1、从容器中拿到连接池
//		DataSource bean = (DataSource) ioc.getBean("dataSource");
		//2、按照类型获取组件，可以并获取这个类型下所有的实现类子类等。。
		DataSource bean = ioc2.getBean(DataSource.class);
		System.out.println(bean.getConnection());
		//${username} 是用户名的值young
		Car bean2 = ioc2.getBean(Car.class);
		System.out.println(bean2);
	}
	/**
	 * 测试自动装配
	 */
	@Test
	public void test03(){
		Person bean = ioc3.getBean(Person.class);
		System.out.println(bean);
	}
	@Test
	public void test04(){
		Object bean = ioc3.getBean("person04");
		System.out.println(bean);
		
	}
}
