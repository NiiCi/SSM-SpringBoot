package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.nc.springBootTest.entity.Customers;

/*@Repository("customerDao")*/
@Mapper
public interface CustomerMapper {
	public List<Customers> queryCus();
	public int checkCus(String name);
}
