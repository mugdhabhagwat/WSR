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


@Controller
public class LoginController {

	@Autowired
	public LoginService loginService;
	
	@Autowired
	LoginService dataService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String redirectPage(){		
		return "login";		
	}
	
	@RequestMapping(@ModelAttribute("projectUsers") ProjectUsers projectUsers)
	public ModelAndView redirectToRegisterPage(){	
		/*List projectUsersList = loginService.getUsers();
		return new ModelAndView("register","projectUsersList",projectUsersList);*/
		
		projectUsers.setprojectUserRoles(null);
		dataService.
		return new ModelAndView("redirect:list");
	}
	
}
