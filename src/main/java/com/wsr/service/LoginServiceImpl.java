package com.wsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
