package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.nc.springBootTest.entity.Orders;


/*@Repository("orderDao")*/
@Mapper
public interface OrderMapper {
	public int addOrder(Orders order);
	public int updateOrder(Orders order);
	public int deleteOrder(int orderID);
	public int getCount(Orders order);
	public List<Orders> queryAll(Orders order);
}
