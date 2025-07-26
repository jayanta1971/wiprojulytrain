package com.wipro.stream;

import java.util.Optional;
import java.util.function.Supplier;
import java.lang.Exception.*;
public class OptionalDemo {

	public static void main(String[] args) {

//		String str= Optional.ofNullable(null).orElse("Default").toString();
		String source="Jayanta";
		Supplier<String> s =()->{return new RunTimeException("Data not present");}; 
		Optional<String>str=Optional
				       .ofNullable(source)
				       .orElseThrow(s);		
		System.out.println(str);
	}

}
