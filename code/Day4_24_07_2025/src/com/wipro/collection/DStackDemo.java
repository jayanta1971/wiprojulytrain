package com.wipro.collection;

import java.util.List;
import java.util.Stack;

public class DStackDemo {

	public static void main(String[] args) {
		 //LIFO -> Stack
		 Stack<String> books = new Stack<>();
		 books.push("Physics");
		 books.push("Maths");
		 books.push("Geography");
		 books.push("Psychology");
		 books.pop();
		 System.out.println(books.peek());
		 
		 

	}

}
