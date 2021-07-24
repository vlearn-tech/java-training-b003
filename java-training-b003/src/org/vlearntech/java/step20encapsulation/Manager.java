package org.vlearntech.java.step20encapsulation;

import java.util.List;

public class Manager extends Employee {

	List<Employee> team;

	// is a manager supposed to know employee id?

	// is a manager supposed to know the personalEmail of other employee? - Yes

	void doSomething() {
		System.out.println("Phone Number is : " + this.phoneNumber);
	}

}
