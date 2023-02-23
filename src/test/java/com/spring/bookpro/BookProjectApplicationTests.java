package com.spring.bookpro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class BookProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private BookService bser;
	@MockBean
	private BookRepository brepo;

	@Test
	public void savetest() {
		BookEntity bo = new BookEntity();
		when(brepo.save(bo)).thenReturn(bo);
		assertEquals("sucessfully added", bser.addBook(bo));
	}

}
