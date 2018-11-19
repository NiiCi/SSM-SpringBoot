package com.nc.springBootTest.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Products;


public interface ProductService {
/*	SqlSession session = MybatisUtil.getSession();
	ProductDao mapper = session.getMapper(ProductDao.class);*/
	
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ProductMapper mapper = (ProductMapper) ctx.getBean("productMapper");*/
	public int addProduct (Products pd);
	public int updateProduct (Products pd);
	public int deleteProduct (int id);
	public Products queryProductById (int id);
	/*public void queryListProduct(){}*/
	public boolean checkPdid(int id);
	public int getCount();
	public List<Products> queryAll();
	public boolean queryUserByName(String name);
	public List<Products> getPdByName(String product_name);
	public List<Products> getPvByName(String product_name);
	public List<Products> getPdByCgId(int id);
}
