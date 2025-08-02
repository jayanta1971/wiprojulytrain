package com.tcs.entity.relationdemo.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.relationdemo.entity.Author;
import com.tcs.entity.relationdemo.entity.Book;
import com.tcs.entity.relationdemo.repo.AuthorRepo;
import com.tcs.entity.relationdemo.repo.BookRepo;
import com.tcs.entity.relationdemo.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepo authorRepo;
	
	@Autowired
	BookRepo bookRepo;
	
	@Override
	public void save(Author author) {
  
		 
		authorRepo.save(author);

	}

	@Override
	public List<Author> findAll() {
		// TODO Auto-generated method stub
		return authorRepo.findAll();
	}

}
