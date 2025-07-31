package com.wipro.usermgmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/hello")
	String sayHello(@RequestParam String name,@RequestParam String title)
	{
		return "Welcome " +name+" "+ title + " to Spring Boot REST";
	}

}
