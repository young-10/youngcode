package com.young.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.young.dao.BaseDao;
/**
 * 没有加@service ,因为baseservice被继承
 * @author young
 *
 * @param <T>
 */
public class BaseService<T> {
	@Autowired
	BaseDao<T> baseDao;

	public void save() {
		System.out.println("自动注入的dao");
		baseDao.save();
	}
}
