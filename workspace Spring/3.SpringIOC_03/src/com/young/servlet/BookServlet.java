package com.young.servlet;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.young.dao.BookDao;
import com.young.service.BookService;
/**
 * 属性的注入
 * 	@Autowired:Spring会自动的为这个属性赋值
 * 				一定是去容器中找到这个属性对应的组件
 * @author young
 *
 */
@Controller
public class BookServlet {
	//自动装配:自动的为这个属性赋值,不自己new
	//@Qualifier:指定一个名作为id,让Spring别使用变量名作为id
	@Qualifier("bookService")
	@Autowired(required=false)
	private BookService bookService;
	
	public void doGet() throws SQLException{
		bookService.save();
	}
	/**
	 * 在方法的形参位置使用@Qualifier注解
	 * 1)这个方法也会在bean创建的时候运行
	 * 2)这个方法的每一个参数都会自动注入值
	 */
	@Autowired(required=false) 
	public void hahaha(BookDao bookDao,@Qualifier("bookService")BookService bookService){
		System.out.println("Spring运行了这个方法"+bookDao+"--"+bookService);
	}
}