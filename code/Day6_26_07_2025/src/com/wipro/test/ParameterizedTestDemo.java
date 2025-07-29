package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
class ParameterizedTestDemo {

//	@Test
//	void testNum6()
//	{
//		assertTrue(isEven(6));
//	}
//	
//	@Test
//	void testNum9()
//	{
//		assertFalse(isEven(9));
//	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,4,6,8,10})
	void checkEvenPositive(int num)
	{
		assertTrue(isEven(num));
		
	}
	
	 boolean isEven(int num)
	 {
		 return num%2==0;
	 }
}
