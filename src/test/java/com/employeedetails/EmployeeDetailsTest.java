package com.employeedetails;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeDetailsTest {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeDetailsTest.class);

	EmployeeDetails emp;

	@Before
	public void setUp() {
		emp = new EmployeeDetails();
	}

	@Test
	public void searchEmployee_vaildRequest_validResponse() {
		LOGGER.debug("vaildRequest");
		EmployeeResponse searchEmployee = emp.searchEmployee("ram", "admin",
				"40000");
		Assert.assertEquals("OK", searchEmployee.getStatus());
		Assert.assertTrue(searchEmployee.getEmployee().size() > 0);
		for (Employee emp : searchEmployee.getEmployee()) {
			System.out.println(emp);
		}
	}

	@Test
	public void searchEmployee_nullRequest_validResponse() {
		LOGGER.debug("nullRequest");
		EmployeeResponse searchEmployee = emp.searchEmployee(null, null, null);
		Assert.assertEquals(EmployeeE.VALIDATION_ERRORS.getValue(), searchEmployee.getStatus());
		Assert.assertNotNull(searchEmployee.getValidationErrors());
	}
	
	@Test
	public void searchEmployee_emptyRequest_validResponse() {
		LOGGER.debug("emptyRequest");
		EmployeeResponse searchEmployee = emp.searchEmployee("", "", "");
		Assert.assertEquals(EmployeeE.VALIDATION_ERRORS.getValue(), searchEmployee.getStatus());
		Assert.assertNotNull(searchEmployee.getValidationErrors());
	}

	@Test
	public void searchEmployee_deptName_validResponse() {
		LOGGER.debug("deptName");
		EmployeeResponse searchEmployee = emp.searchEmployee(null, "Admin", null);
		Assert.assertEquals("OK", searchEmployee.getStatus());
		Assert.assertTrue(searchEmployee.getEmployee().size() > 0);
		for (Employee emp : searchEmployee.getEmployee()) {
			System.out.println(emp);
		}
	}

	@Test
	public void searchEmployee_name_validResponse() {
		LOGGER.debug("name");
		EmployeeResponse searchEmployee = emp.searchEmployee("Hanuma", null, null);
		Assert.assertEquals("OK", searchEmployee.getStatus());
		Assert.assertTrue(searchEmployee.getEmployee().size() > 0);
		for (Employee emp : searchEmployee.getEmployee()) {
			System.out.println(emp);
		}
	}

	@Test
	public void searchEmployee_salary_validResponse() {
		LOGGER.debug("salary");
		EmployeeResponse searchEmployee = emp.searchEmployee(null, null, "25000");
		Assert.assertEquals("OK", searchEmployee.getStatus());
		Assert.assertTrue(searchEmployee.getEmployee().size() > 0);
		for (Employee emp : searchEmployee.getEmployee()) {
			System.out.println(emp);
		}
	}

	@Test
	public void searchEmployee_nameDeptName_validResponse() {
		LOGGER.debug("nameDeptName");
		EmployeeResponse searchEmployee = emp.searchEmployee("Bharath",
				"Admin", null);
		Assert.assertEquals("OK", searchEmployee.getStatus());
		Assert.assertTrue(searchEmployee.getEmployee().size() > 0);
		for (Employee emp : searchEmployee.getEmployee()) {
			System.out.println(emp);
		}
	}

	@Test
	public void searchEmployee_nameSalary_validResponse() {
		LOGGER.debug("nameSalary");
		EmployeeResponse searchEmployee = emp.searchEmployee("Shatrughna", null,
				"15000");
		Assert.assertEquals("OK", searchEmployee.getStatus());
		Assert.assertTrue(searchEmployee.getEmployee().size() > 0);
		for (Employee emp : searchEmployee.getEmployee()) {
			System.out.println(emp);
		}
	}

	@Test
	public void searchEmployee_deptNameSalary_validResponse() {
		LOGGER.debug("deptNameSalary");
		EmployeeResponse searchEmployee = emp.searchEmployee(null, "HR", "35000");
		Assert.assertEquals("OK", searchEmployee.getStatus());
		Assert.assertTrue(searchEmployee.getEmployee().size() > 0);
		for (Employee emp : searchEmployee.getEmployee()) {
			System.out.println(emp);
		}
	}

}
