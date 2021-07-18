package org.vleantech.java.step18inheritance;

public class Dog extends Pet {

	// Specific
	private String breed;

	// Constructor
	public Dog(String color, String name, Integer age, String breed) {
		super(color, name, age);
		this.breed = breed;
		System.out.println("Dog is getting created with the parameterized constructor");

	}

	public Dog() {
		System.out.println("Dog is getting created with the default constructor");
	}

	public void bark() {
		System.out.println("Dog is barking");
	}

	public void biteABone() {
		System.out.println("Dog is biting a bone");
	}

	@Override
	public void eat() {
		if (breed.equalsIgnoreCase("German Shepherd")) {
			System.out.println("Dog is eating very fast");
		} else {
			System.out.println("Dog is eating and enjoying its food");
		}
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", " + super.toString() + "]";
	}

}
