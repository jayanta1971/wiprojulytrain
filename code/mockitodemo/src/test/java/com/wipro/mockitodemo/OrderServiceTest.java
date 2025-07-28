package com.wipro.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderServiceTest {

	 @Test
	 void placeOrderTest()
	 {
		 OrderService service= new OrderService();
		 String status= service.placeOrder("ORD01");
		 assertNull(status);
		 
	 }
	 
	 @Test
	 void cancelOrderTest()
	 {
		 OrderService service= new OrderService();
		 String status= service.cancelOrder("ORD01");
		 assertNull(status);
		 
	 }
	 
	 @Test
	 void payForOrderTest()
	 {
		 OrderService service= new OrderService();
		 Boolean flag= service.payForOrder("ORD-01");
		 assertFalse(flag);
		 
	 }
}
