package com.wipro.paymentms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import jakarta.annotation.PostConstruct;
 
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}
	
	@Value("${spring.datasource.url}")
	private String dbUrl;

	@PostConstruct
	public void printProperties() {
	    System.out.println("Datasource URL: " + dbUrl);
	}

}


