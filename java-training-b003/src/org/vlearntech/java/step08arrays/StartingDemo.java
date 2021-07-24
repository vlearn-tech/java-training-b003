package org.vlearntech.java.step08arrays;

public class StartingDemo {
	public static void main(String[] args) {

		// What if you declared variables separately - WRONG
		float semester1Gpa = 8.4f;
		float semester2Gpa = 800;
		float semester3Gpa = 8.1f;

		// How you do it with an array
		float[] semesterScores = { 8.4f, 8.3f, 8.1f }; // Specify the values upfront. Java will calculate the size by
														// itself.
		System.out.println(semesterScores[2]);

		// What if you declared variables separately
		int ageOfStudent1, ageOfStudent2, ageOfStudent3, ageOfStudent4;

		ageOfStudent1 = 24;
		ageOfStudent2 = 26;
		ageOfStudent3 = 25;
		ageOfStudent4 = 30;

		// How you do it with an array
		int[] studentAgeList = new int[4]; // Specify the total size upfront.
		studentAgeList[0] = 24;
		studentAgeList[3] = 32;
		studentAgeList[2] = 12;
		studentAgeList[0] = 28;

		String[] hobbies = { "Cricket", "Movies", "Music" };

		Person[] students = new Person[4];

		Person sudeep = new Person();
		sudeep.name = "Sudeep";
		sudeep.age = 24;

		students[0] = sudeep;

		// Multi dimensional Matrix - Try to avoid. Use objects/classes and ArrayLists to handle
		int[][] matrix = new int[2][3];

		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;

		matrix[1][0] = 10;
		matrix[1][1] = 20;
		matrix[1][2] = 30;

		// 1 2 3
		// 10 20 30

	}
}

class Person {
	String name;
	int age;
}
