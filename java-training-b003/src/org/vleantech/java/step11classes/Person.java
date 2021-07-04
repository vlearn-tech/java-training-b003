package org.vleantech.java.step11classes;

public class Person {
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, email=%s]", name, email);
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Person() {
	}
}
