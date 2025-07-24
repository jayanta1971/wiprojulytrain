package com.wipro.oop.test;

import java.util.Scanner;

import com.wipro.oop.Bank;
import com.wipro.oop.CitiBank;
import com.wipro.oop.HDFC;

public class BankTest {

	public static void main(String[] args) {
		
//		CitiBank citiBank=new CitiBank();	
//		citiBank.setAccountNumber("CITI01");
//		citiBank.setAccountType("SAVINGS");
//		citiBank.setBranchAddress("KOLKATA");
//		citiBank.setIfscCode("CITI00001");
//		System.out.println(citiBank);
//		citiBank.printStatement();
		int x=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter 0 for CITI 1 for Hdfc");
		x= sc.nextInt();
		Bank bank=null;
		if(x==0)
		{
			 bank= new CitiBank();//non abstract class is called Concrete class
		}
		else
		{
			bank= new HDFC();
		}
		bank.setAccountNumber("ACC01");
		bank.printStatement();
		

	}

}
