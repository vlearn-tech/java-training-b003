package org.vleantech.java.step11classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Employee {
	private String name;
	private Long id;
	private LocalDate joiningDate;
	private Boolean isMarried;
	private Integer salary;
	private Character band;
	private Address officeAddress;

	private Integer experience;

	void printDetails() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [name=%s, id=%s, experience=%s, isMarried=%s, salary=%s, band=%s, officeAddress=%s]", name,
				id, experience, isMarried, salary, band, officeAddress);
	}

	// Default Constructor
	public Employee() {
		System.out.println("Creating a new employee instance at + " + LocalTime.now());
	}

	// Parameterized Constructor
	public Employee(String name, Long id, LocalDate joiningDate, Boolean isMarried, Integer salary, Character band,
			Address officeAddress) {
		this.name = name;
		this.id = id;
		this.joiningDate = joiningDate;
		this.experience = calculateExperience();
		this.isMarried = isMarried;
		this.salary = salary;
		this.band = band;
		this.officeAddress = officeAddress;
	}

	public Employee(String name, Long id) {
		this.name = name;
		this.id = id;
	}

	private Integer calculateExperience() {
//		int totalLeave = findTotalLeavesForEmployee);
		return joiningDate == null ? null : (int) ChronoUnit.YEARS.between(joiningDate, LocalDate.now());
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

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
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

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

}
