package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {

    public static void main(String[] args) {
     
    	Cart anOrder = new Cart();
    	
    	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The sybau gang", "Meme", "Uncle Hieu", 100, 1000.00);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 14.99);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 19.99);
        
        //Xoa san pham khi gio hang rong
        anOrder.removeDVD(dvd6);
        
        //Add 20 san pham toi da(voi tat ca cac phuong thuc add moi)
        anOrder.addDVD(dvd1);
        anOrder.addDVD(dvd3, dvd4);
        DigitalVideoDisc[] discs = {dvd2,dvd6,dvd5};
        anOrder.addDVD(discs);
        
        for(int i = 0; i < 14; i++) {
            anOrder.addDVD(new DigitalVideoDisc("DVD Filler " + (i+1)));
        }
        anOrder.addDVD(new DigitalVideoDisc("OverLimit DVD"));
        
        //Xoa san pham khong ton tai
        anOrder.removeDVD(new DigitalVideoDisc("Lion pizza chicken"));
        
        //In thong tin gio hang
        anOrder.print();
        
        
        
        
    }   
}