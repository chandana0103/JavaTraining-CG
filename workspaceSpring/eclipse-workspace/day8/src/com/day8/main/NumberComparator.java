package com.day8.main;

import java.util.Comparator;

import com.day8.bean.Employee;

public class NumberComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.getEmpno()-o2.getEmpno();
	}

	

}
