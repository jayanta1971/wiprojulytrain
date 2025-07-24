package com.wipro.oop;

public class CitiBank extends Bank {

	@Override
	public double withdraw(String accountNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposit(String accountNumber, double amount) {
		// TODO Auto-generated method stub
		
	}
	public void printStatement(){
		System.out.println("Printing Statement for CITIBANK account number="+this.accountNumber);
	}
}
