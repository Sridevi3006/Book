package com.spring.bookpro;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class BookController {
	@Autowired
	BookService bser;
	
	@PostMapping(value="/add")
	public String addBook(@RequestBody BookEntity b) {
		return bser.addBook(b);
	}
	@PostMapping (value="/list")
	public String addBooks(@RequestBody List<BookEntity> c) {
	 return bser.addBooks(c);
	}
	@GetMapping(value="/listed")
	public List<BookEntity> getBook(){
		return bser.getBook();
	}
	@GetMapping(value="/id/{id}")
	public BookEntity getBooks(@PathVariable int id) {
		return bser.getBooks(id);
	}
	@PutMapping(value="/ids")
	public BookEntity putBook(@RequestBody BookEntity id) {
		return bser.putBook(id);
	}
	@DeleteMapping(value="/del/{id}")
	public String delBook(@PathVariable int id) {
		return bser.delBook(id);
	}
	@DeleteMapping(value="/dels")
	public String delBooks(@RequestBody List<BookEntity> d) {
		return bser.delBooks(d);
	}
	

}
