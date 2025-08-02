package com.tcs.entity.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.relationdemo.entity.Author;
import com.tcs.entity.relationdemo.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
