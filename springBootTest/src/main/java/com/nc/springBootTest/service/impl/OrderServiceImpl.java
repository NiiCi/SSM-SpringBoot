package com.nc.springBootTest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.dao.OrderMapper;
import com.nc.springBootTest.entity.Orders;
import com.nc.springBootTest.service.OrderDetailService;
import com.nc.springBootTest.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
	/*SqlSession session = MybatisUtil.getSession();
	OrderDao mapper = MybatisUtil.getSession().getMapper(OrderDao.class);*/
	/*ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	OrderMapper mapper = (OrderMapper) ctx.getBean("orderMapper");*/
	@Autowired
	OrderMapper orderMapper;
	public int addOrder(Orders order){
		return orderMapper.addOrder(order);
	}
	public int updateOrder(Orders order){
		return orderMapper.updateOrder(order);
	}
	public int deleteOrder(int orderID){
		return orderMapper.deleteOrder(orderID);
	}
	public int getCount(Orders order){
		return orderMapper.getCount(order);
	}
	public List<Orders> queryAll(Orders order){
		/*session.commit();*/
		return orderMapper.queryAll(order);
	}
}
