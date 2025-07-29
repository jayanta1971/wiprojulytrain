package com.wipro.clienttest;

import com.wipro.thread.BankAccount;
import com.wipro.thread.BankThread;

public class BankThredDemo {

	public static void main(String[] args) {
		
		BankAccount bnk= new BankAccount("Acc01",10000);
		Thread t1= new BankThread(bnk,true,1000);
		Thread t2= new BankThread(bnk,false,500);
		Thread t3= new BankThread(bnk,false,500);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bnk.getBalance());
	}

}
