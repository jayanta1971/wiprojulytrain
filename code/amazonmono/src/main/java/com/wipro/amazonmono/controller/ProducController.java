package com.wipro.amazonmono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.amazonmono.entity.Order;
import com.wipro.amazonmono.entity.Product;
import com.wipro.amazonmono.service.OrderService;
import com.wipro.amazonmono.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProducController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	void save(@RequestBody Product product)
	{
		
		productService.save(product);
		
		
	}

	@GetMapping
	List<Product> findAll()
	{
		return productService.findAll();
	}
}
