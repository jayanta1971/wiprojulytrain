package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	 @GetMapping("/")
	String hello(Model m) 
	{
		m.addAttribute("message","This is Hello");
		return "index";
	}
	}
