package com.wipro.firstboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.firstboot.repo.MovieRepo;
import com.wipro.firstboot.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepo mevieRepo;
	
	@Override
	public List<String> getMovieList() {
		// TODO Auto-generated method stub
		return mevieRepo.getMovieList();
	}
	
	

}
