package com.wipro.thread;

public class BankThread extends Thread {
	
	BankAccount account;
	boolean withDrawFlag=false;//true means deposit
	double amount;
	
	
	
	public BankThread(BankAccount account, boolean withDrawFlag, double amount) {
		super();
		this.account = account;
		this.withDrawFlag = withDrawFlag;
		this.amount = amount;
	}



	public void run()
	{
		if(withDrawFlag==true)
		{
			account.withdraw(amount);
		}else
		{
			account.deposit(amount);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
