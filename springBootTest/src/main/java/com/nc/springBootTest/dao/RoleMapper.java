package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nc.springBootTest.entity.Role_Admin;
import com.nc.springBootTest.entity.Roles;

@Mapper
public interface RoleMapper {
	public List<Roles> queryRole();
	public int queryRoleidByName(String roleName);
	public int addRole(Roles roles);
	public int updateRole(Roles roles);
	public int deleteRole(int roleid);
	public int addAdminRole(@Param("roleList") List<Role_Admin> role);
	
	//�����û�id ɾ�����û���ɫ
	public int deleteAdminRole(int admin_id);
}
