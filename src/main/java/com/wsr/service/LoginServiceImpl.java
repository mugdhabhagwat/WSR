package com.wsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsr.dao.LoginDao;



@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public LoginDao loginDao;

	@SuppressWarnings("rawtypes")
	@Override
	public List getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
