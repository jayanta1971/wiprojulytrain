package com.wipro.bankaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankaccount.entity.BankAccount;
import com.wipro.bankaccount.service.BankAccountService;

@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
	BankAccountService bankAccountService;
	
	@PostMapping
	void save(@RequestBody BankAccount account)
	{
		bankAccountService.save(account);
		
		
	}

}
