package com.wipro.mvcxmldemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloCOntroller {
  
	@GetMapping 
	String hello(Model m)
	{
		System.out.println("Herere");
		m.addAttribute("name","jayanta");
		List<String> names = Arrays.asList("John", "Mary", "David");
		m.addAttribute("list", names);
		return "hello";
	}
	
}
