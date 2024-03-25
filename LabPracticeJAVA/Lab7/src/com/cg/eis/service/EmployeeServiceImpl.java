package com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.eis.bean.Employee;
import com.cg.eis.comparator.InsuranceSchemeComparator;
import com.cg.eis.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService  {

	HashMap<Integer,Employee> empList=new HashMap<>();	
	
	public String addDetails(int key,Employee emp) throws EmployeeException {
		if(emp.getEmpId()==0||emp.getEmpName()==null||emp.getSalary()==0) {
			throw new EmployeeException("Data Insufficient");
		}
		else {
		 String designation=designationCheck(emp.getSalary());
		 emp.setDesignation(designation);
		 String insuranceScheme=applyInsuranceScheme(emp.getSalary());
		 emp.setInsuranceScheme(insuranceScheme);
		 empList.put(key,emp);
		}
		return "Employee Details Added";
	}
	public void deleteEmpDetails(int key) throws EmployeeException {
		Employee emp=empList.get(key);
		if(emp==null) {
			throw new EmployeeException("Not Found");
		}
		else {
		System.out.println("Deleted data of:"+emp.getEmpName());
		empList.remove(key);
		}
	}
	@Override
	public void sortByInsuranceScheme(String insuranceScheme) {
		
		Comparator<Entry<Integer, Employee>> comparator=new InsuranceSchemeComparator();
		Set<Map.Entry<Integer,Employee>> set=empList.entrySet();
		List<Entry<Integer, Employee>> list=new ArrayList<Entry<Integer, Employee>>(set);
		 
		Collections.sort(list,comparator);
		 
		LinkedHashMap<Integer, Employee> sortedByScheme=new LinkedHashMap<Integer,Employee>(list.size());
		 
		 for(Entry<Integer, Employee> entry:list) {
			 if(entry.getValue().getInsuranceScheme().equals(insuranceScheme))
			 sortedByScheme.put(entry.getKey(),entry.getValue());
		 }
		 System.out.println("sorted:-"+sortedByScheme);
	}
	 public void printDetails() {
		 System.out.println(empList.toString());
	 }
	private String applyInsuranceScheme(double salary) {
		 
		String scheme="";
		 if(salary>5000 && salary<20000){
			 scheme ="Scheme C";
		 }
		 else if(salary>=20000 && salary<=40000){
			 scheme ="Scheme B";
		 }
		 else if(salary>=40000) {
			 scheme ="Scheme A";
		 }
		 else if(salary<5000) {
			 scheme="No Scheme";
		 }
		 else {
			 scheme ="Not Found";
		 }
		 return scheme;
	}
	private String designationCheck(double salary) {
		 String designation="";
		 if(salary>5000 && salary<20000) {
			 designation ="System Associate";
		 }
		 else if(salary>=20000 && salary<=40000) {
			 designation ="Programmer";
		 }
		 else if(salary>=40000) {
			 designation ="Manager";
		 }
		 else if(salary<5000) {
			 designation ="Clerk";
		 }
		 else {
			 designation="Not Found";
		 }
		 return designation;
	}
}
