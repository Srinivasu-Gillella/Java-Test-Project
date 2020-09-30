package com.Srinivasu.OopsConcepts;

public class Customer {
	// state
	private String name;
	private Address HomeAddress;
	private Address WorkAddress;

	public Customer(String name, Address HomeAddress) {

		this.name = name;
		this.HomeAddress = HomeAddress;
	}

	// operations
	public Address getHomeAddress() {
		return HomeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		HomeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return WorkAddress;
	}

	public void setWorkAddress(Address WorkAddress) {
		this.WorkAddress = WorkAddress;
	}

	public String toString() {
		return String.format("Customer Name - [%s], Homeaddress -[%s], workAddress - [%s]", name, HomeAddress,
				WorkAddress);
	}

}
