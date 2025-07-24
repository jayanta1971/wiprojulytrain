package com.wipro.oop;

public class Calculator {
	//method over loading 
	// name of the method same 
	// their return type and/or arguments/parameters
	// are different 
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b,int c)
	{
		return a+b+c;
	}
	
	public double add(double a, double b,double c)
	{
		return a+b+c;
	}
	
	

}
