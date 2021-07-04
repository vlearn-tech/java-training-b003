package org.vleantech.java.step13sortingandcomparing;

import java.util.Comparator;

public class EmployeeComparatorBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
}
