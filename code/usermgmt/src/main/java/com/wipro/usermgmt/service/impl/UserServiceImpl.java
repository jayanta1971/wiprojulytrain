package com.wipro.usermgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.usermgmt.dto.User;
import com.wipro.usermgmt.repo.UserRepo;
import com.wipro.usermgmt.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepo.findByUserName(userName);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userRepo.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userRepo.delete(user);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}
	
	

}
