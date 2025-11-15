package com.hust.kstn;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public DigitalVideoDisc (String title)
	{
		this.title = title;
		this.category = "Unknown";
		this.director = "Unknown";
		this.length = 0;
		this.cost = 0.0;
	}
	public DigitalVideoDisc (String category, String title, double cost)
	{
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director =  "Uknown";
		this.length = 0;
	}
	
	public DigitalVideoDisc (String director, String cateogory, String title, double cost)
	{
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director =  director;
		this.length = 0;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
	
}
