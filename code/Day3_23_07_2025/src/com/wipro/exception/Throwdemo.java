package com.wipro.exception;

public class Throwdemo {
	
	public static void main(String[] args) {
	
		try {
		System.out.println(staticaddString("Jayanta",""));
		}catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	
	static String staticaddString(String strng1, String string2) throws RuntimeException
	{
		if(strng1.isBlank()||string2.isBlank())
		{
			throw new RuntimeException("Empty string");
		}
		
		return strng1+" "+string2;
	}
	
	

}
