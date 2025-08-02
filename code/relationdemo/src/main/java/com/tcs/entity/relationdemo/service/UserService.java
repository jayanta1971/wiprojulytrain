package com.tcs.entity.relationdemo.service;

import java.util.List;

import com.tcs.entity.relationdemo.entity.User;

public interface UserService {
	
	void save(User user);
	List<User> findAll();
	

}
