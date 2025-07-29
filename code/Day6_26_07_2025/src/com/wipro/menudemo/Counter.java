package com.wipro.menudemo;

public class Counter {
	
	int count=0;
	
	synchronized public void increment()
	{
		count++;
	}
	
	public int getCount()
	{
		return this.count;
	}
	

}
