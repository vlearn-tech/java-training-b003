package org.vleantech.java.step20encapsulation.other;

import org.vleantech.java.step20encapsulation.Employee;

public class AuditingAuthority {
	String title;
	String organization;

	// should auditing authority have access to names of employees? -- Yes

	// should auditing authority have access to change names of employees - No

	// should auditing authority have access to personalEmail or phoneNumber - No

	void doSomething(Employee e) {
		System.out.println("Employee Phone : " + e.getPhoneNumber());
	}

}
