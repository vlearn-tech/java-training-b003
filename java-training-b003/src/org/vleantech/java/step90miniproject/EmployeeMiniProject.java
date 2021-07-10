package org.vleantech.java.step90miniproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMiniProject {

	public static void main(String[] args) throws IOException {

		// Read small file
		List<String> employeeRecords = Files
				.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "InputDataFile.csv"));

		List<Employee> employeeList = new ArrayList<>();

		for (String record : employeeRecords) {
			// Parse the record into Employee objects and add them into the employeeList
			Employee e = parseRecordIntoEmployee(record);
			employeeList.add(e);
		}
	}

	private static Employee parseRecordIntoEmployee(String record) {
//677509,Lois,Walker,F,36.36,11/24/2003,168251,303-572-8492,West
		String[] attributeArray = record.split(",");
		/*
		return new Employee(
						Long.valueOf(attributeArray[0]), // id
						attributeArray[1], // firstName
						attributeArray[2], // lastName
						attributeArray[3].charAt(0), // gender
 				);
		*/
		return null;
	}
}
