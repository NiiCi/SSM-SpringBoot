package com.nc.springBootTest.dao;

import com.nc.springBootTest.entity.Students;


public class StudentMapperImp implements StudentMapper {

	@Override
	public Students updateStu(Students stu) {
		stu.setName(stu.getName());
		stu.setAge(stu.getAge());
		stu.setScore(stu.getScore());
		return stu;
	}
}
