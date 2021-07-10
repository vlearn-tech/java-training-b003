package org.vleantech.java.step90miniproject;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
	private Long id;
	private String firstName;
	private String lastName;
	private Character gender;
	private BigDecimal age;
	private LocalDate joiningDate;
	private Integer salary;
	private String phone;
	private Region region;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Employee(Long id, String firstName, String lastName, Character gender, BigDecimal age, LocalDate joiningDate,
			Integer salary, String phone, Region region) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.phone = phone;
		this.region = region;
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [id=%s, firstName=%s, lastName=%s, gender=%s, age=%s, joiningDate=%s, salary=%s, phone=%s, region=%s]",
				id, firstName, lastName, gender, age, joiningDate, salary, phone, region);
	}

}
