package org.vlearntech.java.step21abstraction;

public class Dog extends Pet implements Playful, Loveable {

	@Override
	public Dog getNew() {
		return new Dog();
	}

	// Specific
	private String breed;

	// Constructor
	public Dog(String name, String color, Integer age, String breed) {
		super(color, name, age);
		this.breed = breed;
//		System.out.println("Dog is getting created with the parameterized constructor");

	}

	public Dog() {
//		System.out.println("Dog is getting created with the default constructor");
	}

	public void bark() {
		System.out.println("Dog is barking");
	}

	@Override
	public void specialEatingProcess() {
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

	@Override
	public void run() {
		System.out.println("Dog likes to scamper around very very fast");
	}

	@Override
	public void fetchesBall() {
		System.out.println("Faviourite sport");
	}

	@Override
	public void wagsTail() {
		System.out.println("When its really in the mood to play, you can barely count how many times it wags its tail");
	}

	@Override
	public void jumpsInAir() {
		System.out.println("Show a biscuit and see how high it jumps");
	}

	@Override
	public void makesCuteSounds() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doesNotHarm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cuddles() {
		System.out.println("Cuddling hard");
	}

}
