package com.young.dao;

import java.sql.SQLException;


import org.springframework.stereotype.Repository;
/**
 * id默认类名首字母小写
 * @author young
 *
 */
@Repository
//@Scope("prototype")//改变组件的作用域
public class BookDao {
//	@Autowired
//	private DataSource dataSource;
	public void saveBook() throws SQLException{
//		dataSource.getConnection();
		System.out.println("图书已经保存.....");
	}
}