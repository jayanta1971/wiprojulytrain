package com.wipro.amazonmono.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.amazonmono.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
