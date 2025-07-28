package com.wipro.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,23,45,66,9,7);
		List<Integer> sortedList=list
		.stream()
		//.sorted((a,b)->a.compareTo(b))
		.sorted(Integer::compareTo)
		.collect(Collectors.toList());
		System.out.println(sortedList);
		
		
	}

}
