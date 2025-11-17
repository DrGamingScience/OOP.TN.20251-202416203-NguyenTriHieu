package com.hust.kstn.parameters;

public class Student {
	private String fullName;
	private int studentId;
	
	public Student(int id, String fullName)
	{
		this.fullName = fullName;
		this.studentId = id;
	}
	
	
	public String getName()
	{
		return fullName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
}