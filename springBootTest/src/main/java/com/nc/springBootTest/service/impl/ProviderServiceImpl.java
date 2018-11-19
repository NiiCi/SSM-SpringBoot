package com.nc.springBootTest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.dao.ProviderMapper;
import com.nc.springBootTest.entity.Providers;
import com.nc.springBootTest.service.ProviderService;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService{
/*	SqlSession session = MybatisUtil.getSession();
	ProviderDao mapper = MybatisUtil.getSession().getMapper(ProviderDao.class);*/
	
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ProviderMapper mapper = (ProviderMapper) ctx.getBean("providerMapper");*/
	@Autowired
	ProviderMapper providerMapper;
	public int addProvider (Providers pv){
		return providerMapper.addProvider(pv);
	}
	public int updateProvider (Providers pv){
		return providerMapper.updateProvider(pv);
	}
	public int deleteProvider (int id){
		return providerMapper.deleteProvider(id);
	}
	/*public boolean queryProviderByName (String name);*/
	public boolean checkPvid(int id){
		return providerMapper.checkPvid(id);
	}
	public int getCount(){
		return providerMapper.getCount();
	}
	public List<Providers> queryAll(){
		
		return providerMapper.queryAll();
	}
	/*public List<Providers> queryByPage(int pageIndex,int pageSize);*/
	/*public List<Providers> queryProvider();*/
}
