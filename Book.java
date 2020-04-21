//this is the business
package com.example.Ag1;

import java.util.ArrayList;
import java.util.List;

public class Book {
public List<Books> getBookList(){
		
		List<Books> luli = new ArrayList<>();
		luli.add(new Books(1, "Kush@gmail.com", "NY"));
		luli.add(new Books(2, "Kush1@gmail.com", "JBP"));
		luli.add(new Books(3, "Kush2@gmail.com", "WM"));
		
		return luli;
	}
	

}
