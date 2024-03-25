package com.streamapi;

public class Employee {
	private int empno;
	private String name;
	private double salary;
	private String role;
	
	public Employee(int empno, String name, double salary, String role) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
