package com.wipro.clienttest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		 System.out.println("-Main started--");
		Callable<String> call= ()->{return "Hello";};
		
		ExecutorService ex= Executors.newFixedThreadPool(1);
		Future<String>future=ex.submit(call);
		String str;
		try {
			str = future.get();
			System.out.println(str);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-Main ended--");
		
 
	}

}
