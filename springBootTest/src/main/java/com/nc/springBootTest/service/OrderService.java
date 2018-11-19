package com.nc.springBootTest.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Orders;


public interface OrderService {
	/*SqlSession session = MybatisUtil.getSession();
	OrderDao mapper = MybatisUtil.getSession().getMapper(OrderDao.class);*/
	/*ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	OrderMapper mapper = (OrderMapper) ctx.getBean("orderMapper");*/
	public int addOrder(Orders order);
	public int updateOrder(Orders order);
	public int deleteOrder(int orderID);
	public int getCount(Orders order);
	public List<Orders> queryAll(Orders order);
}
