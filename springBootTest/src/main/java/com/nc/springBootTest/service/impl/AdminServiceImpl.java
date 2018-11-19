package com.nc.springBootTest.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.dao.AdminMapper;
import com.nc.springBootTest.entity.Admin;
import com.nc.springBootTest.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
/*	SqlSession session = MybatisUtil.getSession();
	AdminDao mapper = session.getMapper(AdminDao.class);*/
//	
/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	AdminMapper mapper = (AdminMapper) ctx.getBean("adminMapper");*/
	@Autowired
	AdminMapper adminMapper;
	/*@Autowired*/
	
	public Admin AdminLogin(String name,String password){
		return adminMapper.AdminLogin(name, password);
	}

	public int addAdmin(Admin admin){
		return adminMapper.addAdmin(admin);
	}
	

	public int addAdminList(List<Admin> adminList){
		//��List��װ��Map keyֵΪadminList
		Map<String, List<Admin>> maps = new HashMap<String, List<Admin>>();
		maps.put("adminList", adminList);
		return adminMapper.addAdminList(maps);
	}
	
/*	public Admin queryAdminByName(String name){
		return dao.queryAdminByName(name);
	}*/

	public int updateAdmin(Admin admin){
		return adminMapper.updateAdmin(admin);
	}
	
/*	public int getCount() {
		return adminMapper.getCount();
	}
	
	public List<Admin> queryByPage(int pageIndex, int pageSize){
		return adminMapper.queryByPage(pageIndex, pageSize);
	}*/

	public int deleteAdmin(int id){
		return adminMapper.deleteAdmin(id);
	}
	

	public Admin queryAdminByName(String admin_name) {
		return adminMapper.queryAdminByName(admin_name);
	}
	

	public Admin queryPasswordByName(String admin_name){
		return adminMapper.queryPasswordByName(admin_name);
	}
	
	@Cacheable(cacheNames="queryAdminAll")
	public List<Admin> queryAll() {
		/*session.commit();*/
		return adminMapper.queryAll();
	}
}
