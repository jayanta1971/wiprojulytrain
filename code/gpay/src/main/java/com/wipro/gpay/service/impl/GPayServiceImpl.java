package com.wipro.gpay.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.gpay.entity.UPI;
import com.wipro.gpay.repo.GPayRepo;
import com.wipro.gpay.service.GPayService;
import com.wipro.gpay.util.AppConstant;
@Service
public class GPayServiceImpl implements GPayService {

	@Autowired
	GPayRepo gPayRepo;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	

	
	@Override
	public void pay(UPI upi) {
		  upi.setStatus(false);
		  upi.setTransactionDate(LocalDate.now());		 
		  gPayRepo.save(upi);
		  kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, upi);
		  
	}

	@Override
	public void sendBankTransaction(UPI upi) {
		// TODO Auto-generated method stub

	}

}
