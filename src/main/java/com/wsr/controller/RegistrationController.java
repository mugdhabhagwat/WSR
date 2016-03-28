package com.wsr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wsr.dto.ProjectRoles;
import com.wsr.dto.ProjectUsers;
import com.wsr.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	public RegistrationService registrationService;
	
	@RequestMapping("/register")
    public String getRegisterForm(Model model) {
		List<ProjectRoles> projectRoles = new ArrayList<ProjectRoles>();		
		projectRoles = registrationService.getProjectRoles();
		
		model.addAttribute("projectRoles", projectRoles);
        model.addAttribute("user", new ProjectUsers());
        return "register";
	}
	
	
	@RequestMapping("/saveUser")
    public ModelAndView saveUserData(@ModelAttribute("user") ProjectUsers projectUsers, BindingResult result) {

	  registrationService.saveUser(projectUsers);
      return new ModelAndView("redirect:/registrationSuccessful.jsp");

    }

}
