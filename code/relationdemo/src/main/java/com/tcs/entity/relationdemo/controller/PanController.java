package com.tcs.entity.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.relationdemo.entity.Pan;
import com.tcs.entity.relationdemo.service.PanService;

@RestController
@RequestMapping("/pan")
public class PanController {
	
	@Autowired
	PanService panService;
	
	@GetMapping
	List<Pan> findAll()
	{
		return panService.findAll();
	}

}
