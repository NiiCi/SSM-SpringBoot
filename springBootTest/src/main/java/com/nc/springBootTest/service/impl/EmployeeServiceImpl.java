package com.nc.springBootTest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.dao.EmployeeMapper;
import com.nc.springBootTest.entity.Employees;
import com.nc.springBootTest.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	/*SqlSession session = MybatisUtil.getSession();
	EmployeeDao mapper = MybatisUtil.getSession().getMapper(EmployeeDao.class);*/
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeMapper mapper = (EmployeeMapper) ctx.getBean("employeeMapper");*/
	@Autowired
	EmployeeMapper employeeMapper;
	public List<Employees> queryEmp(){
		/*session.commit();*/
		return employeeMapper.queryEmp();
	}
	public int checkEmp(String name){
		return employeeMapper.checkEmp(name);
	}
}
