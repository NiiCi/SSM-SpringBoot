package com.nc.springBootTest.service;


import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.nc.springBootTest.entity.Admin;

public interface AdminService {
/*	SqlSession session = MybatisUtil.getSession();
	AdminDao mapper = session.getMapper(AdminDao.class);*/
//	
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	AdminMapper mapper = (AdminMapper) ctx.getBean("adminMapper");*/
	
	/*@Autowired*/
	
	public Admin AdminLogin(String name,String password);
	public int addAdmin(Admin admin);
	public int addAdminList(List<Admin> adminList);
/*	public Admin queryAdminByName(String name){
		return dao.queryAdminByName(name);
	}*/
	public int updateAdmin(Admin admin);
/*	public int getCount();
	public List<Admin> queryByPage(int pageIndex, int pageSize);*/
	public int deleteAdmin(int id);
	public Admin queryAdminByName(String admin_name);
	public Admin queryPasswordByName(String admin_name);

	public List<Admin> queryAll();
}
