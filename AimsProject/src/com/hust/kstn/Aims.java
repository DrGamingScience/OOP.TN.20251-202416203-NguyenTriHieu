package com.hust.kstn;

public class Aims {

    public static void main(String[] args) {
        
        //Creating new cart
        Cart anOrder = new Cart();
        
        //Constructing DVDs to add to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The sybau gang", "Meme", "Uncle Hieu", 100, 1000.00);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 14.99);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 19.99);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 12.99);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Matrix", "Science Fiction", "The Wachowskis", 136, 15.99);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Gladiator", "Action", "Ridley Scott", 155, 13.99);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 11.99);
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 16.99);
        DigitalVideoDisc dvd12 = new DigitalVideoDisc("Jurassic Park", "Science Fiction", "Steven Spielberg", 127, 14.49);
        DigitalVideoDisc dvd13 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 17.99);
        DigitalVideoDisc dvd14 = new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 13.49);
        DigitalVideoDisc dvd15 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 12.49);
        DigitalVideoDisc dvd16 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 18.49);
        DigitalVideoDisc dvd17 = new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 15.49);
        DigitalVideoDisc dvd18 = new DigitalVideoDisc("The Social Network", "Drama", "David Fincher", 120, 10.99);
        DigitalVideoDisc dvd19 = new DigitalVideoDisc("The Lord of the Rings: The Return of the King", "Fantasy", "Peter Jackson", 201, 19.99);
        DigitalVideoDisc dvd20 = new DigitalVideoDisc("Harry Potter and the Sorcerer's Stone", "Fantasy", "Chris Columbus", 152, 14.99);
        
        //Removing from an empty cart
        System.out.println("--- DEMO XÓA SẢN PHẨM KHI GIỎ HÀNG TRỐNG ---");
        anOrder.removeDVD(dvd1);
        System.out.println("---------------------------------");
        
        //Adding to an empty cart
        System.out.println("--- DEMO THÊM SẢN PHẨM ---");
        anOrder.addDVD(dvd1);
        anOrder.addDVD(dvd2);
        anOrder.addDVD(dvd3);
        anOrder.addDVD(dvd4);
        anOrder.addDVD(dvd5);
        anOrder.addDVD(dvd6);
        anOrder.addDVD(dvd7);
        anOrder.addDVD(dvd8);
        anOrder.addDVD(dvd9);
        anOrder.addDVD(dvd10);
        anOrder.addDVD(dvd11);
        anOrder.addDVD(dvd12);
        anOrder.addDVD(dvd13);
        anOrder.addDVD(dvd14);
        anOrder.addDVD(dvd15);
        anOrder.addDVD(dvd16);
        anOrder.addDVD(dvd17);
        anOrder.addDVD(dvd18);
        anOrder.addDVD(dvd19);
        anOrder.addDVD(dvd20);

        //Printing bill
        anOrder.print();
        System.out.println("Total Cost: " + anOrder.calculateTotalCost() + "$");
        System.out.println("---------------------------------");
        
        //Adding to a full cart
        System.out.println("\n--- DEMO THÊM SẢN PHẨM VÀO GIỎ HÀNG ĐẦY ---");
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("Extra DVD", "Genre", "Director", 120, 9.99);
        anOrder.addDVD(dvd21);
        System.out.println("---------------------------------");

        //Removing a DVD still in the cart
        System.out.println("\n--- DEMO XÓA SẢN PHẨM ---");
        anOrder.removeDVD(dvd10);

        //Removing a DVD not in the cart
        anOrder.removeDVD(dvd10);
        System.out.println("---------------------------------");

    
        
    }
}