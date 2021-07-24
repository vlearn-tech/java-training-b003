package org.vlearntech.java.step90miniproject;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeMiniProject {

	public static void main(String[] args) throws IOException {
		List<Employee> employees = EmployeeUtils.getAllEmployeeFromFile("C:\\Users\\HP\\Desktop\\JavaFiles",
				"InputDataFile.csv");
		List<RegionalReport> regionalReports = generateRegionalReport(employees);
		EmployeeUtils.createReportFile(regionalReports);
	}

	private static List<RegionalReport> generateRegionalReport(List<Employee> employees) {

		Set<Region> regions = new HashSet<>();
		employees.forEach(e -> regions.add(e.getRegion()));
//		System.out.println(regions);

		List<RegionalReport> reports = new ArrayList();

		int numOfIterations = 0;

		// Go through each region and create its own report

		for (Region region : regions) {
			Integer numOfEmployees = 0;
			Integer numOfLadies = 0;
			Integer totalSalary = 0;
			BigDecimal highestAge = BigDecimal.ZERO;
			BigDecimal lowestAge = new BigDecimal(Integer.MAX_VALUE);

			for (Employee e : employees) {
				numOfIterations++;
				if (e.getRegion().equals(region)) {
					numOfEmployees++;
					numOfLadies += e.getGender().equals('F') ? 1 : 0;
					totalSalary += e.getSalary();
					highestAge = e.getAge().compareTo(highestAge) > 0 ? e.getAge() : highestAge;
					lowestAge = e.getAge().compareTo(lowestAge) < 0 ? e.getAge() : lowestAge;
				}
			}

			BigDecimal genderMixPct = new BigDecimal(100 * numOfLadies / numOfEmployees).setScale(2,
					RoundingMode.HALF_EVEN);
			Integer avgSalary = totalSalary / numOfEmployees;
			BigDecimal ageSpan = highestAge.subtract(lowestAge);
			Integer numOfEmpWithHigherSalaryRange = 0;

			for (Employee e : employees) {
				numOfIterations++;
				if (e.getRegion().equals(region) && e.getSalary() >= avgSalary) {
					numOfEmpWithHigherSalaryRange++;
				}
			}

			reports.add(new RegionalReport(region, numOfEmployees, genderMixPct, avgSalary,
					numOfEmpWithHigherSalaryRange, ageSpan));
		}

//		System.out.println("Number of iterations : " + numOfIterations);
		return reports;
	}

}
