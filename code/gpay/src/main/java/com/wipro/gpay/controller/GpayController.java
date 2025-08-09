package com.wipro.gpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.gpay.entity.UPI;
import com.wipro.gpay.service.GPayService;

@RestController
@RequestMapping("/pay")
public class GpayController {
	
	@Autowired
	GPayService gPayService;
	
	@PostMapping
	void pay(@RequestBody UPI upi)
	{
		gPayService.pay(upi);
	}
	

}
