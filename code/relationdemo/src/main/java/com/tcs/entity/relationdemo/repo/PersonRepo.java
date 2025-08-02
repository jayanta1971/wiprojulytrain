package com.tcs.entity.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.relationdemo.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
