/**
 * 
 */
package com.infoerudite.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infoerudite.blog.service.LoginService;

/**
 * @author sraasam
 *
 *This Class is used for the user login functionality
 */
@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){		
		//model.addAttribute("usersList", loginService.addUser());  
		loginService.addUser();
	    return "login"; 	
	}
	

}
