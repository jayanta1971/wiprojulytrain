package com.wipro.staticdemo;

public class StaticTest {

	public static void main(String[] args) {
	 
		StaticDemo demo1= new StaticDemo();
		demo1.staticData=17;
		demo1.nonStaticData=10;
		
		StaticDemo demo2= new StaticDemo();
		System.out.println(demo2.staticData);
		System.out.println(demo2.nonStaticData);
	}

}
