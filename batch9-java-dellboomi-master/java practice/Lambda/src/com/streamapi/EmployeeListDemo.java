package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeListDemo {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101,"raj",45000,"devloper"));
		emp.add(new Employee(104,"chandana",45000,"devloper"));
		emp.add(new Employee(105,"samatha",85000,"manager"));
		emp.add(new Employee(102,"varun",65000,"lead"));
		emp.add(new Employee(109,"sachin",65000,"lead"));
		emp.add(new Employee(110,"virat",45000,"devloper"));
		emp.add(new Employee(103,"ram",45000,"devloper"));
		System.out.println(" employees");
		emp.stream().forEach(e ->System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getRole()));
		
		System.out.println( "all developers");
		emp.stream().filter(e->e.getRole().equals("devloper")).forEach(e->System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getRole()));

		System.out.println("*********get all leads and store in a separate list*********");	
		List<Employee> leadList = emp.stream().filter(e->e.getRole().equals("devloper")).collect(Collectors.toList());

		List<String> empNamesList = emp.stream().map(x->x.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(empNamesList);	

	}

}