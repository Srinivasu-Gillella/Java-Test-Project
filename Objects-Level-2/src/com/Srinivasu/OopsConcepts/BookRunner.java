package com.Srinivasu.OopsConcepts;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(1417, "I Too Had A Love Story", "Ravindar Singh");
		book.addReview(new Review(12007, "Awesome", (byte) 5));
		book.addReview(new Review(12008, "Fantastic", (byte) 4));
		book.addReview(new Review(12009,"Inspiring",(byte)4));
		System.out.println(book);

	}

}
