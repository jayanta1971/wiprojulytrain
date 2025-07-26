package com.wipro.annonymous.test;

import com.wipro.annonymous.AddFn;
import com.wipro.annonymous.DoubleNum;

public class LambdaTest1 {

	public static void main(String[] args) {
		//int sum(int a, int b);
//		AddFn addFn= (a,b)-> {return a+b;};
//		
//		int x= addFn.sum(2,3);
//		System.out.println(x);
		
		DoubleNum dNum= a-> {return a*2;};
		System.out.println(dNum.doDouble(12));
		
	}

}
