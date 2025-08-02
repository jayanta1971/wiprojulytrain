package com.tcs.entity.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.relationdemo.entity.Author;
import com.tcs.entity.relationdemo.service.AuthorService;
 

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@PostMapping
	void save(@RequestBody Author author)
	{
		  authorService.save(author);
	}
	
	@GetMapping
	List<Author> findAll()
	{
		return authorService.findAll();
	}
	
	

}
