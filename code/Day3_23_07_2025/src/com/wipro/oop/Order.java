package com.wipro.oop;

public class Order {
	
	String orderId;
	double price;
	int numberOfItems;
	
	public Order()
	{
		
	}
	
	//parameterized constructor
	public Order(double price, int numberOfItems) {
		super();
		this.price = price;
		this.numberOfItems = numberOfItems;
	}


	public Order(String orderId, double price, int numberOfItems) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.numberOfItems = numberOfItems;
	}





	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}





	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", price=" + price + ", numberOfItems=" + numberOfItems + "]";
	}
	
		

}
