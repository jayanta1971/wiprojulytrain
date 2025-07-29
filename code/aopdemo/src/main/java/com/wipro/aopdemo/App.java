package com.wipro.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.aopdemo.bean.Booking;

/**
 * Hello world!
 *
 */
 
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
    	ctx.scan("com.wipro.aopdemo.*");
    	ctx.refresh();
    	Booking booking=ctx.getBean(Booking.class);
    	booking.showBookingSlip();
    	booking.showPhotoId();
    	booking.pay();
    	
    }
}
