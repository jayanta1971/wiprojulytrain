package com.wipro.touristdestmgmt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.touristdestmgmt.entity.TouristPlace;
import com.wipro.touristdestmgmt.repo.TouristPlaceRepo;
import com.wipro.touristdestmgmt.service.TouristPlaceService;

@Service
public class TouristPlaceServiceImpl implements TouristPlaceService {

	@Autowired
	TouristPlaceRepo touristPlaceRepo;
	
	@Override
	public void save(TouristPlace touristPlace) {
		touristPlaceRepo.save(touristPlace);
	}

	@Override
	public List<TouristPlace> findAll() {
	 
		return touristPlaceRepo.findAll();
	}

	@Override
	public TouristPlace findById(int id) {
		Optional<TouristPlace> touristPlace=touristPlaceRepo.findById(id);
		if(!touristPlace.isEmpty())
		{
			return touristPlace.get();
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		 
		touristPlaceRepo.deleteById(id);
	}

}
