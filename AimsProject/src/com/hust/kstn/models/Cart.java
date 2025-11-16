package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added successfully");
        } else {
            System.out.println("The cart is almost full");
        }
    }
    
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        addDVD(disc1); 
        addDVD(disc2);
    }
    
    public void addDVD(DigitalVideoDisc[] discs) {
        if (discs == null) return;
        for (DigitalVideoDisc disc : discs) {
            if (disc != null) {
                addDVD(disc); 
            }
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }

        int indexToRemove = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            
            for (int i = indexToRemove; i < qtyOrdered - 1; i++) {
                itemsInCart[i] = itemsInCart[i + 1];
            }
            itemsInCart[qtyOrdered - 1] = null; 
            qtyOrdered--;
            System.out.println("The disc has been removed successfully");
        } else {
            System.out.println("The disc does not exist");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsInCart[i].getCost();
        }
        return totalCost;
    }

    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("All items in cart ===");
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc item = itemsInCart[i];
            System.out.println("[Title]: " + item.getTitle() + ", " + "[Cost]: " + item.getCost());
        }
    }
}