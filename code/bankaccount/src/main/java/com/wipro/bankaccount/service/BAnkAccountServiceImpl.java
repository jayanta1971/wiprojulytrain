package com.wipro.bankaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.bankaccount.dto.UPI;
import com.wipro.bankaccount.entity.BankAccount;
import com.wipro.bankaccount.repo.BankAccountRepo;
import com.wipro.bankaccount.util.AppConstant;

@Service
public class BAnkAccountServiceImpl implements BankAccountService {

	@Autowired
	BankAccountRepo bankAccountRepo;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@KafkaListener(topics=AppConstant.INCOMING_TOPIC_NAME,groupId="bnk_gpay")
	public void receiveUpiPayment(UPI upi) {
		System.out.println("---Message Received by Bank---"+upi);
		BankAccount bankAccount=bankAccountRepo.findByUpiId(upi.getUpiId());
		if(bankAccount.getAccBalance()>=upi.getTransAmount())
		{
			
			Double newBalance=bankAccount.getAccBalance() -upi.getTransAmount() ;
			bankAccount.setAccBalance(newBalance);
			upi.setStatus(true);
			bankAccountRepo.save(bankAccount);
			kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME,upi);
		} 
		
		
	}

	@Override
	public void save(BankAccount bankAccount) {
		bankAccountRepo.save(bankAccount);
	}

}
