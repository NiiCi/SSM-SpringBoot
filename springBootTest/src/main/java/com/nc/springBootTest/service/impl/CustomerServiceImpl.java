package com.nc.springBootTest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.dao.CustomerMapper;
import com.nc.springBootTest.entity.Customers;
import com.nc.springBootTest.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	/*SqlSession session = MybatisUtil.getSession();
	CustomerDao mapper = MybatisUtil.getSession().getMapper(CustomerDao.class);*/
	/*ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	CustomerMapper mapper = (CustomerMapper) ctx.getBean("customerMapper");*/
	@Autowired
	CustomerMapper customerMapper;
	public List<Customers> queryCus(){
		/*session.commit();*/
		return customerMapper.queryCus();
	}
	public int checkCus(String name){
		return customerMapper.checkCus(name);
	}
}
