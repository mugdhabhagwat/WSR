package com.wsr.dao;

import java.util.List;

import com.wsr.dto.ProjectRoles;
import com.wsr.dto.ProjectUsers;

public interface RegistrationDao {
	
	public void saveUser(ProjectUsers projectUsers);
	
	public List<ProjectRoles> getProjectRoles();
}
