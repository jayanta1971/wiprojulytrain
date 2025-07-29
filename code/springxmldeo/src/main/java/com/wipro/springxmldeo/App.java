package com.wipro.springxmldeo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	 HelloBean bean= context.getBean(HelloBean.class);
    	 System.out.println(bean);
    	 HelloBean bean1=(HelloBean)context.getBean("hello");
    	 System.out.println(bean1);
    
    }
}
