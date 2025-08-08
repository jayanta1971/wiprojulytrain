package com.wipro.mvcedemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wipro.mvcedemo2.entity.*; 

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@GetMapping("/login")
	String showLoginForm(Model m)
	{
		return "login";
	}
	
	@PostMapping("/loginsubmit")
	String submitLoginForm(@ModelAttribute("logindata") User user,Model m)
	{
		System.out.println(user);
		return "usersuccess";
	}
	
	@PostMapping("/testsubmit")
	String submitTestLoginForm(@ModelAttribute("logindata") User user,Model m)
	{
		 System.out.println("Test Submit");
		 System.out.println();
		 m.addAttribute("user",user);
		return "usersuccess";
	}
 


}
