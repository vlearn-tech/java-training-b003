package org.vleantech.java.step19polymorphism;

public class Cat extends Pet {

	public Cat(String name, String color, Integer age) {
		super(color, name, age);
//		System.out.println("Cat is getting created with the parameterized constructor");
	}

	public Cat() {
//		System.out.println("Cat is getting created with the default constructor");
	}

	public void mew() {
		System.out.println("Cat is mewing");
	}

	@Override
	public void specialEatingProcess() {
		System.out.println("Cat is slurping milk");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}

	@Override
	public void run() {
		System.out.println("Cat does not want to run :(");
	}

}
