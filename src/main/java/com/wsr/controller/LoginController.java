package com.wsr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wsr.dto.ProjectUsers;
import com.wsr.service.LoginService;


public class LoginController {

	
	public LoginService loginService;
	
	
	LoginService dataService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String redirectPage(){		
		return "login";		
	}
}
