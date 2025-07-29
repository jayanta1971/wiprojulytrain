package com.wipro.clienttest;

public class RunnableDemo2 {
	
	public static void main(String[] args) {
		
		//Runnable r= ()-> System.out.println("Running--");
		
		Thread t = new Thread(()-> System.out.println("Running--"));
		t.start();
		
		
		
	}

}
