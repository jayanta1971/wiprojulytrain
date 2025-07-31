package com.wipro.usermgmt.service;

import java.util.List;

import com.wipro.usermgmt.dto.User;

public interface UserService {
	List<User> findAll();

	User findByUserName(String userName);

	void update(User user);

	void delete(User user);

	void save(User user);
}
