package org.vlearntech.java.step19polymorphism;

import java.time.LocalDate;

public class Pet implements Comparable<Pet> {

	public Pet getNew() {
		return new Pet();
	}

	// Generic
	private String color;
	private String name;
	private Integer age;

	public void run() {
		System.out.println("Pet is running");
	}

	public void eat() {
		System.out.println("Pet is eating a very delicious and nutritious meal");
	}

	public void gotVaccinated() {
		System.out.println("Pet got vaccinated today : " + LocalDate.now());
	}

	public Pet() {
//		System.out.println("Pet is getting created with the default constructor");
	}

	public Pet(String color, String name, Integer age) {
		this.color = color;
		this.name = name;
		this.age = age;
//		System.out.println("Pet is getting created with the parameterized constructor");

	}

	@Override
	public String toString() {
		return String.format("Pet [color=%s, name=%s, age=%s]", color, name, age);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Pet o) {
		return this.name.compareTo(o.name);
	}

	public void specialEatingProcess() {

	}
}
