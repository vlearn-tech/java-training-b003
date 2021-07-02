package org.vleantech.java.step12collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.vleantech.java.step11classes.Employee;

public class ListOfUserDefinedObjects {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Kushal", 10001L, LocalDate.of(2015, 6, 15), Boolean.FALSE, 700_000, 'A', null));
		employees.add(new Employee("Vikas", 10002L, LocalDate.of(2015, 12, 15), Boolean.FALSE, 650_000, 'B', null));
		employees.add(new Employee("Preeti", 10003L, LocalDate.of(2014, 10, 15), Boolean.TRUE, 750000, 'A', null));

		System.out.println("Details of 10001 :: " + getEmployeeById(employees, 10001L));
		System.out.println("Details of 10011 :: " + getEmployeeById(employees, 10011L));

	}

	private static Employee getEmployeeById(List<Employee> employees, Long id) {
		for (Employee e : employees) {
			if (e.getId().equals(id)) {
				return e;
			}
		}
		return null;
	}

}
