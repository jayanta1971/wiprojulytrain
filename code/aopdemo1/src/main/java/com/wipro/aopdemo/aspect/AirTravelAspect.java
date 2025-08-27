package com.wipro.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.wipro.aopdemo.exception.NoSeatAvailableException;

import jakarta.annotation.PostConstruct;

@Aspect
@Component
public class AirTravelAspect {
	
	@Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))")
	public void showPhotoId(JoinPoint jp) {
	    
	    System.out.println("Showing photo ID before check-in.");
	}
	 
	 
	 @Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.do*(..))")
	 public void showBoardingPass(JoinPoint jp)
	 {
	        System.out.println("Showing boarding pass before security check or boarding.");
	 }
	 
	 @AfterThrowing(pointcut = "execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))", throwing = "ex")
	    public void handleNoSeatException(JoinPoint jp,Throwable ex) 
	 {
	        System.out.println("Exception caught in AOP: " + ex.getMessage());
	    }
	 
}
