package com.wipro.clienttest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutoServiceDemo1 {

	public static void main(String[] args) {

		ExecutorService ex= Executors.newFixedThreadPool(2);
		
		ex.submit(()->{
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task 1 submitted");
			
		});
		
		ex.submit(()->{
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task 2 submitted");
		});
		
		ex.submit(()->{
			System.out.println("Task 3 submitted");
			
		});
		
		
		ex.shutdown();
		
		
		
		

	}

}
