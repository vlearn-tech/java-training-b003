package org.vlearntech.java.step99practiceprograms;

public class BuildQueryString {
	public static void main(String[] args) {

		String[] depts = { "A", "B", "C" };

		// select * from employees where name like '%opal' and age >= 23 and cgpa < 9;

		System.out.println("The result expected is    :: "
				+ "select * from employees where name like '%opal' and age >= 23 and cgpa < 9 and dept in ('A', 'B', 'C');");

		StringBuilder query = new StringBuilder("select * from employees");
		query.append(" where").append("name like '%opal'");

		for (String dept : depts) {
			query.append(dept);
		}

		String message = "Hello";
		message = message.concat(" world");
		System.out.println(message);

		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" world");
		System.out.println(sb);

	}
}
