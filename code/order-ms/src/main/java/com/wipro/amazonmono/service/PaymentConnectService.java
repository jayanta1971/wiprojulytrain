package com.wipro.amazonmono.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.amazonmono.dto.Payment;

@FeignClient(name="PAYMENT-SERVICE")
public interface PaymentConnectService {
	
	@PostMapping("/payment")
	ResponseEntity<Payment> savePaymentData(@RequestBody Payment payment);

	@GetMapping("/payment/order/{id}")
	ResponseEntity<Payment> findPaymentByOrderId(@PathVariable int id);

}
