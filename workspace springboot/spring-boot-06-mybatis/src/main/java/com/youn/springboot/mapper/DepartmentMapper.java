package com.youn.springboot.mapper;

import com.youn.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author young
 * @Description
 * @date 2020-04-18 15:46
 */
//指定这是一个操作数据库的mapper
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Select("delete from department where id=#{id}")
    public int delById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);



}
