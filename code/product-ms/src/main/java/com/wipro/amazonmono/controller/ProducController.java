package com.wipro.amazonmono.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
import com.wipro.amazonmono.entity.Product;
 
import com.wipro.amazonmono.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProducController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping
	ResponseEntity<String> save(@RequestBody Product product)
	{
		
		HttpHeaders headers= new HttpHeaders();
		headers.add("created-at", LocalDate.now().toString()); 
		productService.save(product);
		return ResponseEntity				
				.status(201)
				.headers(headers)
				.body("Data Saved Successfully");
		
	}

	@GetMapping
	ResponseEntity<List<Product>> findAll()
	{
		List<Product> list =productService.findAll();
		HttpStatusCode httpStatusCode=null;
		if(list.size()==0)
		{
			httpStatusCode=HttpStatusCode.valueOf(404);
			
		}else
		{
			httpStatusCode=HttpStatusCode.valueOf(200);
		}
		
		return ResponseEntity
				.status(httpStatusCode)
				.body(list);
	}
}
