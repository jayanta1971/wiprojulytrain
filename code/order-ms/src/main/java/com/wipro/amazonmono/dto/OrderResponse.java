package com.wipro.amazonmono.dto;

import com.wipro.amazonmono.entity.Order;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class OrderResponse {
	Order order;
	Payment payment;


}
