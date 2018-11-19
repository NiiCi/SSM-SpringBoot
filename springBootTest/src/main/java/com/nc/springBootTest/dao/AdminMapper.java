package com.nc.springBootTest.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.annotation.QueryAnnotation;

import com.nc.springBootTest.entity.Admin;
import com.nc.springBootTest.entity.Pers;
import com.nc.springBootTest.entity.Roles;


/*@Repository("adminDao")*/

@Mapper
public interface AdminMapper {
	public Admin AdminLogin(@Param("name") String name,@Param("password")String password);
	public int addAdmin(Admin admin);
	public int addAdminList(Map maps);
	public Admin queryAdminByName(String admin_name);
	public Admin queryPasswordByName(@Param("admin_name") String admin_name);
	public int updateAdmin(Admin admin);
	public int getCount();
	public List<Admin> queryByPage(@Param("pageIndex") int pageIndex, @Param("pageSize")int pageSize);
	public int deleteAdmin(int id);
	public List<Admin> queryAll();
	public List<Roles> queryRolesByName(String name);
	public List<Pers> queryAllPers(String name);
}
