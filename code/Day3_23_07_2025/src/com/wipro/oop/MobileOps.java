package com.wipro.oop;

public interface MobileOps {
	//all functions in an interface 
	//are abstract and public
	void makeCall(String phoneNumber);
	void takePhoto();
	void turnOnWifi();
	default void sleep()
	{
		System.out.println("default");
	}

}
