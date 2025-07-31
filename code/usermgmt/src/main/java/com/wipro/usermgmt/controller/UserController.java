package com.wipro.usermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.usermgmt.dto.User;
import com.wipro.usermgmt.service.UserService;

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
  
  @PutMapping 
  void update(@RequestBody User user)
  {
	  userService.update(user);
  }
  
  @GetMapping 
  List<User> findAll()
  {
	 return userService.findAll();
  }
  
  @DeleteMapping 
  void delete(@RequestBody User user)
  {
	  userService.delete(user);
  }



}
