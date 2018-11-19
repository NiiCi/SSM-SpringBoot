package com.nc.springBootTest.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.nc.springBootTest.entity.Nav;
import com.nc.springBootTest.entity.Pers;
import com.nc.springBootTest.entity.Roles;
import com.nc.springBootTest.service.NavService;

@Controller
public class NavController {
	@Autowired
	NavService navService;
	/*@RequestMapping(value="/navController",method=RequestMethod.POST)
	@ResponseBody*/
	public Object getNav(@RequestParam String admin_name){
		List<Roles> roleList = navService.queryRolesByName(admin_name);
		List<Nav> navList = new ArrayList<>();
		for (Roles roles : roleList) {
			Nav nav = new Nav();
			nav.setRoleDesc(roles.getRoleDesc());
			nav.setRoleCode(roles.getRoleCode());
			System.out.println("-----"+roles.getRoleDesc());
			List<Pers> perList = navService.queryPersByRoleid(roles.getRoleid(),admin_name);
			for (Pers pers : perList) {
				System.out.println("-----"+pers.getPerDesc());
			}
			nav.setPers(perList);
			navList.add(nav);
		}
		return navList;
	}
}
