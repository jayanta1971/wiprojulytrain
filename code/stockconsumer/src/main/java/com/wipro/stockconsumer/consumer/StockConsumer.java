package com.wipro.stockconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StockConsumer {
	@KafkaListener(topics = "stock-price", groupId = "group_id")
    public void consume(String msg) {
        System.out.println("Consumed message: " + msg);
    }
}
