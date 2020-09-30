package com.Srinivasu.OopsConcepts;

import java.util.ArrayList;

public class Book {
	private int id;
	private String title;
	private String author;

	private ArrayList<Review> reviewList = new ArrayList<Review>();

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	// method to add and call reviews to this class

	public void addReview(Review review) {
		reviewList.add(review);
	}

	public String toString() {
		return String.format("Id - %d,Title - %s,Author - %s,\nReviews - %s", id, title, author,reviewList);
	}
}
