package com.spring.bookpro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class BookService {
	@Autowired
	BookDao bdao;
	public String addBook(BookEntity b) {
		return bdao.addBook(b);
	}
	public String addBooks( List<BookEntity> c) {
		 return bdao.addBooks(c);
	}
	public List<BookEntity> getBook(){
		return bdao.getBook();
	}
	public BookEntity getBooks( int id) {
		return bdao.getBooks(id);
	}
	public BookEntity putBook( BookEntity id) {
		return bdao.putBook(id);
	}
	public String delBook( int id) {
		return bdao.delBook(id);
	}
	public String delBooks( List<BookEntity> d) {
		return bdao.delBooks(d);
	}

}
