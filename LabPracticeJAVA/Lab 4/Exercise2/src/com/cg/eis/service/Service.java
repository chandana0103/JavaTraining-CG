package com.cg.eis.service;

import java.util.Scanner;

public class Service
{
	interface EmployeeService 
	{
		void getEmpDetails();
		String findInsuranceScheme(double salary,String designation);
		void displayAllEmp();
	}
	class ABC implements EmployeeService
	{
		public void getEmpDetails()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter employee id     :");
			int id = sc.nextInt();
			System.out.println("Enter employee name    :");
			String name = sc.next();
			System.out.println("Enter employee salary  :");
			double salary = sc.nextDouble();
			System.out.println("Enter designation      :");
			String designation = sc.next();
			System.out.println("Enter insurance scheme :");
			String insuranceScheme = sc.next();
		}
	}
}
