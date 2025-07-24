package com.wipro.oop;

public class Vehicle {
	String color;
	String fuelType;
	int numberOfWheels;
	
	
	public Vehicle() {
		super();
		System.out.println("Vehicle Construnctor");
	}
	public Vehicle(String color, String fuelType, int numberOfWheels) {
		super();
		this.color = color;
		this.fuelType = fuelType;
		this.numberOfWheels = numberOfWheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", fuelType=" + fuelType + ", numberOfWheels=" + numberOfWheels + "]";
	}
	
	
	
}
