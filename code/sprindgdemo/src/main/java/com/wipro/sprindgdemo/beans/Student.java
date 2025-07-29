package com.wipro.sprindgdemo.beans;

public class Student {
	
	String studentName;
	String studentRollNumber;
	public Student(String studentName, String studentRollNumber) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
//	@Override
//	public String toString() {
//		return "Student [studentName=" + studentName + ", studentRollNumber=" + studentRollNumber + "]";
//	}
//	

}
