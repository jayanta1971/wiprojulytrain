package com.tcs.hibernatedemov2.entity;

public class Employee {
	
	int id;
	String empName;
	double empSalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	

}
