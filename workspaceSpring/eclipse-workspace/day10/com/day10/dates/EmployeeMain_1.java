package com.day10.dates;

import java.time.LocalDate;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmpno(111);
		emp1.setName("sameer");		
//		LocalDate dob = LocalDate.of(2000, 10, 10);
//		emp1.setDob(dob);		
		emp1.setDob(LocalDate.of(2000, 10, 10));
		
		System.out.println("EmpNo: "+emp1.getEmpno());
		System.out.println("Name: "+emp1.getName());
		System.out.println("DOB: "+emp1.getDob());

	}

}
