package com.youn.springboot.mapper;

import com.youn.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author young
 * @Description
 * @date 2020-04-18 16:16
 */
public interface EmployeeMapper {
   Employee getEmpById(Integer id);

   void insertEmp(Employee employee);
}
