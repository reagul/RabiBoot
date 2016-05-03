package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "Spring Boot ready";
	}

}
