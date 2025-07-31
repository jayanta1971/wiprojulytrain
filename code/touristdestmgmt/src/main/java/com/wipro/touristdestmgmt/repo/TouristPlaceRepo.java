package com.wipro.touristdestmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.touristdestmgmt.entity.TouristPlace;
@Repository
public interface TouristPlaceRepo extends JpaRepository<TouristPlace, Integer> {

}
