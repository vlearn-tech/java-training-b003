package org.vlearntech.java.step91miniprojectwithobjectfile;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
	public static Employee parseRecordIntoEmployee(String record) {
		String[] attributes = record.split(",");

		return new Employee(Long.valueOf(attributes[0]), // id
				attributes[1], // firstName
				attributes[2], // lastName
				attributes[3].charAt(0), // gender
				new BigDecimal(attributes[4]).setScale(1, RoundingMode.HALF_EVEN), // age
				DateUtils.parseIntoDate(attributes[5]), // joiningDate
				Integer.valueOf(attributes[6]), // salary
				attributes[7], // phoneNumber
				attributes[8].toUpperCase() // region
		);
	}

	public static List<Employee> getAllEmployeeFromFile(String folderName, String fileName) throws IOException {
		List<String> employeeRecords = getAllRecordsFromFile(folderName, fileName);
		List<Employee> employeeList = new ArrayList<>();
		for (String record : employeeRecords) {
			// Parse the record into Employee objects and add them into the employeeList
			Employee e = EmployeeUtils.parseRecordIntoEmployee(record);
			employeeList.add(e);
		}
		return employeeList;
	}

	private static List<String> getAllRecordsFromFile(String folderName, String fileName) throws IOException {
		return Files.readAllLines(Paths.get(folderName, fileName));
	}

	public static void createReportFile(List<RegionalReport> regionalReports) throws IOException {
		Path file = Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "RegionalReportObjectFile.txt");
		Files.deleteIfExists(file);
		Files.createFile(file);
		ObjectOutputStream outStream = new ObjectOutputStream(Files.newOutputStream(file));
		regionalReports.forEach(rep -> {
			try {
				outStream.writeObject(rep);
			} catch (IOException e) {
//				System.out.println("Error while trying to save record for " + rep.getRegion());
				e.printStackTrace();
			}
		});
	}
}
