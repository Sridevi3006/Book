package com.spring.bookpro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





@Repository
public class BookDao {
	@Autowired
	BookRepository brepo;
	public String addBook(BookEntity b) {
		brepo.save(b);
		return "sucessfully added";
		
	}
	public String addBooks( List<BookEntity> c) {
		brepo.saveAll(c);
		return "sucessfully added";
	}
	public List<BookEntity> getBook(){
		return brepo.findAll();
	}
	public BookEntity getBooks( int id) {
		return brepo.findById(id).get();
	}
	public BookEntity putBook( BookEntity id) {
		return brepo.save(id);
	}
	public String delBook( int id) {
		 brepo.deleteById(id);
		 return "deleted sucessfully";
	}
	public String delBooks( List<BookEntity> d) {
		 brepo.deleteAll(d);
		 return "account deleted";
	}

}
