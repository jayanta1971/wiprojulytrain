package com.tcs.entity.relationdemo.service;

import java.util.List;

import com.tcs.entity.relationdemo.entity.Person;
import com.tcs.entity.relationdemo.entity.User;

public interface PersonService {
	void save(Person person);
	List<Person> findAll();
}
