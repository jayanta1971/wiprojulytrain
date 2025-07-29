package com.wipro.sprindgdemo.beans;

public class Employee {

	String employeeName;
	String employeeNumber;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + "]";
	}
	
	
	
}
