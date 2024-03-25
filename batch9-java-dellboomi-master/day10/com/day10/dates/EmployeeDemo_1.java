package com.day10.dates;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empno:");
		int eno = sc.nextInt();
		System.out.println("Enter emp name:");
		String ename = sc.next();
		System.out.println("Enter dob:(yyyy-MM-dd)");
		String edob = sc.next();
		
		//convert string to LocalDate
		LocalDate dob = ?;
		
		Employee emp1 = new Employee();
		emp1.setEmpno(eno);
		emp1.setName(ename);
		emp1.setDob(dob);		

		System.out.println("EmpNo: "+emp1.getEmpno());
		System.out.println("Name: "+emp1.getName());
		System.out.println("DOB: "+emp1.getDob());

	}

}
