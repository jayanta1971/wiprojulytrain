package com.wipro.annonymous.test;

import java.util.function.Consumer;

public class ConsumeTest {

	public static void main(String[] args) {
		 
		
		Consumer<Integer> nextNumber = (num)-> System.out.println(num+1); 
		nextNumber.accept(12);
 

	}

}
