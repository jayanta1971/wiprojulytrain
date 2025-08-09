package com.wipro.stockproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.stockproducer.dto.Stock;
import com.wipro.stockproducer.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockProducerController {
	@Autowired
	StockService stockService;
	
	@PostMapping
	void sendStockData(@RequestBody Stock stock)
	{
		stockService.sendStockData(stock);
	}

}
