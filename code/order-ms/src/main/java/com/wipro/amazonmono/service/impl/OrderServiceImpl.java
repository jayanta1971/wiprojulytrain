package com.wipro.amazonmono.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.amazonmono.dto.OrderResponse;
import com.wipro.amazonmono.dto.Payment;
import com.wipro.amazonmono.entity.Order;
import com.wipro.amazonmono.repo.OrderRepo;
import com.wipro.amazonmono.service.OrderService;
import com.wipro.amazonmono.service.PaymentConnectService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
 

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	PaymentConnectService paymentConnectService;
	 
	@Override
	@CircuitBreaker(name="order-cb" , fallbackMethod="handleFallBack")
	public void save(Order order) {
		order.setOrderStatus("I");
		orderRepo.save(order);//insert
//		RestTemplate  rest= new RestTemplate();
//			String url="http://localhost:9012/payment";
		String url="http://payment-ms/payment";
			Payment payment=new Payment();
		payment.setOrderId(order.getId());
		payment.setPaymentAmount(order.getOrderValue());
		payment.setPaymentStatus(true);
		
 
		
//		try {
//			
		ResponseEntity<Payment>   response=paymentConnectService.savePaymentData(payment);
		//ResponseEntity<Payment>   response= restTemplate.postForEntity(url, payment, Payment.class);
			
		if(response.getStatusCode()==HttpStatusCode.valueOf(200))
		{
			order.setOrderStatus("P");
			
		}
//		 
//		}catch(Exception ex)
//		{
//			System.out.println(ex);
//			order.setOrderStatus("C");
//		}
		orderRepo.save(order);//update
	}

	@Override
	public List<Order> findAll() {
		 
		return orderRepo.findAll();
	}
	
	@Override
	public OrderResponse findById(int id) {
		 
		OrderResponse response=new OrderResponse();
		Order order=orderRepo.findById (id).get();
		response.setOrder(order);
		//ResponseEntity<Payment> pmt=restTemplate.getForEntity("http://localhost/payment/order/"+id, Payment.class);
 		ResponseEntity<Payment> pmt=paymentConnectService.findPaymentByOrderId(id);
		response.setPayment(pmt.getBody());
		return response;
		 
	}
	
	
	
	void handleFallBack(Throwable t)
	{
		
		System.out.println("--System is down--");
		 
	}

}
