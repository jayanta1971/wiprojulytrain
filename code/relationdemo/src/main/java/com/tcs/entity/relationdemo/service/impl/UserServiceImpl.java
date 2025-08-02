package com.tcs.entity.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.relationdemo.entity.User;
import com.tcs.entity.relationdemo.repo.UserRepo;
import com.tcs.entity.relationdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void save(User user) {
		userRepo.save(user);

	}

	@Override
	public List<User> findAll() {
		 
		return userRepo.findAll();
	}

}
