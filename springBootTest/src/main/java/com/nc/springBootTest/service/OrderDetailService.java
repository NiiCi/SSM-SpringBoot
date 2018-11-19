package com.nc.springBootTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.OrderDetail;


public interface OrderDetailService {
	public int addOrderDetail(OrderDetail orderDetail);
	public int updateOrderDetail(OrderDetail orderDetail);
	public int delOrderDetail(int id);
	public List<OrderDetail> queryDetailByOrderID (int orderID);
}
