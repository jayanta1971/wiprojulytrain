package com.wipro.collection;

public class GenDemoTest {

	public static void main(String[] args) {
		 
//		GenDemo<Integer> demo= new GenDemo(1);
//		GenDemo<String> demo1= new GenDemo("1"); 
		
		GenDemo2<String,Integer> g1= new GenDemo2();
		g1.printData("Jay", 1);
		
		GenDemo2<String,String> g2= new GenDemo2();
		g2.printData("Jay", "Das");
	}

}
