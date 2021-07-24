package org.vleantech.java.step20encapsulation.other;

import org.vleantech.java.step20encapsulation.Employee;
import org.vleantech.java.step20encapsulation.Manager;

public class DeliveryManager extends Manager {
	String title;
	String organization;

	// should DM have access to names of employees? -- Yes

	// should SM have access to change names of employees - No

	// should DM have access to phoneNumber of other employee - Yes (but read only)

	void doSomething(Employee e) {
		System.out.println("My Phone Numbers : " + this.phoneNumber);
		System.out.println("Employee Phone : " + e.getPhoneNumber());
	}

}
