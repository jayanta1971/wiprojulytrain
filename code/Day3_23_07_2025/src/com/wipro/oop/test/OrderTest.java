package com.wipro.oop.test;

import com.wipro.oop.Order;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order= new Order("order-01",1000,4);
		System.out.println(order);
		
		order.setPrice(2000);
		System.out.println(order.getOrderId());
		
		Order order1= new Order();
		
	}

}
