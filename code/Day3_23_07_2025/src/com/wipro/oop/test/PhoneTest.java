package com.wipro.oop.test;

import com.wipro.oop.Apple15Plus;
import com.wipro.oop.SamsungM52;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		Apple15Plus iPhone= new Apple15Plus();
		iPhone.makeCall("9831019762");
		iPhone.sleep();
		
		SamsungM52 samsung = new SamsungM52();
		samsung.makeCall("9831019762");
		samsung.sleep();
		
	}

}
