package com.wipro.aopdemo.aspect;

 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CovidPrecaution {
	
	//public void com.wipro.aopdemo.aspect.showVacCard(Joinpoint jp)
	
	
	@Before("execution(* com.wipro.aopdemo..*(..))")
	void showVacCard(JoinPoint jp)
	{
		System.out.println("Please show your vaccination card");
	}

}
