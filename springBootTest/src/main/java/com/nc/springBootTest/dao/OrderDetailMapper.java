package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.nc.springBootTest.entity.OrderDetail;


@Mapper
public interface OrderDetailMapper {
	public int addOrderDetail(OrderDetail orderDetail);
	public int updateOrderDetail(OrderDetail orderDetail);
	public int delOrderDetail(int id);
	public int getCount(String orderID);
	public List<OrderDetail> queryDetailByOrderID (int orderID);
}
