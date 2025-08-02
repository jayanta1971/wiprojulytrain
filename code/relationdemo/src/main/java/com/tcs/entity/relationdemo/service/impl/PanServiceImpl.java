package com.tcs.entity.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.relationdemo.entity.Pan;
import com.tcs.entity.relationdemo.repo.PanRepo;
import com.tcs.entity.relationdemo.service.PanService;

@Service
public class PanServiceImpl implements PanService {

	@Autowired
	PanRepo panRepo;
	
	@Override
	public List<Pan> findAll() {
		// TODO Auto-generated method stub
		return panRepo.findAll();
	}

}
