package org.vleantech.java.step19polymorphism;

public class Upcasting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

//		dog = cat; // Not allowed since dog is not a cat, and hence cat object cannot be referenced by a dog variable

		int i = 100;
		long l = i; // up-casting and implicit
		short s = (short) i; // down-casting and hence need explicit type casting

		Pet firstPet = new Dog(); // up-casting
		Pet secondPet = new Cat(); // up-casting

		Dog anotherDog = (Dog) firstPet; // down-casting and hence explicit

		firstPet = secondPet; // Allowed since both dog and cat are Animals (through inheritance)
	}
}
