package com.employeedetails;

import java.util.ArrayList;
import java.util.List;

import com.employeedetails.exceptions.EmployeeDetailsValidation;

public class EmployeeDetails {

	@SuppressWarnings("unchecked")
	public <T extends Exception> EmployeeResponse searchEmployee(String name, String deptName, String salary) {
		List<Employee> empList = new ArrayList<>();
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if ((name == null || name == "") && (deptName == null || deptName == "") && (salary == null || salary == "")) {
			employeeResponse.setStatus(EmployeeE.VALIDATION_ERRORS.getValue());
			List<T> validationList = new ArrayList<T>();
			validationList.add((T)new EmployeeDetailsValidation(EmployeeE.VALIDATION_ERRORS.getValue()));
			employeeResponse.setValidationErrors(validationList);
		} else {
			empList = EmployeeDB.getEmployees(name, deptName, salary);
			employeeResponse.setEmployee(empList);
			employeeResponse.setStatus("OK");
		}
		return employeeResponse;
	}

}
