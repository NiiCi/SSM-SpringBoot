package com.nc.springBootTest.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Employees;

public interface EmployeeService {
	/*SqlSession session = MybatisUtil.getSession();
	EmployeeDao mapper = MybatisUtil.getSession().getMapper(EmployeeDao.class);*/
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeMapper mapper = (EmployeeMapper) ctx.getBean("employeeMapper");*/
	public List<Employees> queryEmp();
	public int checkEmp(String name);
}
