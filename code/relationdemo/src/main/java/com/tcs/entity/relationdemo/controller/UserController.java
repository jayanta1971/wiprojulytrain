package com.tcs.entity.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.relationdemo.entity.User;
import com.tcs.entity.relationdemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	
	
	@PostMapping
	void save(@RequestBody User user)
	{
		userService.save(user);
		
	}
	
	@GetMapping
	List<User> findAll()
	{
		return userService.findAll();
		
	}

}
