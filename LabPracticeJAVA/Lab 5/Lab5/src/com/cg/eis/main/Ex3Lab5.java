package com.cg.eis.main;

import com.cg.eis.exception.EmployeeException;

public class Ex3Lab5 {
		public static void main(String[] args) {
			double salary=4000;
			try
			{
				salEmp(salary);
			}
			catch(EmployeeException e1)
			{
			  System.out.println("Salary is less than 3000");
			}
			
		}

		public static void salEmp(double salary) throws EmployeeException
		{
			if(salary<3000)
			{
				throw new EmployeeException();
			}
			else
			{
				System.out.println("Salary is greater to 3000");
			}
			
			
		}
		

	}
