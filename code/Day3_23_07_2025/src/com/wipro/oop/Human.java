package com.wipro.oop;

public class Human implements AnimalOps {

	@Override
	public void move() {
		System.out.println("Human walking");

	}
	
	public void smile()
	{
		System.out.println("Human smiling");
	}

}
