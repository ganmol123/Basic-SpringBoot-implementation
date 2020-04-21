//This is our POJO - Plain Old Java Object

package com.example.Ag1;
public class Books {
	long id;
	String name;
	String author;
	
	public Books(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
}
