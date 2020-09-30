package com.Srinivasu.OopsConcepts;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address HomeAddress = new Address("BhavaniNagar","kadapa","India","516002"); 
		Customer customer = new Customer("Srinivasu",HomeAddress);
		System.out.println(customer);
		
		Address WorkAddress = new Address("L.B Nagar","Hyderabad","India","500074");
		customer.setWorkAddress(WorkAddress);
		System.out.println(customer);
	}

}
