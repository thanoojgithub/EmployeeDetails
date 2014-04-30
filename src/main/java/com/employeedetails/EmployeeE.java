package com.employeedetails;
public enum EmployeeE {

	N("Name"), D("DeptName"), S("Salary"), ND("NameDeptName"), NS("NameSalary"), DS(
			"DeptNameSalary"), NDS("NameDeptNameSalary"), EMPTY("EmptyFields"), VALIDATION_ERRORS("Any one field should be non-empty");

	private String value;

	public String getValue() {
		return value;
	}

	private EmployeeE(String value) {
		this.value = value;
	}

}
