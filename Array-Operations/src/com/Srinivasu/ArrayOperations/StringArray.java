package com.Srinivasu.ArrayOperations;

public class StringArray {

	public static void main(String[] args) {
		 
		String[] daysOfWeek = {"sunday","Monday","Tuesday","Wendesday","Thursday","Friday","Saturday","Sunday"};
		 
		
		String maximuNumberOfChars = "";
		
		for (String weekDays:daysOfWeek) {
			
			if (weekDays.length() > maximuNumberOfChars.length()) {
				
				maximuNumberOfChars = weekDays;
				
				
			}
			
		}
		System.out.println("maximum Number Of Weekdays Charcaters: "+maximuNumberOfChars);
	}

}
