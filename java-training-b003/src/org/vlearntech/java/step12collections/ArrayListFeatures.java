package org.vlearntech.java.step12collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListFeatures {
	public static void main(String[] args) {
		String[] nameArray = { "Sudeep", "Sonalika", "Sharmila", "Swagat" };
		System.out.println(Arrays.toString(nameArray));

		// Declare a list of strings and use the variable "names" to point to that list
		List<String> names = new ArrayList<>();

		// How to add an entry into the ArrayList
		names.add("Sachin");
		names.add("Surabhi");

		// How to print contents of an ArrayList
		System.out.println(names);

		// How to get a particular entry/index in an ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));

		// How to remove a particular element at an index
		names.remove(0);
		System.out.println("After removal of 1st entry : " + names);

		// Clear all entries in the ArrayList in one shot
		names.clear();

		// You have an array. Add all its elements into the ArrayList
		names.addAll(Arrays.asList(nameArray));
		System.out.println(names);

		// Check if there is presence of a specific value
		System.out.println("Is Sachin present in list ? " + names.contains("Sachin"));
		System.out.println("Is Sudeep present in list ? " + names.contains("Sudeep"));

		// Delete one element from the AL at specific location
		names.remove(0);
		System.out.println(names);

		// Delete one element from the AL by value
		names.remove("Sharmila");
		System.out.println(names);

		// Add an element at a particular location in the ArrayList
		names.add(names.size() - 1, "Sachin"); // relative position w.r.t size of the list
		System.out.println(names);
		names.add(1, "Surabhi"); // absolute position
		System.out.println(names);

		// Temp - add more elements including few duplicates
		names.add("Sachineshwar");
		names.addAll(Arrays.asList(nameArray));
		System.out.println(names);

		// Delete one element but which occurs multiple time
		names.removeAll(Arrays.asList("Sachin"));
		System.out.println(names);

		// Sort the AL
		Collections.sort(names); // sort the values before printing
		System.out.println("SORTED VALUES :: " + names);

		// Loop and print information in an AL
		// Enhanced For Loop
		System.out.println("=========== E N H A N C E D     F O R     L O O P   ==============");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("=========== L O O P    U S I N G    I N D E X ==============");
		// Normal loop using index
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println(
				"=========== L O O P    U S I N G    F O R E A C H    +    F U N C T I O N A L    P R O G R A M M I N G  ==============");
		names.forEach(System.out::println);

		System.out.println("=========== L O O P    U S I N G    F O R E A C H   +  L A M B D A   ==============");
		names.forEach(name -> System.out.println(name));

		// Loop through the list, find an element whose length is > 8, remove such elements
		System.out.println("Before removal :: " + names);
		List<String> namesToRemove = new ArrayList<>();
		for (String name : names) {
			if (name.length() > 8) {
				namesToRemove.add(name);
			}
		}

		names.removeAll(namesToRemove);
		System.out.println("After removal :: " + names);

		System.out.println("=========== I T E R A T O R   ==============");
		// Add long name so that you can remove
		names.add("Sachineshwar");
		System.out.println("Before iteration :: " + names);
		// Loop using Iterator
		Iterator<String> namesItr = names.iterator();
		while (namesItr.hasNext()) {
			if (namesItr.next().length() > 8) {
				namesItr.remove();
			}
		}
		System.out.println("After iteration :: " + names);

		System.out.println("=========== R E M O V E  I F    ==============");
		names.add("Sachineshwar");
		System.out.println("Before removeif :: " + names);
		names.removeIf(name -> name.length() > 8);
		System.out.println("After removeif :: " + names);
	}
}
