package com.wipro.bankaccount.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
public class UPI {
	 
	int id;	 
	String upiId;	 
	String tansNumber;	 
	boolean status;	 
	double transAmount; 
	LocalDate transactionDate;
	

}
