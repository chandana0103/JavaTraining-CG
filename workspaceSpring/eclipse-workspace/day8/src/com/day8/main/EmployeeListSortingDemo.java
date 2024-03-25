package com.day8.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.day8.bean.Employee;

public class EmployeeListSortingDemo {

	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(105,"five",45000));
		emps.add(new Employee(102,"two",45000));
		emps.add(new Employee(104,"four",45000));
		emps.add(new Employee(101,"one",45000));
		emps.add(new Employee(103,"three",45000));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option to Sort: (1.ByEmpno || 2. ByName)");
		String option = sc.next();
		sc.close();
		
		Comparator<Employee> comparator = null;
		
		if(option.equalsIgnoreCase("ByName")) {			
			comparator = new NameComparator();
		}
		else if(option.equalsIgnoreCase("ByEmpno")){
			comparator = new NumberComparator();
		}	
		
		Collections.sort(emps, comparator);
		
		Iterator<Employee> i = emps.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary());
		}
		
		
	}

}
