package code.young.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import code.young.bean.Car;
import code.young.bean.Person;
import code.young.bean.book;

public class IOCtest1 {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
	ApplicationContext ioc2 = new ClassPathXmlApplicationContext("ioc2.xml");
	ApplicationContext ioc3 = new ClassPathXmlApplicationContext("ioc3.xml");
	
//	实验2：根据bean的类型从IOC容器中获取bean的实例★
	/**
	 * org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
		如果ioc中Person 的类型有多个，使用类型查找会报错

	 */
	@Test
	public void test02(){
//		实验2：根据bean的类型从IOC容器中获取bean的实例★
//		Person bean = ioc.getBean(Person.class);
//		System.out.println(bean);//如果ioc中Person 的类型有多个，使用类型查找会报错
//		Person bean2 = ioc.getBean("person02", Person.class);
//		System.out.println(bean2);
//		
//		Person bean = ioc.getBean("person06",Person.class);
//		System.out.println(bean );
	
	}
	/**
	 * 实验4：正确的为各种属性赋值
		    测试使用null值 、
		    引用类型赋值（引用其他bean、引用内部bean）
		    集合类型赋值（List、Map、Properties）、
		    util名称空间创建集合类型的bean
		    级联属性赋值
	 */
	@Test
	public void test03(){
		
		Person bean = ioc2.getBean("person01", Person.class);
		System.out.println(bean.getName()==null);
		System.out.println(bean.getCar());
		Car car = bean.getCar();
		Car car1 = (Car) ioc2.getBean("car01");
		System.out.println(car==car1);//bean中的car与ioc容器中的car是同一个
		
		
	}
	@Test
	public void test04(){
		Person bean = ioc2.getBean("person02",Person.class);
		Car car = bean.getCar();
		System.out.println(car);
		List<book> books = bean.getBooks();
		System.out.println(books);
		Map<String, Object> map = bean.getMap();
		System.out.println(map);
		Properties pros = bean.getPros();
		System.out.println(pros);
		
	}
	
	@Test
	public void test05(){
		Person bean = ioc2.getBean("person03",Person.class);
		Map<String, Object> map = bean.getMap();
		System.out.println(map);
		
		Map<String, Object> map1 = ioc2.getBean("mymap",Map.class);
		System.out.println(map1.getClass());//class java.util.LinkedHashMap
		
		List bean2 = (List) ioc2.getBean("myList");
		System.out.println(bean2);
		System.out.println(bean2.getClass());

	}
	/**
	 * 级联属性可以修改属性的属性，ref的话会全修改
	 */
	@Test
	public void test06(){
		Person  bean = (Person) ioc2.getBean("person04");
		Object bean2 = ioc2.getBean("car01");
		System.out.println(bean);
		System.out.println(bean2);
		
	
		
	}
	/**
	 * org.springframework.beans.factory.BeanIsAbstractException: Error creating bean with name 'person05': Bean definition is abstract
	 */
	@Test
	public void test07(){
//		Person  bean = (Person) ioc2.getBean("person05");
		Person  bean1 = (Person) ioc2.getBean("person06");
//		System.out.println(bean);
		System.out.println(bean1);
	}
	@Test
	public void test08(){
		System.out.println("容器创建完成");
		Object bean = ioc3.getBean("book1");
		Object bean1 = ioc3.getBean("book1");
		System.out.println(bean==bean1);
		
	}
	@Test
	public void test09(){
		Object bean = ioc3.getBean("AirPlane01");
		System.out.println(bean);
		System.out.println("容器启动完成");
		
	}
	@Test
	public void test10(){
//		Object bean = ioc3.getBean("airplane02");
//		System.out.println(bean);
//		System.out.println("容器启动完成");
		Object bean = ioc3.getBean("myFactoryBeanImpl");
		System.out.println(bean);
		Object bean1 = ioc3.getBean("myFactoryBeanImpl");
		System.out.println(bean==bean1);
	}
}
