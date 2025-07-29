package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.calc.Calculator;

class TestDemo {

	 @Test
	 void sameString()
	 {
		 String str="Jayanta";
		 String str1=new String("Jayanta1");
		 assertNotSame(str,str1);
	 }
	 
	 @Test
	 void nullCheck()
	 {
		 String str=null;
		 assertNull(str);
		 
	 }
	 
	 @Test
	 void exceptionCheck()
	 {
		 assertThrows(ArithmeticException.class,()->{
			int x=5/0; 
		 });
		 
	 }
	 @Test
	 void divisionExceptionCheck()
	 {
		 
		 assertThrows(ArithmeticException.class,()->{
			 Calculator calc= new Calculator();
			 calc.division(3, 0);
		 });
		 
	 }
	 @Test
	    void testExample() {
	        assertDoesNotThrow(() -> {

 
	        });
	    }
	  
	  
}
