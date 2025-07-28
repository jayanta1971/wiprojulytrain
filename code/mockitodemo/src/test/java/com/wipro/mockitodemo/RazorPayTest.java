package com.wipro.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

 

import org.junit.jupiter.api.Test;
 
 
import java.util.*;
import static org.mockito.Mockito.*;
class RazorPayTest {

	@Test
	void test() {

	    List<String> list= mock(List.class);
	    when(list.get(0)).thenReturn("Element 0");
	    String str=list.get(0);
	    assertEquals(str,"Element 0");    
	    
	}
	@Test
	void razorPayTest()
	{
		RazorPay razorPay=mock(RazorPay.class);
		when(razorPay.pay(1000)).thenReturn(true);
	
		assertTrue(razorPay.pay(1000));	
		verify(razorPay).pay(1000);
		
		
	}

	@Test
	void checkTrx()
	{
		RazorPay razorPay=mock(RazorPay.class);
		when(razorPay.checkTransactionStatus("trx01")).thenReturn(true);
		assertTrue(razorPay.checkTransactionStatus("trx01"));
		
		
	}
}
