package com.wipro.collection;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQv2 {

	public static void main(String[] args) {
		Queue<String> line = new PriorityQueue<>(Collections.reverseOrder());
		line.add("Amit");
		line.add("Bobby");
		line.add("Chaitanya");
		line.add("Dante");
		System.out.println(line);

	}

}
