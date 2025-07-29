package com.wipro.sprindgdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Room {
	
	int numberWindows;
	int numberOfDoors;
	double roomSize;
	public int getNumberWindows() {
		return numberWindows;
	}
	public void setNumberWindows(int numberWindows) {
		this.numberWindows = numberWindows;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public double getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(double roomSize) {
		this.roomSize = roomSize;
	}
	@Override
	public String toString() {
		return "Room [numberWindows=" + numberWindows + ", numberOfDoors=" + numberOfDoors + ", roomSize=" + roomSize
				+ "]";
	}
	
	

}
