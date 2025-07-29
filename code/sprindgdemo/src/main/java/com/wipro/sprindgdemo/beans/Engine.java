package com.wipro.sprindgdemo.beans;

public class Engine {
	
	String manuFacturer;
	double capacity;
	public String getManuFacturer() {
		return manuFacturer;
	}
	public void setManuFacturer(String manuFacturer) {
		this.manuFacturer = manuFacturer;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Engine [manuFacturer=" + manuFacturer + ", capacity=" + capacity + "]";
	}
	
	
	
}
