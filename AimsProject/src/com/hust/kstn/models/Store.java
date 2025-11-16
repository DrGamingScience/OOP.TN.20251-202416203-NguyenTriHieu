package com.hust.kstn.models;

public class Store {
	private static final int MAX_ITEMS_IN_STORE = 100;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
	private int qtyInStore = 0;	
	
	public void addDVD (DigitalVideoDisc disc)
	{
		if(qtyInStore < MAX_ITEMS_IN_STORE)
		{
			itemsInStore [qtyInStore] = disc;
			qtyInStore++;
			System.out.println("DVD " + disc.getTitle() + " has been added."); 
		}
		else
		{
			System.out.println("Store is temporarily full.");
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc)
	{

		if (qtyInStore == 0)
		{
			System.out.println("Cannot remove. The store is empty.");
			return;
		}

		for (int i = 0; i < qtyInStore; i++)
		{
			if (itemsInStore[i] == disc)
			{
				
				for (int j = i; j < qtyInStore - 1; j++)
				{
					itemsInStore[j] = itemsInStore[j+1];
				}
				itemsInStore[qtyInStore - 1] = null;
				qtyInStore--;
				System.out.println("DVD has been removed.");
				return;
			}
		}
		System.out.println("Not found. Disc cannot be removed.");
	}
}