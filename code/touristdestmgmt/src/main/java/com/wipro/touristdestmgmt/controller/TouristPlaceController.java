package com.wipro.touristdestmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.touristdestmgmt.entity.TouristPlace;
import com.wipro.touristdestmgmt.service.TouristPlaceService;

@RestController
@RequestMapping("/touristplace")
public class TouristPlaceController {
	@Autowired
	TouristPlaceService touristPlaceService;
	
	@PostMapping
	void save(@RequestBody TouristPlace touristPlace)
	{
		touristPlaceService.save(touristPlace);
	}
	
	@GetMapping
	List<TouristPlace> findAll()
	{
		return touristPlaceService.findAll();
		
	}
	
	
	@GetMapping("/{id}")
	TouristPlace findById(@PathVariable int id)
	{
		return touristPlaceService.findById(id);
		
	}
	
	@PutMapping 
	void update(@RequestBody TouristPlace touristPlace)
	{
		  touristPlaceService.save(touristPlace);
		
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		  touristPlaceService.deleteById(id);
		
	}

}
