package com.te.basics.objectandstring;

import java.util.Objects;

public class Employee {
	private String empId;
	private int empAge;
	private String empName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, int empAge, String empName) {
		super();
		this.empId = empId;
		this.empAge = empAge;
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empAge, empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empAge == other.empAge && Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName);
	}
	
	
	
}
