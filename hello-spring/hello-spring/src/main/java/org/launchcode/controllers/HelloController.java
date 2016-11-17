package org.launchcode.controllers;//this is like a handler, first add controller annotation - see line 5

import javax.servlet.http.HttpServletRequest;

import org.launchcode.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // then when x comes up after typing @controller, click on it to import line 3. this is similar to component annotation related to dependency
public class HelloController { //ea method w/in controller class, will handle an incoming request, associated w/a url
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)//tells spring want incoming requests to be handled by this method, handle GET type of http requests
	@ResponseBody //this allows a string to be returned until we start with templates
	
	public String hello(HttpServletRequest request) {
		
		//get name parameter from request -put parameter in line 17;also name will be null if no parameter, name & person's name, on localhost line in url
		String name = request.getParameter("name");
		
		if (name == null) {
			name = "world";
		}
		return "<h1>" + HelloMessage.getMessage(name) + "<h1>";
	}

}
