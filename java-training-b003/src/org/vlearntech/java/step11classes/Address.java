package org.vlearntech.java.step11classes;

public class Address {
	String houseNumber;
	String street;
	String city;
	Integer zip;

	public Address(String houseNumber, String street, String city, Integer zip) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return String.format("Address [houseNumber=%s, street=%s, city=%s, zip=%s]", houseNumber, street, city, zip);
	}

}
