package com.wipro.aopdemo.bean;

import org.springframework.stereotype.Component;

@Component
public class Booking {
	
	
	public void showBookingSlip()
	{
		
		System.out.println("--showBookingSlip--");
	}
	
	public void showPhotoId()
	{
		System.out.println("--showPhotoId--");
	}
	
	public void pay()
	{
		System.out.println("--pay--");
	}


}
