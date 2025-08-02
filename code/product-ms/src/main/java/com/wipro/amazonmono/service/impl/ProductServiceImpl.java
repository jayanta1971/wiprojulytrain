package com.wipro.amazonmono.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.wipro.amazonmono.entity.Product;
 import com.wipro.amazonmono.repo.ProdRepo;
 import com.wipro.amazonmono.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProdRepo prodRepo;
	
	@Override
	public void save(Product product) {
		 
		prodRepo.save(product);
	}

	@Override
	public List<Product> findAll() {
		 
		return prodRepo.findAll();
	}

}
