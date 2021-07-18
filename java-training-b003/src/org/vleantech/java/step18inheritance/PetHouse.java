package org.vleantech.java.step18inheritance;

@SuppressWarnings("unused")
public class PetHouse {

	public static void main(String[] args) {
		// Observe the constructor hierarchy for default constructors
		Dog d = new Dog();
		Cat c = new Cat();

		// Observe the constructor hierarchy for parameterized constructors
		Dog bruno = new Dog("Brown", "Bruno", 3, "Pug");
		Dog tiger = new Dog("Gray", "Tiger", 2, "German Shepherd");

		Cat silky = new Cat("White", "Silky", 2);
		Cat tammy = new Cat("Black", "Tammy", 4);

		// Observe how methods of Pet are getting invoked. And see how the eat method is overridden.
		System.out.println("============== B R U N O    T H E     G R E A T  =============");
		bruno.run();
		bruno.eat();
		bruno.biteABone();
		bruno.bark();

		// Observe how methods of Pet are getting invoked. And see how the eat method is overridden.
		System.out.println("============== T I G E R    T H E     G U L P E R  =============");
		tiger.run();
		tiger.eat();
		tiger.biteABone();
		tiger.bark();

		// Observe how methods of Pet are getting invoked. Also see how run method is reflecting 'Cat' instead of 'Pet'
		System.out.println("============== T A M M Y   T H E   G O R G E O U S=============");
		tammy.run();
		tammy.eat();
		tammy.drinksMilk();
		tammy.mew();

	}
}
