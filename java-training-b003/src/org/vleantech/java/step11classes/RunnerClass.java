package org.vleantech.java.step11classes;

import java.time.LocalDate;

public class RunnerClass {
	public static void main(String[] args) {
//		String str = "abcd";
//		Integer[] numbers = new Integer[5];
//		LocalDate today = LocalDate.now();

//		Address infocityAddress = new Address();
//		infocityAddress.houseNumber = "Plot A";
//		infocityAddress.street = "Infocity Park";
//		infocityAddress.city = "Bhubaneswar";
//		infocityAddress.zip = 751001;

		Address infocityAddress = new Address("Plot A", "Infocity Park", "Bhubaneswar", 751001);

//		Employee kushal = new Employee();
//		kushal.id = 10001L;
//		kushal.name = "Kushal";
//		kushal.isMarried = Boolean.FALSE;
//		kushal.band = 'A';
//		kushal.salary = 700_000;
//		kushal.joiningDate = LocalDate.of(2015, 6, 15);
//		kushal.officeAddress = infocityAddress;

//		Employee vikas = new Employee();
//		vikas.id = 10002L;
//		vikas.name = "Vikas";
//		vikas.isMarried = Boolean.FALSE;
//		vikas.band = 'B';
//		vikas.salary = 650_000;
//		vikas.joiningDate = LocalDate.of(2015, 12, 15);
//		vikas.officeAddress = infocityAddress;

//		Employee preeti = new Employee();
//		preeti.id = 10003L;
//		preeti.name = "Preeti";
//		preeti.isMarried = Boolean.FALSE;
//		preeti.band = 'A';
//		preeti.salary = 750_000;
//		preeti.joiningDate = LocalDate.of(2014, 10, 15);
//		preeti.officeAddress = infocityAddress;

		Employee kushal = new Employee("Kushal", 10001L, LocalDate.of(2015, 6, 15), Boolean.FALSE, 700_000, 'A',
				infocityAddress);
		Employee vikas = new Employee("Vikas", 10002L, LocalDate.of(2015, 12, 15), Boolean.FALSE, 650_000, 'B',
				infocityAddress);
		Employee preeti = new Employee("Preeti", 10003L, LocalDate.of(2014, 10, 15), Boolean.TRUE, 750000, 'A',
				infocityAddress);

//		System.out.println(String.format("Employee [id=%d, name=%s, isMarried=%b, band=%c, salary=%d, joiningDate=%s]",
//				preeti.id, preeti.name, preeti.isMarried, preeti.band, preeti.salary, preeti.joiningDate));
//
//		System.out.println(String.format("Employee [id=%d, name=%s, isMarried=%b, band=%c, salary=%d, joiningDate=%s]",
//				vikas.id, vikas.name, vikas.isMarried, vikas.band, vikas.salary, vikas.joiningDate));
//
//		System.out.println(String.format("Employee [id=%d, name=%s, isMarried=%b, band=%c, salary=%d, joiningDate=%s]",
//				kushal.id, kushal.name, kushal.isMarried, kushal.band, kushal.salary, kushal.joiningDate));

		preeti.printDetails();
		vikas.printDetails();
		kushal.printDetails();

		Employee simran = new Employee("Simran", 10004L);
		simran.setSalary(800_000);
//		simran.experience = 10; // this will not work because experience is a private attribute
		simran.printDetails();
//		System.out.println(kushal.getJoiningDate());

//		new Employee("Sonal", 10005L).printDetails();

	}
}
