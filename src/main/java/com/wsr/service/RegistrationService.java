package com.wsr.service;

import java.util.List;

import com.wsr.dto.ProjectRoles;
import com.wsr.dto.ProjectUsers;

public interface RegistrationService {
	
	public void saveUser(ProjectUsers projectUsers);
	
	public List<ProjectRoles> getProjectRoles();

}
