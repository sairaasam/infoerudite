/**
 * 
 */
package com.infoerudite.blog.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infoerudite.blog.service.LoginService;

/**
 * @author sraasam
 * 
 */
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(ModelMap model) {
		
		loginService.addUser();
		return "login";
	}

}
