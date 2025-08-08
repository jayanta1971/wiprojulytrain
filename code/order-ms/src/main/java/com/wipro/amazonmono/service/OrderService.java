package com.wipro.amazonmono.service;

import java.util.List;

import com.wipro.amazonmono.dto.OrderResponse;
import com.wipro.amazonmono.entity.Order;

public interface OrderService {

	void save(Order order);
	List<Order> findAll();
	OrderResponse findById(int id);
}
