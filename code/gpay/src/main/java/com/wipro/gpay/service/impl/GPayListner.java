package com.wipro.gpay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.gpay.entity.UPI;
import com.wipro.gpay.repo.GPayRepo;
import com.wipro.gpay.util.AppConstant;

@Service
public class GPayListner {

	@Autowired
	GPayRepo gPayRepo;
	
	@KafkaListener(topics=AppConstant.INCOMING_TOPIC_NAME,groupId="gpay_bnk")
	void processBankMessage(UPI upi)
	{
		
		System.out.println("--Message Received by GPay="+upi);
		UPI upiDb=gPayRepo.findById(upi.getId()).get();
		upiDb.setStatus(upi.isStatus());
		gPayRepo.save(upiDb);
		
	}
	
	
	
}
