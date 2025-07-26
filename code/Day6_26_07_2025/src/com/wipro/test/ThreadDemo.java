package com.wipro.test;

import com.wipro.menudemo.MyThread;

public class ThreadDemo {
	
	
	public static void main(String[] args) {
		System.out.println("--Main Thread Starts--");
		MyThread t1= new MyThread(1);
		MyThread t2= new MyThread(2);
		
		try {
		
			t1.start();
			t1.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--Main Thread Ends--");
	}

}
