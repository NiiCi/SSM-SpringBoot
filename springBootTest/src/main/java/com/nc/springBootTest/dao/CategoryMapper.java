package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nc.springBootTest.entity.Categorys;


/*@Repository("categoryDao")*/
@Mapper
public interface CategoryMapper {
	public int addCategory (Categorys cg);
	public int updateCategory (Categorys cg);
	public int deleteCategory (int id);
	public Categorys queryCategoryById (int id);
	public boolean checkCgid(int id);
	public int getCount();
	public List<Categorys> queryAll();
	/*public List<Categorys> queryByPage(int pageIndex,int pageSize);*/
	public boolean queryByName(String name);
	public List<Categorys> queryCates();
}
