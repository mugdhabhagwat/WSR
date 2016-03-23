package com.wsr.dao;

import java.util.List;

import com.wsr.dto.ProjectUsers;

public interface LoginDao {

	@SuppressWarnings("rawtypes")
	public List<ProjectUsers> getUser();
	
}
