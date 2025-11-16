package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class Book {
	private List<BookAuthor> authors = new ArrayList<>();
	private static int counter = 0;
	private String title;
	private double cost;
	private String category;
	private int numOfTokens;
	private int id;
	public String toString() {
		 return "Book[" + this.id + "][" 
		 + this.title + "][" 
		 + this.cost + "][" 
		 + this.category + "]["
		 + this.numOfTokens + "]"
		 + "\nAuthors: " + this.authors;
		}
	
	public Book(String title, double cost, String category, int numOfTokens, List<BookAuthor> authors) {
		this.id = ++counter; 

		this.title = title;
		this.cost = cost;
		this.category = category;
		this.numOfTokens = numOfTokens;
		this.authors = authors; 
	}
	public int getId() { return id; }
	public String getTitle() { return title; }
	public double getCost() { return cost; }
	public String getCategory() { return category; }
	public int getNumOfTokens() { return numOfTokens; }
	public List<BookAuthor> getAuthors() { return authors; }
	
	public void print()
	{
		System.out.println(toString());
	}
}
