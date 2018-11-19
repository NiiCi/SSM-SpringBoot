package com.nc.springBootTest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.dao.ProductMapper;
import com.nc.springBootTest.entity.Products;
import com.nc.springBootTest.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
/*	SqlSession session = MybatisUtil.getSession();
	ProductDao mapper = session.getMapper(ProductDao.class);*/
	
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ProductMapper mapper = (ProductMapper) ctx.getBean("productMapper");*/
	
	@Autowired
	ProductMapper productMapper;
	public int addProduct (Products pd){
		return productMapper.addProduct(pd);
	}
	public int updateProduct (Products pd){
		
		return productMapper.updateProduct(pd);
	}
	public int deleteProduct (int id){
		return productMapper.deleteProduct(id);
	}
	public Products queryProductById (int id){
		return productMapper.queryProductById(id);
	}
	/*public void queryListProduct(){}*/
	public boolean checkPdid(int id){
		return productMapper.checkPdid(id);
	}
	public int getCount(){
		return productMapper.getCount();
	}
	public List<Products> queryAll(){
		return productMapper.queryAll();
	}
	public boolean queryUserByName(String name){
		return productMapper.queryUserByName(name);
	}
	public List<Products> getPdByName(String product_name){
		return productMapper.getPdByName(product_name);
	}
	public List<Products> getPvByName(String product_name){
		return productMapper.getPvByName(product_name);
	}
	public List<Products> getPdByCgId(int id){
		return productMapper.getPdByCgId(id);
	}
}
