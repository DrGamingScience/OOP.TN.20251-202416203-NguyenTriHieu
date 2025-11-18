package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	private List<BookAuthor> authors = new ArrayList<>();
	int numOfTokens;
		
	public String toString() {
		 return super.toString() 
		 + "[" + this.numOfTokens + "]"
		 + "\nAuthors: " + this.authors;
		 }
	
	public Book(String title, double cost, String category,int numOfTokens, List<BookAuthor> authors) 
	{
			 super(title, cost, category);
			 this.numOfTokens = numOfTokens;
			 this.authors = authors;
	}
	
	public int getNumOfTokens() { return numOfTokens; }
	public List<BookAuthor> getAuthors() { return authors; }
	

}
