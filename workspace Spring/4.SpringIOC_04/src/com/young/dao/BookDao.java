package com.young.dao;

import org.springframework.stereotype.Repository;

import com.young.Bean.Book;
@Repository
public class BookDao extends BaseDao<Book> {

	@Override
	public void save() {
		System.out.println("保存图书");
		
	}

}
