package com.wipro.amazonmono.service;

import java.util.List;

import com.wipro.amazonmono.entity.Order;
import com.wipro.amazonmono.entity.Product;

public interface ProductService {

	void save(Product product);
	List<Product> findAll();
}
