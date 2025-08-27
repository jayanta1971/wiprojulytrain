package com.wipro.stockconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wipro.stockconsumer.dto.Stock;

@Component
public class StockConsumer1 {
	@KafkaListener(topics = "stock-price", groupId = "group_id")
    public void consume(Stock msg) {
        System.out.println("Consumed message: " + msg);
    }
}
