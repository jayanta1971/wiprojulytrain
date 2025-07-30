package com.wipro.webmvc1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.webmvc1.service.ProdService;
import com.wipro.webmvc1.service.repo.ProdRepo;

@Service
public class ProdServiceImpl implements ProdService {
	@Autowired
	ProdRepo prodRepo;
	
	@Override
	public List<String> getProductList() {
		 
		return prodRepo.getProductList();
	}

}
