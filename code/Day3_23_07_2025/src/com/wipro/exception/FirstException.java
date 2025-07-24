package com.wipro.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstException {
	
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
		
			fis= new FileInputStream("d://Hello.java");
			Scanner sc= new Scanner(System.in);
			int y= sc.nextInt();
			int x= 3/y;
			System.out.println(x);			
//			str.toUpperCase();
			String str="35a";
			int num=Integer.parseInt(str);
			System.out.println(num);
			
		}
		catch(ArithmeticException ex)
		{
			
			System.out.println("Divided by Zero");
		}
		catch(FileNotFoundException ex)
		{
			//ex.printStackTrace();
			System.out.println("File Not found!!");
		}
		catch(NumberFormatException ex)
		{
			//ex.printStackTrace();
			System.out.println("Number Format Exception!!");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally { //clean up
			System.out.println("Inside Finally");
			fis=null;
			
		}
	}

}
