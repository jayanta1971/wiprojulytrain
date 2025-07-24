package com.wipro.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	 
		Deque<String> persons= new LinkedList<>();
		persons.offer("Jayanta");
		persons.offer("Amit");
		persons.offer("Vasu");
		persons.offer("Abdul");
		persons.offerFirst("Soma");
		persons.offerFirst("Soma");
		persons.offerFirst(null);
		persons.offerFirst(null);
		persons.removeLast();
		System.out.println(persons);
	}

}
