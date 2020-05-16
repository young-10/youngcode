package com.young.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.young.bean.Employee;
@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveEmployee(Employee employee){
		String sql = "INSERT INTO employee(emp_name,salary) VALUE(?,?)";
		int update = jdbcTemplate.update(sql, employee.getEmpName(), employee.getSalary());
		System.out.println("保存成功"+update);
	}
}
