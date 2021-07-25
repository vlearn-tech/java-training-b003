package org.vlearntech.java.step23miscellaneous;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StaticDemo {
	public static void main(String[] args) {

		// load the current Sequence value;

		// get from file/DB = 2345
		Employee.idCounter = 2345;

		final LocalDate refDate = LocalDate.now();
		Employee sudeep = new Employee("Sudeep", "sudeep@s.com", refDate.minusDays(150));
		Employee sonal = new Employee("Sonalika", "sonalika@s.com", refDate.minusDays(250));
		sonal.id = 10_000;
		Employee sharmila = new Employee("Sharmila", "sharmila@s.com", refDate.minusDays(350));
		Employee swagat = new Employee("Swagat", "swagat@s.com", refDate.minusDays(450));

//		EmployeeUtil eu1 = new EmployeeUtil();
//		EmployeeUtil eu2 = new EmployeeUtil();

//		System.out.println("eu1 = " + System.identityHashCode(eu1) + " eu2 = " + System.identityHashCode(eu2));

		System.out.println(sudeep + " " + EmployeeUtil.getExperience(sudeep.joiningDate));
		System.out.println(sonal + " " + EmployeeUtil.getExperience(sonal.joiningDate));

		System.out.println(sharmila);
		System.out.println(swagat);

	}
}

class Employee {

	static int idCounter = 0;

	int id;
	String name;
	String email;
	LocalDate joiningDate;

	public Employee(String name, String email, LocalDate joiningDate) {
		this.id = ++Employee.idCounter;
		this.name = name;
		this.email = email;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", joiningDate=" + joiningDate + "]";
	}

	int getExperience() {
		return (int) ChronoUnit.DAYS.between(this.joiningDate, LocalDate.now());
	}

}

class EmployeeUtil {
	static int getExperience(LocalDate joiningDate) {
		return (int) ChronoUnit.DAYS.between(joiningDate, LocalDate.now());
	}
}
