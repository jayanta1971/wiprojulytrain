package com.wipro.sprindgdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.sprindgdemo.beans.Employee;
import com.wipro.sprindgdemo.beans.Student;
 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
//       Student student=(Student)ctx.getBean("student");
//       student.setStudentName("Jayanta");
//       student.setStudentRollNumber("R01");
//       System.out.println(student);    
//    	Employee emp= (Employee)ctx.getBean("employee");
        Employee emp=  ctx.getBean(Employee.class);
    	emp.setEmployeeName("Jayanta");
    	emp.setEmployeeNumber("E01");
    	System.out.println(emp);
    	
    	
    	
    }
}
