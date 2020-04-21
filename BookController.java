package com.example.Ag1;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@RequestMapping(value = {"/Index"})
	String home() {
		return "Index";
	}
	
	@GetMapping("/books")
	public List<Books> getAllBooks(){
		Book B = new Book();
		List<Books> bookList = B.getBookList();
		return bookList;
		
	}
	

}
