package com.spring.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController2 {

	@RequestMapping("/")
	public String showPage(){
		return"main-menu";
		
	}
}
