package org.vleantech.java.step91miniprojectwithobjectfile;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegionalReport implements Serializable {

	private static final long serialVersionUID = -2949993503161927635L;
	
	private String region;
	private Integer numOfEmployees;
	private BigDecimal genderMixPct;
//	private Integer numOfLadies;
	private Integer avgSalary;
//	private Integer totalSalary;
	private Integer numOfEmpWithHigherSalaryRange;
	private BigDecimal ageSpan;
//	private BigDecimal highestAge;
//	private BigDecimal lowestAge;

	public RegionalReport(String region, Integer numOfEmployees, BigDecimal genderMixPct, Integer avgSalary,
			Integer numOfEmpWithHigherSalaryRange, BigDecimal ageSpan) {
		this.region = region;
		this.numOfEmployees = numOfEmployees;
		this.genderMixPct = genderMixPct;
		this.avgSalary = avgSalary;
		this.numOfEmpWithHigherSalaryRange = numOfEmpWithHigherSalaryRange;
		this.ageSpan = ageSpan;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(Integer numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	public BigDecimal getGenderMixPct() {
		return genderMixPct;
	}

	public void setGenderMixPct(BigDecimal genderMixPct) {
		this.genderMixPct = genderMixPct;
	}

	public Integer getAvgSalary() {
		return avgSalary;
	}

	public void setAvgSalary(Integer avgSalary) {
		this.avgSalary = avgSalary;
	}

	public Integer getNumOfEmpWithHigherSalaryRange() {
		return numOfEmpWithHigherSalaryRange;
	}

	public void setNumOfEmpWithHigherSalaryRange(Integer numOfEmpWithHigherSalaryRange) {
		this.numOfEmpWithHigherSalaryRange = numOfEmpWithHigherSalaryRange;
	}

	public BigDecimal getAgeSpan() {
		return ageSpan;
	}

	public void setAgeSpan(BigDecimal ageSpan) {
		this.ageSpan = ageSpan;
	}

	public RegionalReport(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return String.format(
				"RegionalReport [region=%s, numOfEmployees=%s, genderMixPct=%s, avgSalary=%s, numOfEmpWithHigherSalaryRange=%s, ageSpan=%s]",
				region, numOfEmployees, genderMixPct, avgSalary, numOfEmpWithHigherSalaryRange, ageSpan);
	}

}
