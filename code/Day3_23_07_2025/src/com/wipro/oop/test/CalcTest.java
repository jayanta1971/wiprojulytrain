package com.wipro.oop.test;

import com.wipro.oop.Calculator;

public class CalcTest {

	public static void main(String[] args) {
		 Calculator calc= new Calculator();
		 //compile time polymorphism
		 System.out.println(calc.add(2, 3));
		 System.out.println(calc.add(2, 3,5));
		 System.out.println(calc.add(2.1, 3.3,5.6));
	}

}
