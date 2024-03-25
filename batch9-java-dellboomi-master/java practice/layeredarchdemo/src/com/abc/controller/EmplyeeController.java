package com.abc.controller;

import java.util.Scanner;

import com.abc.bean.Employee;
import com.abc.service.EmployeeService;

public class EmplyeeController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String empName = sc.next();
		System.out.println("Enter Employee Salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter Dept no:");
		int deptNo = sc.nextInt();
		sc.close();		

		Employee emp = new Employee();
		emp.setEmpno(empId);
		emp.setName(empName);
		emp.setSalary(salary);
		emp.setDeptNo(deptNo);

		EmployeeService empService = new EmployeeService();
		empService.saveEmployee(emp);
		System.out.println("Employee saved.");


	}

}