package com.wipro.bankaccount.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="bank_account")
@Data
public class BankAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="upi_id")
	String upiId;
	
	@Column(name="account_balance")
	double accBalance;
	
	 	
	
	
	
}
