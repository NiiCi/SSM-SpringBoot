package com.nc.springBootTest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Role_Admin;
import com.nc.springBootTest.entity.Roles;


public interface RoleService {
	
	public List<Roles> queryRole();
	public int queryRoleidByName(String roleName);
	public int addRole(Roles roles);
	public int updateRole(Roles roles);
	public int deleteRole(int roleid);
	public int addAdminRole(List<Role_Admin> role);
	public int deleteAdminRole(int admin_id);
}
