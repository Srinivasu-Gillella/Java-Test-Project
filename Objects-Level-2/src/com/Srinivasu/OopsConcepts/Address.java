package com.Srinivasu.OopsConcepts;

public class Address {
	//state
	private String line1;
	private String city;
	private String country;
	private String zip;
	
	//constructor
	public Address(String line1,String city,String country,String zip) { 
		super();
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public String toString() {
		return String.format("line1 -[%s],city -[%s],country - [%s],zip - [%s]",
				line1,city,country,zip);
				
	}
	
	

	
}
