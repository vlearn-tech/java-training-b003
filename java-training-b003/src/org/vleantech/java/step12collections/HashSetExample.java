package org.vleantech.java.step12collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		String[] nameArray = { "Sudeep", "Sonalika", "Sharmila", "Swagat" };

		// Declare a list of strings and use the variable "names" to point to that list
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList(nameArray));
		names.add("Sachin"); // relative position w.r.t size of the list
		names.add("Surabhi"); // absolute position
		names.add("Sachineshwar");
		names.addAll(Arrays.asList(nameArray));

		// Create a list to contain only the unique values
		System.out.println("Before (non unique) :: " + names);
		List<String> uniqueNames = new ArrayList<>();
		for (String name : names) {
			if (!uniqueNames.contains(name)) {
				uniqueNames.add(name);
			}
		}

		System.out.println("After (unique) :: " + uniqueNames);

		System.out.println("============ R E D O    U S I N G    H A S H S E T S");

		// Declare a list of strings and use the variable "names" to point to that list
		Set<String> nameSet = new HashSet<>();
		nameSet.addAll(Arrays.asList(nameArray));
		nameSet.add("Sachin"); // relative position w.r.t size of the list
		nameSet.add("Surabhi"); // absolute position
		nameSet.add("Sachineshwar");
		nameSet.addAll(Arrays.asList(nameArray));

		System.out.println("Values in Set :: " + nameSet);

		System.out.println("==================  C O P Y     A R R A Y     L I S T    T O   S E T    ===========");
		System.out.println(names);
		System.out.println(new HashSet<>(names));

	}
}
