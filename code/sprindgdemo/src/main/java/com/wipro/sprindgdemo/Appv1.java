package com.wipro.sprindgdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wipro.sprindgdemo.beans.*;
import com.wipro.sprindgdemo.beans.Car;

public class Appv1 {

	public static void main(String[] args) {
		 
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		Car car= ctx.getBean(Car.class);
//		Engine engine= new Engine();
//		car.setEngine(engine);
		System.out.println(car);
	}

}
