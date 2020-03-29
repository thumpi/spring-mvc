package com.spring.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	//need a controller  method to show the initial html form
	@RequestMapping("/form")
	public String showForm() {
	 return "helloworld-form";
	}	
	
	@RequestMapping("/processForm")
	public String filledForm() {
	 return "helloworld";
	}
	}
	
	//need a controller  method toprocess the html form

