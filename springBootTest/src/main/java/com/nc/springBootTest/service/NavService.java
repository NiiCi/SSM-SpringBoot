package com.nc.springBootTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Pers;
import com.nc.springBootTest.entity.Roles;

public interface NavService {
	public List<Roles> queryRolesByName(String admin_name);
	public List<Pers> queryPersByRoleid(int roleid,String admin_name);
	public List<Pers> queryAllPers(String admin_name);
}
