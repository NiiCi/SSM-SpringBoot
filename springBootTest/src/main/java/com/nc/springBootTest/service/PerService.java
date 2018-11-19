package com.nc.springBootTest.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.springBootTest.entity.Pers;
import com.nc.springBootTest.entity.Role_Pers;


public interface PerService {
	public List<Pers> queryPersByRoleid(int roleid);
	public List<Pers> queryPersAll();
	public int addPer(Pers pers);
	public int updatePer(Pers pers);
	public int deletePer(int perid);
	public int addRolePers(List<Role_Pers> perList);
	public int deleteRolePers(int roleid);
}
