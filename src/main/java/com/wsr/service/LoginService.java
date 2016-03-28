package com.wsr.service;

import java.util.List;

import com.wsr.dto.ProjectUsers;

public interface LoginService {
	
	@SuppressWarnings("rawtypes")
	public List<ProjectUsers> getUsers();	

}
