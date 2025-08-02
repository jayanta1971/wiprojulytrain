package com.wipro.amazonmono.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.amazonmono.entity.Order;
import com.wipro.amazonmono.repo.OrderRepo;
import com.wipro.amazonmono.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public void save(Order order) {
		 
		orderRepo.save(order);
	}

	@Override
	public List<Order> findAll() {
		 
		return orderRepo.findAll();
	}

}
