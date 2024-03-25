package com.day10.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeListDemo {

	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(105,"raj",45000,"devloper"));
		emps.add(new Employee(107,"krish",45000,"devloper"));
		emps.add(new Employee(104,"sam",85000,"manager"));
		emps.add(new Employee(102,"varun",65000,"lead"));
		emps.add(new Employee(109,"sachin",65000,"lead"));
		emps.add(new Employee(110,"virat",45000,"devloper"));
		emps.add(new Employee(103,"ram",45000,"devloper"));
		
		System.out.println("******All Employees******");
		emps.stream().forEach(e->System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getRole()));
		
		System.out.println("*********display all developers*********");		
		emps.stream().filter(e->e.getRole().equals("devloper")).forEach(e->System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getRole()));
		
		System.out.println("*********get all leads and store in a separate list*********");	
		List<Employee> leadList = emps.stream().filter(e->e.getRole().equals("devloper")).collect(Collectors.toList());
		
		List<String> empNamesList = emps.stream().map(x->x.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(empNamesList);	
		
	}

}
