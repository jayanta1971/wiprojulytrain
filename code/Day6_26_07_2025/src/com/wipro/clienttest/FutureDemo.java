package com.wipro.clienttest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) {
		
		ExecutorService ex= Executors.newFixedThreadPool(2);
		
		Future<String> future=ex.submit(()->{
			
			System.out.println("Task 1 running");
			return "I am done!";
		});
		
		try {
			String str=future.get();
			System.out.println(str);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex.shutdown();

	}

}
