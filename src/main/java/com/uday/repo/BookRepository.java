package com.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
