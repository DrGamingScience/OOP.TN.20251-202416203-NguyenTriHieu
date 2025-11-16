package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; 



public class BookTest {
	public static void main(String[] args)
	{
		BookAuthor authorOda = new BookAuthor("Oda", 1955, "Famous manga artist");
		BookAuthor authorHieu = new BookAuthor("Tri Hieu", 2000, "Student Developer");
		List<BookAuthor> authorsList = new ArrayList<>(Arrays.asList(authorOda, authorHieu));
		Book B1 = new Book("One Piece", 2.2, "Shounen", 3000, authorsList);
		
		System.out.println(B1.toString());
		System.out.println(authorOda.toString());
		System.out.println(authorHieu.toString());
		
		
	}
}
