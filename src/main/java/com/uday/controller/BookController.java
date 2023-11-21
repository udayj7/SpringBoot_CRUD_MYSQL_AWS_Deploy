package com.uday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uday.entity.Book;
import com.uday.repo.BookRepository;

@RestController
public class BookController {

	@Autowired
	BookRepository r;

	@PostMapping("/")
	public Book createCourse(@RequestBody Book book) {
		return r.save(book);
	}

	@GetMapping("/")
	public List<Book> getBooks() {
		return r.findAll();
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Integer id)
	{
		return r.findById(id).get();
	}
	
	@PutMapping("/{id}")
	public Book updateById(@RequestBody Book book,@PathVariable Integer id)
	{
		r.save(book).getId();
		return book;
	}

	@DeleteMapping("/{id}")
	public Integer deleteById(@PathVariable Integer id)
	{
		r.deleteById(id);
		return id;
	}
}
