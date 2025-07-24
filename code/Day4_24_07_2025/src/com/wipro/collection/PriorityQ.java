package com.wipro.collection;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
	  
		Queue<Integer> line = new PriorityQueue<>(Collections.reverseOrder());
		line.add(12);
		line.add(21);
		line.add(3);
		line.add(63);
		line.add(45);
		line.add(1);
		System.out.println(line);
		line.add(67);
		System.out.println(line);
		line.add(11);
		System.out.println(line);
	}

}
