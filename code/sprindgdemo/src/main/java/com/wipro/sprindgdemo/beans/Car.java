package com.wipro.sprindgdemo.beans;

public class Car {
	
	String make;
	Engine engine;
	
	
	
	public Car(String make, Engine engine) {
		super();
		this.make = make;
		this.engine = engine;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", engine=" + engine + "]";
	}
	
	

}
