package com.tcs.entity.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.relationdemo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
