package com.wsr.dao;

import java.util.List;

import com.wsr.dto.ProjectUsers;

public interface LoginDao {

	
	public List<ProjectUsers> getUser();
	public List findUserRolebyUserName(String username); // throws UsernameNotFoundException;
	
}
