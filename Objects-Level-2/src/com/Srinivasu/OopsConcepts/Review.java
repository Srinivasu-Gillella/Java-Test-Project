package com.Srinivasu.OopsConcepts;

public class Review {
	private int id;
	private String description;
	private byte rating;

	// constructor

	public Review(int id, String description, byte rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;

	}

	public String toString() {
		return String.format("[Review Number - %d,Description - %s,Rating - %d]\n", id, description, rating);
	}
}
