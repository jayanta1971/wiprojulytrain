package com.wipro.gpay.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="upi")
@Data
public class UPI {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="upi_id")
	String upiId;
	
	@Column(name="trans_number")
	String tansNumber;
	
	@Column(name="status")
	boolean status;
	
	@Column(name="trans_amount")
	double transAmount;
	
	
	@Column(name="transaction_date")
	LocalDate transactionDate;
	

}
