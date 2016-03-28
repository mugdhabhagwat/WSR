package com.wsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsr.dao.RegistrationDao;
import com.wsr.dto.ProjectRoles;
import com.wsr.dto.ProjectUsers;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao registrationDao;

	 
	@Override
	public void saveUser(ProjectUsers projectUsers) {
		registrationDao.saveUser(projectUsers);
	}

	@Override
	public List<ProjectRoles> getProjectRoles() {
		return registrationDao.getProjectRoles();		
	}

}
