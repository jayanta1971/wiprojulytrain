package com.wipro.gpay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.gpay.entity.UPI;

@Repository
public interface GPayRepo extends JpaRepository<UPI, Integer> {

}
