package org.vleantech.java.step14maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.vleantech.java.step13sortingandcomparing.Employee;

public class MapDemo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.addAll(Arrays.asList(new Employee("Albert", 100051L, LocalDate.now().minusDays(1000), 25_000, 'C'),
				new Employee("Brian", 100041L, LocalDate.now().minusDays(2000), 65_000, 'B'),
				new Employee("Chelsie", 100021L, LocalDate.now().minusDays(1500), 45_000, 'B'),
				new Employee("Denise", 100007L, LocalDate.now().minusDays(4000), 150_000, 'A'),
				new Employee("Ernest", 100014L, LocalDate.now().minusDays(1400), 40_000, 'C'),
				new Employee("Frank", 100017L, LocalDate.now().minusDays(2400), 80_000, 'B'),
				new Employee("Frank", 100022L, LocalDate.now().minusDays(1500), 40_000, 'C')));

		Employee jamesBond = null;
		for (Employee e : employees) {
			if (e.getId().equals(100007L)) {
				jamesBond = e;
				break;
			}
		}

		System.out.println(jamesBond);

		Map<Long, Employee> employeeMap = new HashMap<>();

		// How to create the map from the list
		for (Employee e : employees) {
			employeeMap.put(e.getId(), e);
		}

		// Using forEach
//		employees.forEach(e -> employeeMap.put(e.getId(), e));

//		Map<Long, Employee> employeeMap2 = employees.stream().collect(Collectors.groupingBy(Employee::getId));

		System.out.println(employeeMap.get(100007L));

		// Iteration of Map

		// Only iterate the keys
//		employeeMap.keySet().forEach(eId -> System.out.println(eId));

		for (Long id : employeeMap.keySet()) {
			System.out.println(id);
		}

		// Only iterate the values
		for (Employee e : employeeMap.values()) {
			System.out.println(e);
		}

		// Iterate on entry
		for (Entry<Long, Employee> row : employeeMap.entrySet()) {
			System.out.println(row.getKey() + " :: " + row.getValue());
		}

		System.out.println(employeeMap);

		// Create a complex map by Band and store the list of employees against each band
		Map<Character, List<Employee>> employeesByBand = new HashMap<>();

		// Using lambda and functional programming
//		employeesByBand = employees.stream().collect(Collectors.groupingBy(Employee::getBand));
//		System.out.println(employeesByBand);

		for (Employee e : employees) {
			List<Employee> list = new ArrayList<>(); // Create list for every entry
			if (employeesByBand.containsKey(e.getBand())) { // Entry exists, get that information into the list
				list = employeesByBand.get(e.getBand());
			}
			list.add(e); // add the employee record
			employeesByBand.put(e.getBand(), list); // put the updated list against the band
		}

		System.out.println(employeesByBand);

	}
}
