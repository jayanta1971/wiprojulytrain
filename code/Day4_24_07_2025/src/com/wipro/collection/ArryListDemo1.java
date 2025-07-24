package com.wipro.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArryListDemo1 {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		list.add(1);
//		list.add("a");
//		list.add(12.3);
//		int i=Integer.parseInt(list.get(1).toString());
//		System.out.println(i);
		Integer[] list= {1,2,3,4};
		
		List myList=  Arrays.asList(list);
		System.out.println(myList);
		
	}

}
