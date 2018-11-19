package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.nc.springBootTest.entity.Employees;

/*
@Repository("employeeDao")*/
@Mapper
public interface EmployeeMapper {
	public List<Employees> queryEmp ();

	public int checkEmp(String name);
}
