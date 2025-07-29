package com.wipro.clienttest;

import com.wipro.thread.ThreadRunnable;

public class RunnableDemo1 {

	public static void main(String[] args) {
		
		ThreadRunnable r= new ThreadRunnable();
		Thread t= new Thread(r);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
