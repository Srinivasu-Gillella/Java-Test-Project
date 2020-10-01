package com.srinivasu.inheritanceconcepts;

public class Student extends Person {

	private String collegeName;
	private int year;
	private int rollNumber;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String toString() {
	
		return super.toString()+"***" + collegeName +"***"+ year+"***" + rollNumber;
	}
}
