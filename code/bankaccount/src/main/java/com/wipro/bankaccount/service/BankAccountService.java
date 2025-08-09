package com.wipro.bankaccount.service;

import com.wipro.bankaccount.dto.UPI;
import com.wipro.bankaccount.entity.BankAccount;

public interface BankAccountService {

	void receiveUpiPayment(UPI upi);
	void save(BankAccount bankAccount);
	
	
	
}
