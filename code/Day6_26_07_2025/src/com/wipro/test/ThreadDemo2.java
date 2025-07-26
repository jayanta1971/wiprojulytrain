package com.wipro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.wipro.menudemo.EvenThreadProcessor;
import com.wipro.menudemo.OddThreadProcessor;

public class ThreadDemo2 {

	
	
	public static void main(String[] args) {
		 
		List<Integer> list= new ArrayList<>();
		list= Arrays.asList(1,4,5,8,44,21,31,24,68);
	    EvenThreadProcessor evenThread= new EvenThreadProcessor(list);
	    evenThread.start();
	    
	    OddThreadProcessor oddThread= new OddThreadProcessor(list);
	    oddThread.start();
	    try {
			evenThread.join();
			oddThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		

	}

}
