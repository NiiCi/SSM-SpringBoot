package com.nc.springBootTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Categorys;

public interface CategoryService {
	/*SqlSession session = MybatisUtil.getSession();
	CategoryDao mapper = session.getMapper(CategoryDao.class);*/
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	CategoryMapper mapper = (CategoryMapper) ctx.getBean("categoryMapper");*/

	public int addCategory (Categorys cg);
	public int updateCategory (Categorys cg);
	public int deleteCategory (int id);
	public Categorys queryCategoryById (int id);
	public boolean checkCgid(int id);
	
	/*public List<Categorys> queryByPage(int pageIndex,int pageSize){
		return mapper.quer
	}*/
	public boolean queryByName(String name);
	public int getCount();
	public List<Categorys> queryCates();
	public List<Categorys> queryAll();

}
