package org.vlearntech.java.step23miscellaneous;

public class FinalClasses {
	public static void main(String[] args) {
//		CutePuppy p1 = new CutePuppy("Blacky", 2, "Pug");
		Puppy p2 = new Puppy("Spooky", 3, "Labrador");
		Dog p3 = new Dog("Spider", 24, "German Shepherd");
//		Pet p4 = new Pet("Silky", 12);

//		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
//		System.out.println(p4);
	}
}

abstract class Pet {
	String name;
	int age;

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	abstract void run();

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}

}

class Dog extends Pet {
	String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	void run() {
		System.out.println("Runs very fast");
	}

}

final class Puppy extends Dog {
	public Puppy(String name, int age, String breed) {
		super(name, age, breed);
	}

	@Override
	void run() {
		System.out.println("Tries to run very fast, but you can always catch it");
	}

	@Override
	public String toString() {
		return "Puppy [breed=" + breed + ", name=" + name + ", age=" + age + "]";
	}
}

//class CutePuppy extends Puppy {
//	public CutePuppy(String name, int age, String breed) {
//		super(name, age, breed);
//	}
//
//	@Override
//	void run() {
//		System.out.println("You know what.. why bother running.. I just want to hold it all the time..");
//	}
//
//	@Override
//	public String toString() {
//		return "CutePuppy [breed=" + breed + ", name=" + name + ", age=" + age + "]";
//	}
//
//}
