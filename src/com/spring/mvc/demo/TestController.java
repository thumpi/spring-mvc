package com.spring.mvc.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	
	@RequestMapping("/bla")
	public String FormVersionTwo() {
			return"main-menu";
	}
	

}
