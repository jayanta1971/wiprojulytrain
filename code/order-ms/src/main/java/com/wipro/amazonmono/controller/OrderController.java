package com.wipro.amazonmono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.amazonmono.dto.OrderResponse;
import com.wipro.amazonmono.entity.Order;
import com.wipro.amazonmono.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	void save(@RequestBody Order order)
	{
		
		orderService.save(order);
		
		
	}

	@GetMapping
	List<Order> findAll()
	{
		return orderService.findAll();
	}
	
	@GetMapping("/{id}")
	OrderResponse findById(@PathVariable int id)
	{
		System.out.println("--Here--");
		return orderService.findById(id);
	}
}
