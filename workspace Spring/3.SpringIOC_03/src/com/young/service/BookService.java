package com.young.service;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.young.dao.BookDao;

@Service
public class BookService {
	@Resource
//	@Autowired
	private BookDao bookDao;
	public void save() throws SQLException{
		System.out.println("bookService正在调用dao帮你保存图书...");
		bookDao.saveBook();
	}
}
