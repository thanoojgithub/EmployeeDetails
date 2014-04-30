package com.employeedetails;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {

	private static List<Employee> getEmployeeList() {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("ram", "Admin", "40000"));
		employeeList.add(new Employee("lakshman", "Mgr", "30000"));
		employeeList.add(new Employee("Bharath", "Admin", "25000"));
		employeeList.add(new Employee("seeta", "HR", "35000"));
		employeeList.add(new Employee("Shatrughna", "QA", "15000"));
		employeeList.add(new Employee("Hanuma", "Asst.Mgr", "20000"));
		return employeeList;
	}

	public static List<Employee> getEmployees(String name, String deptName,
			String salary) {

		boolean nameFlag = name != null || name == "" ? true : false;
		boolean deptNameFlag = deptName != null || deptName == "" ? true : false;
		boolean salaryFlag = salary != null || deptName == "" ? true : false;
		EmployeeE key = EmployeeE.EMPTY;
		if (nameFlag) {
			if (!deptNameFlag && !salaryFlag)
				key = EmployeeE.N;
			if (deptNameFlag && !salaryFlag)
				key = EmployeeE.ND;
			if (!deptNameFlag && salaryFlag)
				key = EmployeeE.NS;
			if (deptNameFlag && salaryFlag)
				key = EmployeeE.NDS;
		}
		if (deptNameFlag) {
			if (!nameFlag && !salaryFlag)
				key = EmployeeE.D;
			if (!nameFlag && salaryFlag)
				key = EmployeeE.DS;
		}
		if (salaryFlag) {
			key = EmployeeE.S;
		}
		List<Employee> employeeList = getEmployeeList();
		ArrayList<Employee> list = new ArrayList<Employee>();

		switch (key) {
		case N:
			for (Employee employee : employeeList)
				if (employee.getName().equalsIgnoreCase(name)) {
					list.add(employee);
				}
			break;
		case D:
			for (Employee employee : employeeList)
				if (employee.getDeptName().equalsIgnoreCase(deptName)) {
					list.add(employee);
				}
			break;
		case S:
			for (Employee employee : employeeList)
				if (employee.getSalary().equals(salary)) {
					list.add(employee);
				}
			break;
		case ND:
			for (Employee employee : employeeList)
				if (employee.getName().equalsIgnoreCase(name)
						&& employee.getDeptName().equalsIgnoreCase(deptName)) {
					list.add(employee);
				}
			break;
		case NS:
			for (Employee employee : employeeList)
				if (employee.getName().equalsIgnoreCase(name)
						&& employee.getSalary().equals(salary)) {
					list.add(employee);
				}
			break;
		case DS:
			for (Employee employee : employeeList)
				if (employee.getDeptName().equalsIgnoreCase(deptName)
						&& employee.getSalary().equals(salary)) {
					list.add(employee);
				}
			break;
		case NDS:
			for (Employee employee : employeeList)
				if (employee.getName().equalsIgnoreCase(name)
						&& employee.getDeptName().equalsIgnoreCase(deptName)
						&& employee.getSalary().equals(salary)) {
					list.add(employee);
				}
			break;

		default:
			list.clear();
			break;
		}

		return list;
	}

}
