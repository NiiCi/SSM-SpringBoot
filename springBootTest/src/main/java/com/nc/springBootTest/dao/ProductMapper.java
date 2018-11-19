package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nc.springBootTest.entity.Products;




@Mapper
public interface ProductMapper {
	public int addProduct (Products pd);
	public int updateProduct (Products pd);
	public int deleteProduct (int id);
	public Products queryProductById (int id);
	/*public void queryListProduct();*/
	public boolean checkPdid(int id);
	public int getCount();
	public List<Products> queryAll();
	/*public List<Products> queryUserByPageIndex(int pageIndex, int pageSize);*/
	public boolean queryUserByName(String name);
	public List<Products> getPdByName(String name);
	public List<Products> getPvByName(String name);
	public List<Products> getPdByCgId(int id);
}
