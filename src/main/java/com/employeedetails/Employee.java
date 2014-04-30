package com.employeedetails;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Employee {

	private String name;
	private String deptName;
	private String salary;

	public Employee(String name, String deptName, String salary) {
		super();
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name : " + name + " | DeptName : "+deptName + " | Salary : "+salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		return builder.append(this.name).append(this.deptName)
				.append(this.salary).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		EqualsBuilder builder = new EqualsBuilder();
		if (this == obj)
			return true;
		Employee other = (Employee) obj;
		return builder.append(other.name, name)
				.append(other.deptName, deptName).append(other.salary, salary)
				.isEquals();
	}

}
