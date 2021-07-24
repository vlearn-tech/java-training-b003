package org.vlearntech.java.step13sortingandcomparing;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	private String name;
	private Long id;
	private LocalDate joiningDate;
	private Integer salary;
	private Character band;

	@Override
	public String toString() {
		return String.format("Employee [name=%s, id=%s, joiningDate=%s, salary=%s, band=%s]", name, id, joiningDate,
				salary, band);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Character getBand() {
		return band;
	}

	public void setBand(Character band) {
		this.band = band;
	}

	public Employee(String name, Long id, LocalDate joiningDate, Integer salary, Character band) {
		this.name = name;
		this.id = id;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.band = band;
	}

	@Override
	public int compareTo(Employee other) {
		return this.getId().compareTo(other.getId());
	}

}
