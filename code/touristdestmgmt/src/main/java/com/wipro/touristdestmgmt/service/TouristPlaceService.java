package com.wipro.touristdestmgmt.service;

import java.util.List;

import com.wipro.touristdestmgmt.entity.TouristPlace;

public interface TouristPlaceService {

	void save(TouristPlace touristPlace);
	List<TouristPlace> findAll();
	TouristPlace findById(int id);
	void deleteById(int id);
	
}
