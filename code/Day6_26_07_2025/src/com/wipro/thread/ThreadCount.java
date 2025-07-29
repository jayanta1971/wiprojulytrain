package com.wipro.thread;

import com.wipro.menudemo.Counter;

public class ThreadCount extends Thread {

	Counter counter=null;
	
	
	
	public ThreadCount(Counter counter) {
		super();
		this.counter = counter;
	}



	public void run()
	{
		for(int i=0;i<5;i++)
		{
			counter.increment();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
