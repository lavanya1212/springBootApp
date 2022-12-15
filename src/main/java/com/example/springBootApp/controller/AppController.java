package com.example.springBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@RequestMapping("/welcome")
	@ResponseBody
	public String entryPoint() {
		return "Welcome to the Spring Boot app - change1";
	}
}
