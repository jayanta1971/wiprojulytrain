package com.tcs.entity.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.relationdemo.entity.Person;
import com.tcs.entity.relationdemo.repo.PersonRepo;
import com.tcs.entity.relationdemo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepo personRepo;
	
	@Override
	public void save(Person person) {
		personRepo.save(person);

	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}

}
