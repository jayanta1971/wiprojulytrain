package com.wipro.touristdestmgmt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.touristdestmgmt.entity.TouristPlace;

public interface TouristPlaceService {

	void save(TouristPlace touristPlace);
	List<TouristPlace> findAll();
	TouristPlace findById(int id);
	void deleteById(int id);
	List<TouristPlace> findByToristPlaceType(String toristPlaceType);
	
//	Page<TouristPlace> findAll(Pageable p);
	
}
