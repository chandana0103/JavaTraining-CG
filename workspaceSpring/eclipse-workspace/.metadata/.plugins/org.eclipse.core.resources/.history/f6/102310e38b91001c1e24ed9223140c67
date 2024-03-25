package com.abc.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employee_tbl")
public class Employee {

	@Id
	@Column(name="empid")
	private int empno;
	
	@Column(name="name", length = 50)
	private String name;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="email",length = 50, unique = true)
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
