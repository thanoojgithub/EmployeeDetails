package com.employeedetails;

import java.util.List;

public class EmployeeResponse {

	private String status;
	private List<? extends Exception> validationErrors;
	private List<Employee> employee;

	public EmployeeResponse() {
	}

	public EmployeeResponse(String status, List<? extends Exception> validationErrors,
			List<Employee> employee) {
		this.status = status;
		this.validationErrors = validationErrors;
		this.employee = employee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<? extends Exception> getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(List<? extends Exception> validationErrors) {
		this.validationErrors = validationErrors;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
