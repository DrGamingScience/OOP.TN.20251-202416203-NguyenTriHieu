package com.hust.kstn.parameter;

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
	
	
}
