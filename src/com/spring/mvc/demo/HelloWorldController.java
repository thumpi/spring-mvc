package com.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HttpServletBean;

@Controller
public class HelloWorldController {
	//need a controller  method to show the initial html form
	@RequestMapping("/form")
	public String showForm() {
	 return "helloworld-form";
	}	
	
//	@RequestMapping("/processForm")
//	public String filledForm() {
//	 return "helloworld";
//	}
	
	@RequestMapping("/processFormVersionTwo")
	public String getdataToUppercase(@RequestParam("studentName") String theName, Model model) {
		theName=theName.toUpperCase();
		String message= "Hello " + theName;
		model.addAttribute("studentName", message);
		
	 return "helloworld";
	}
}
	
	//need a controller  method to process the html form

