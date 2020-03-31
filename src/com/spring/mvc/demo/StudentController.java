package com.spring.mvc.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{languages}")
	private Map<String, String>programmingLangs;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create student object
		Student theStudent = new Student();
		//add student object to model
		theModel.addAttribute("student",theStudent);
		theModel.addAttribute("theLanguages",programmingLangs);
		return"student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent ){
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";
	}
	
}

