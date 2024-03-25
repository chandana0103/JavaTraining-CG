package com.steamApi;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Employee {
		public static void main(String[] args) {
			Department dept = new Department(1, 40, "HR");
			Department dept1 = new Department(2, 20, "testing");
			List<EmployeeRepository> empList = new ArrayList<EmployeeRepository>();
			empList = Arrays.asList(
					new EmployeeRepository(1001, 1, "chandana", "potla", "cpot@gmail.com", "7984374743", "Executive",
							LocalDate.of(2021, 2, 10), 35000d, dept),
					new EmployeeRepository(1006, 2, "sony", "sharma", "ss@gmail.com", "7684985374", "Analyst",
							LocalDate.of(2020, 8, 11), 29000d, dept1),
					new EmployeeRepository(1002, 1, "divay", "shree", "ds@gmail.com", "9675987654", "Analyst",
							LocalDate.of(2019, 7, 05), 20500d, dept));
			
			for (EmployeeRepository e : empList) {
				System.out.println(e);
			}
			
			Optional<Double> o = empList.stream().map(emp -> emp.getSalary()).reduce((a, b) -> (a + b));
			if (o.isPresent()) {
				System.out.println("Sum of all Salaries: " + o.get());
			}
			System.out.println("\ncount of employees in each department.\n");
			Map<Department, Long> de = empList.stream()
					.collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
			System.out.println(de);
			LocalDate d = LocalDate.now();
			System.out.println("\nduration of their service in months and days.");
			empList.forEach(e -> System.out.println(e.getFirstName() + " " + Period.between(d, e.getHireDate())));
			//System.out.println("\n\n Sort employees by their\r\nEmployee id\r\nDepartment id\r\nFirst name.");
			System.out.println("\nsorting by employee id: ");
			List<EmployeeRepository> e1 = empList.stream().sorted((a, b) -> a.getId() - (b.getId()))
					.collect(Collectors.toList());
			System.out.println(e1);
			for (Object a : e1) {
				System.out.println(a);
			}
			System.out.println("\nsorting by First Name: ");
			e1 = empList.stream().sorted(Comparator.comparing(EmployeeRepository::getFirstName))
					.collect(Collectors.toList());
			System.out.println(e1);
			for (Object a : e1) {
				System.out.println(a);
			}
			System.out.println("\n\n departments with highest count of employees.");
			de = empList.stream().limit(1)
					.collect(Collectors.groupingBy(EmployeeRepository::getDepartment, Collectors.counting()));
			System.out.println(de);
			for (Object a : e1) {
				System.out.println(a);
			}
		}
	}


