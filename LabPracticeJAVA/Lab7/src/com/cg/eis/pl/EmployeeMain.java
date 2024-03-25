package com.cg.eis.pl;

import java.util.HashMap;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {
	
	public static void main(String args[]) {
		
		     EmployeeServiceImpl empService=new EmployeeServiceImpl();
			 Employee emp1=new Employee(1001,"chandana",30000,null,null);
			 Employee emp2=new Employee(1004,"Nikitha",45000,null,null);
			 Employee emp3=new Employee(1003,"shivani",55000,null,null);
			 Employee emp4=new Employee(1004,"niha",34000,null,null);
			 try {
				empService.addDetails(1, emp1);
				empService.addDetails(2, emp2);
				empService.addDetails(3, emp3);
				empService.addDetails(4, emp4);
			} catch (EmployeeException e) {
				
				e.printStackTrace();
			}
			  
			empService.printDetails();
			 
	}


}
