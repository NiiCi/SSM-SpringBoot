package com.nc.springBootTest.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Providers;


public interface ProviderService {
/*	SqlSession session = MybatisUtil.getSession();
	ProviderDao mapper = MybatisUtil.getSession().getMapper(ProviderDao.class);*/
	
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	ProviderMapper mapper = (ProviderMapper) ctx.getBean("providerMapper");*/
	public int addProvider (Providers pv);
	public int updateProvider (Providers pv);
	public int deleteProvider (int id);
	/*public boolean queryProviderByName (String name);*/
	public boolean checkPvid(int id);
	public int getCount();
	public List<Providers> queryAll();
	/*public List<Providers> queryByPage(int pageIndex,int pageSize);*/
	/*public List<Providers> queryProvider();*/
}
