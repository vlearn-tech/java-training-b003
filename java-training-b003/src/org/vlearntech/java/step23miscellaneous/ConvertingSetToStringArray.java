package org.vlearntech.java.step23miscellaneous;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertingSetToStringArray {
	public static void main(String[] args) {
		Set<String> listOfValues = new HashSet<>();
		listOfValues.add("String 1");
		listOfValues.add("String 2");
		listOfValues.add("String 3");
		listOfValues.add("String 1");
		listOfValues.add("String 3");

		System.out.println(listOfValues);

		// Create a String array and convert the set into the array

		String[] valueArr = listOfValues.toArray(String[]::new);

		System.out.println(Arrays.toString(valueArr));
//		String child = valueArr[valueArr.length - 1];
//		System.out.println(child);

		String child = null;
		for (String entry : valueArr) {
			System.out.println(entry);
			child = entry;
		}
		System.out.println(child);

	}
}
