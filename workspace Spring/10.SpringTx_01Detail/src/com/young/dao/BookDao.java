package com.young.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	/**
	 * 减 余额
	 * @param name
	 * @param salary
	 */
	public void updatebalance(String username,int price){
		String sql = "UPDATE account SET balance=balance-? where username=?";
		jdbcTemplate.update(sql, price,username);
	}
	
	/**
	 * 2、按照图书的isbn 获取图书的价格
	 * @return
	 */
	public int getPrice(String isbn){
		String sql ="SELECT price FROM book WHERE isbn=?";
		Integer queryForObject = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
		return queryForObject;
	}
	/**
	 * 3、减去某本书的库存，为了简单起见，每次减一
	 */
	
	public void updateStock(String isbn){
		String sql = "UPDATE book_stock SET stock = stock-1 WHERE isbn=?";
		jdbcTemplate.update(sql, isbn);	
	}
	/**
	 * 4、该图书价格
	 */
	public void updatePrice(String isbn,int price){
		String sql = "update book set price=? where isbn=?";
		jdbcTemplate.update(sql,price,isbn);
	}
}
