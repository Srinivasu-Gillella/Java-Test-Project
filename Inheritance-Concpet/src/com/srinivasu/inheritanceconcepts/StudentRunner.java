package com.srinivasu.inheritanceconcepts;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setCollegeName("Viganan's University");
		student.setEmail("srinivasuyadav98@gmail.com");
		student.setName("Srinivasu Yadav");
		student.setPhoneNumber("8106273145");
		student.setRollNumber(12007);
		student.setYear(2017);
		System.out.println(student);
	}
 
}
