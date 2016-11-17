package org.launchcode.blogz.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthenticationController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)//tells spring want incoming requests to be handled by this method, handle GET type of http requests
	
	
	public String login(HttpServletRequest request) {
		return "login";
		//get name parameter from request -put parameter in line 17;also name will be null if no parameter, name & person's name, on localhost line in url
		       //   may use the following code later  -> String name = request.getParameter("login form");
	
	}
}
