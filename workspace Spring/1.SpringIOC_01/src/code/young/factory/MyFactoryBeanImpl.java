package code.young.factory;

import java.util.UUID;

import org.springframework.beans.factory.FactoryBean;

import code.young.bean.book;
/**
 * 实现了FactoryBean接口的类是Spring可以认识的工厂类
 * @author young
 *1、编写一个FactoryBean的实现类
 *2、在Spring配置文件中进行注册
 */
public class MyFactoryBeanImpl implements FactoryBean<book> {
	/**
	 * 返回创建的对象
	 */
	@Override
	public book getObject() throws Exception {
		System.out.println("MyFactoryBeanImpl 帮你创建对象");
		book book = new book();
		book.setBookName(UUID.randomUUID().toString());
		return book;
	}
	/**
	 * 返回创建对象的类型
	 * Spring会自动调用这个方法来确定该对象的类型
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return book.class;
	}
	/**
	 * 是单例吗？
	 * false:不是
	 * true:是
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
