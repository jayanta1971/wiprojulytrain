package com.wipro.clienttest;

import com.wipro.menudemo.Counter;
import com.wipro.thread.ThreadCount;

public class CounterTest {
public static void main(String[] args) {
	Counter counter = new Counter();
	ThreadCount t1= new ThreadCount(counter);
	t1.start();
	ThreadCount t2= new ThreadCount(counter);
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(counter.getCount());
}
}
