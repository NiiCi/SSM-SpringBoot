package com.nc.springBootTest.dao;



import org.apache.ibatis.annotations.Mapper;

import com.nc.springBootTest.entity.Students;

@Mapper
public interface StudentMapper {
	public Students updateStu(Students stu);
}
