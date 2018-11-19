package com.nc.springBootTest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.dao.OrderDetailMapper;
import com.nc.springBootTest.entity.OrderDetail;
import com.nc.springBootTest.service.OrderDetailService;

@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService{
	@Autowired
	OrderDetailMapper orderDetailMapper;
	public int addOrderDetail(OrderDetail orderDetail){
		return orderDetailMapper.addOrderDetail(orderDetail);
	}
	public int updateOrderDetail(OrderDetail orderDetail){
		return orderDetailMapper.updateOrderDetail(orderDetail);
	}
	public int delOrderDetail(int id){
		return orderDetailMapper.delOrderDetail(id);
	}
	public List<OrderDetail> queryDetailByOrderID (int orderID){
		return orderDetailMapper.queryDetailByOrderID(orderID);
	}
}
