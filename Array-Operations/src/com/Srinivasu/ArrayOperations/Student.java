package com.Srinivasu.ArrayOperations;
import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
		System.out.println("Student Name is: "+this.name);
	}

	public int getNumberOfMarks() {
		int number = marks.length;
		return number;
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}
	

	public int getMaximumMarks() {
		int maximumMarks = Integer.MIN_VALUE;
		for (int mark:marks) {
			if(mark > maximumMarks) {
				maximumMarks = mark;
			}
		}
		return maximumMarks;
	}

	public int getminimumMarks() {
		int minimumMarks = Integer.MAX_VALUE;
		for (int mark:marks) {
			if(mark < minimumMarks) {
				minimumMarks = mark;
			}
		}
		return minimumMarks;
	}

	public BigDecimal getAverageMarks() {
		int sum = getSumOfMarks();
		int number = getNumberOfMarks();
		BigDecimal average = new BigDecimal (sum).divide(new BigDecimal (number));  
		return average;
	}
	
}
