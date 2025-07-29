package com.wipro.calc;

public class Calculator {

	public int add(int a ,int b)
	{
		return a+b;
	}
	
	public int subtract(int a ,int b)
	{
		return a-b;
	}
	
	public int multiply(int a ,int b)
	{
		return 0;
	}
	public int division(int a ,int b) throws ArithmeticException
	{
		if(b==0) throw new ArithmeticException("Divide By Zero");
		return a/b;
	}
	
}
