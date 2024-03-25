package com.abc.springdemo;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private List<String> skills;
	
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	public void displayStudent() {
		
		System.out.println("Student Id: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Skills: "+skills);
		
	}
	
	
}
