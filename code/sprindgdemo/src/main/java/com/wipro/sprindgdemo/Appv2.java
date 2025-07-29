package com.wipro.sprindgdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.sprindgdemo.beans.Car;
import com.wipro.sprindgdemo.beans.House;
import com.wipro.sprindgdemo.beans.Room;
 
public class Appv2 {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Appv2.class);
		//ctx.refresh();
		ctx.scan("com.wipro.sprindgdemo.*");		
//		Room room=ctx.getBean(Room.class);
//		System.out.println(room);
		House house= ctx.getBean(House.class);
		System.out.println(house.getRoom());
 
	 
	}

}
