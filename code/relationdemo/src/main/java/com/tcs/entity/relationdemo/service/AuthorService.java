package com.tcs.entity.relationdemo.service;

import java.util.List;

import com.tcs.entity.relationdemo.entity.Author;
 

public interface AuthorService {
	
	void save(Author author);
	List<Author> findAll();

}
