package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class StoreTest {
	public static void main (String[] args)
	{
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
	    DigitalVideoDisc dvd4 = new DigitalVideoDisc("The sybau gang", "Meme", "Uncle Hieu", 100, 1000.00);
	    DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 14.99);
	    DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 19.99);
	    
	    Store gallery = new Store();
	    gallery.addDVD(dvd1);
	    gallery.removeDVD(dvd2);
	    
	    gallery.addDVD(dvd2);
	    gallery.addDVD(dvd3);
	    gallery.addDVD(dvd4);
	    gallery.addDVD(dvd5);
	    gallery.addDVD(dvd6);
	    
	    gallery.removeDVD(dvd2);
	}
    
   
    
}
