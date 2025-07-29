package com.wipro.clienttest;

import java.util.Scanner;

import com.wipro.solid.CITIDebitCard;
import com.wipro.solid.HDFCDebitCard;
import com.wipro.solid.ICICICReditCard;
import com.wipro.solid.Payment;
public class Shopping {
public static void main(String[] args) {
	
	Payment card= null;
	System.out.println("Press 1 for CITI");
	Scanner sc = new Scanner(System.in);
	int choice=sc.nextInt();
	if(choice==1)
	{
		card= new ICICICReditCard();
	}
	else if(choice==2)
	{
		card= new HDFCDebitCard();
	}
	else if(choice==3)
	{
		card= new CITIDebitCard();
	}
	
	card.pay();
	
	
}
}
