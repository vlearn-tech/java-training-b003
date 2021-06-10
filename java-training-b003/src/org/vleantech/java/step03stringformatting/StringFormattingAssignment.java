package org.vleantech.java.step03stringformatting;

public class StringFormattingAssignment {
	public static void main(String[] args) {
		String namePredicate = "opal";
		int agePredicate = 23;
		int cgpaPredicate = 9;

		// select * from employees where name like '%opal' and age >= 23 and cgpa < 9;

		System.out.println("The result expected is    :: "
				+ "select * from employees where name like '%opal' and age >= 23 and cgpa < 9;");

		String query = "select * from employees where name like '%" + namePredicate + "' and age >= " + agePredicate
				+ " and cgpa < " + cgpaPredicate + ";"; // fill this up
		System.out.println("Query using + operator    :: " + query);

		String newQuery = String.format("select * from employees where name like '%%%s' and age >= %d and cgpa < %d;",
				namePredicate, agePredicate, cgpaPredicate); // fill this up
		System.out.println("Query using String.format :: " + newQuery);

		// Two ways to format Strings
		// 1 - use concatenation - rudimentary process
		// 2 - use String.format with format specifiers - %s - String; %d - number; %f - decimal; %b - boolean

	}
}
