package com.wipro.amazonmono.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.amazonmono.entity.Order;
import com.wipro.amazonmono.entity.Product;

@Repository
public interface ProdRepo extends JpaRepository<Product, Integer> {

}
