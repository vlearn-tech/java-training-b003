package org.vlearntech.java.step21abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PetList {
	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<>();

//		pets.add(new Pet("Munchkin", "Black", 2));

		pets.add(new Dog("Bruno", "Brown", 3, "German Shepherd"));
		pets.add(new Dog("Tiny", "Black", 4, "Labrador"));
		pets.add(new Dog("Spooky Spider", "Striped", 2, "Golden Retriever"));
		pets.add(new Cat("Tim", "Gray", 3));
		pets.add(new Cat("Silky", "White", 2));

		System.out.println("Before sorting : " + pets);
		Collections.sort(pets);
		System.out.println("After sorting : " + pets);

		feedAPet(pets);

		pets.forEach(Pet::run);

	}

	private static void feedAPet(List<Pet> pets) {
		Random random = new Random();
		Pet pet = pets.get(random.nextInt(pets.size()));
		System.out.println("Picked up " + pet.getName() + " for feeding");

		pet.eat();
		pet.specialEatingProcess();

//		if (pet instanceof Dog) {
//			((Dog) pet).biteABone(); // down-casting pet into Dog instance and then calling the biteABone method
//		} else if (pet instanceof Cat) {
//			((Cat) pet).drinksMilk(); // down-casting pet into Cat instance and then calling the drinksMilk method
//		}
	}
}
