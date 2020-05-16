package com.young.dao;

import org.springframework.jdbc.core.JdbcTemplate;
public class BookDao {
	JdbcTemplate jdbcTemplate;
	public void updatebalance(String username,int price){
		String sql = "UPDATE account SET balance=balance-? where username=?";
		jdbcTemplate.update(sql, price,username);
	}
	
	public int getPrice(String isbn){
		String sql ="SELECT price FROM book WHERE isbn=?";
		Integer queryForObject = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
		return queryForObject;
	}
	public void updateStock(String isbn){
		String sql = "UPDATE book_stock SET stock = stock-1 WHERE isbn=?";
		jdbcTemplate.update(sql, isbn);	
	}
	public void updatePrice(String isbn,int price){
		String sql = "update book set price=? where isbn=?";
		jdbcTemplate.update(sql,price,isbn);
	}
}
