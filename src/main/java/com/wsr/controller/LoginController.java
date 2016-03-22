package com.wsr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wsr.service.LoginService;


@Controller
public class LoginController {

	@Autowired
	public LoginService loginService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String redirectPage(){		
		return "login";		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String redirectToRegisterPage(){	
		List list = loginService.getUsers();
		return "register";		
	}
	
}
