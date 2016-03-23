package com.wsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beingjavaguys.domain.Project;
import com.beingjavaguys.domain.ProjectProgress;
import com.wsr.dao.LoginDao;
import com.wsr.dto.ProjectUsers;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public LoginDao loginDao;

	@SuppressWarnings("rawtypes")
	@Override
	public List<ProjectUsers> getUsers() {
		List list = loginDao.getUser();
		return list;
	}

	@Override
	public int insertRow(ProjectUsers projectUsers) {
		ProjectUsers project = new ProjectUsers();
		Project.setProj_id(Integer.valueOf(projectUsers.getUserName()));
		projProgress.setProject(project);
		return dataDao.insertRow(projProgress);
	}
}
