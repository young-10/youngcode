package com.young.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.young.dao.BookDao;
@Service
public class BookService {
	@Autowired
	BookDao bookDao;
	/*
	 * 结账，传入哪个用户买了那本书
	 */
	@Transactional
	public void checkout(String username, String isbn) {
		//1、减库存
		bookDao.updateStock(isbn);
		
		int price = bookDao.getPrice(isbn);
		//2、减余额
		bookDao.updatebalance(username, price);
	}
}
