package com.akifbatur.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Akif Batur
 * 
 * Controller implementation class for Controller: LoginController
 *
 */
@Controller(value="loginController")
public class LoginController 
{	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public String getIndex(ModelMap model)
	{
		model.addAttribute("activeTab", "login");
		return "login";
	}
}