package org.vlearntech.java.step13sortingandcomparing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingAndSortingOfObjects {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.addAll(Arrays.asList(new Employee("Albert", 100051L, LocalDate.now().minusDays(1000), 25_000, 'C'),
				new Employee("Brian", 100041L, LocalDate.now().minusDays(2000), 65_000, 'B'),
				new Employee("Chelsie", 100021L, LocalDate.now().minusDays(1500), 45_000, 'B'),
				new Employee("Denise", 100007L, LocalDate.now().minusDays(4000), 150_000, 'A'),
				new Employee("Ernest", 100014L, LocalDate.now().minusDays(1400), 40_000, 'C'),
				new Employee("Frank", 100017L, LocalDate.now().minusDays(2400), 80_000, 'B'),
				new Employee("Frank", 100022L, LocalDate.now().minusDays(1500), 40_000, 'C')));

		System.out.println("Before sort                :: " + employees);

		Collections.sort(employees);

		System.out.println("After sort                 :: " + employees);

		Collections.sort(employees, new EmployeeComparatorBySalary());
		System.out.println("After sort by Salary       :: " + employees);

		Collections.sort(employees, new EmployeeComparatorByName());
		System.out.println("After sort by Name         :: " + employees);

//		Collections.sort(employees, new EmployeeComparatorByJoiningDate());
//		System.out.println("After sort by Joining Date :: " + employees);

		Comparator<Employee> compareByBand = (Employee e1, Employee e2) -> {
			return e1.getBand().compareTo(e2.getBand());
		};

		Comparator<Employee> compareBySalary = (Employee e1, Employee e2) -> e1.getSalary().compareTo(e2.getSalary());

		Collections.sort(employees, compareByBand);
		System.out.println("After sort by Band         :: " + employees);

		// Using Functional Programming concepts to invoke Comparator directly as a parameter
		Collections.sort(employees, (Employee e1, Employee e2) -> e1.getJoiningDate().compareTo(e2.getJoiningDate()));
		System.out.println("After sort by Joining Date :: " + employees);

		// Alternate to Collections.sort()
		employees.sort(compareByBand);

		// Lambdas
		employees.stream().sorted(compareByBand).sorted(compareBySalary);
		System.out.println("After custom sort by 2 col :: " + employees);

	}
}
