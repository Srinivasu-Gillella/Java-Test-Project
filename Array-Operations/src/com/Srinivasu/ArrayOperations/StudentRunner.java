package com.Srinivasu.ArrayOperations;
import java.math.BigDecimal;
public class StudentRunner {

	public static void main(String[] args) {
		
		int [] marks = {99,100,98,96};
	Student student = new Student ("SriniVasu",marks);
	
	int number  =  student.getNumberOfMarks();
	System.out.println("nUMBER oF mARKS iS : "+number);
	
	int sum = student.getSumOfMarks();
	System.out.println("Sum Of Total Marks Is: "+sum);
	
	int maximumMarks = student.getMaximumMarks();
	System.out.println("Maximum marks Are: "+maximumMarks);
	
	int minimumMarks = student.getminimumMarks();
	System.out.println("Minimum Marks Is : "+minimumMarks);
	
	BigDecimal average = student.getAverageMarks();
	System.out.println("Average marks is: "+average);
	
		
		
	}

}
