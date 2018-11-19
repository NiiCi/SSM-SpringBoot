package com.nc.springBootTest.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Customers;


public interface CustomerService {
	/*SqlSession session = MybatisUtil.getSession();
	CustomerDao mapper = MybatisUtil.getSession().getMapper(CustomerDao.class);*/
	/*ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	CustomerMapper mapper = (CustomerMapper) ctx.getBean("customerMapper");*/
	public List<Customers> queryCus();
	public int checkCus(String name);
}
