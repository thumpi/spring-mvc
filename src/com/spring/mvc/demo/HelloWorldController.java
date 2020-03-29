package com.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;

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
	
	@RequestMapping("/processFormVersionTwo")
	public String getdataToUppercase(HttpServletRequest request, Model model) {
		String theName=request.getParameter("studentName");
		theName=theName.toUpperCase();
		String message= "Hello " + theName;
		model.addAttribute("studentName", message);
		
	 return "helloworld";
	}
}
	
	//need a controller  method to process the html form

