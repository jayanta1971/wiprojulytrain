package com.wipro.aopdemo.aspect;

import org.aopalliance.intercept.Joinpoint;
 
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CovidPrecaution {
	
	//public void com.wipro.aopdemo.aspect.showVacCard(Joinpoint jp)
	
	
	@Before("execution(* com.wipro.aopdemo..*(..))")
	void showVacCard(Joinpoint jp)
	{
		System.out.println("Please show your vaccination card");
	}

}
