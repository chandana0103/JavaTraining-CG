package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public interface EmployeeService {
    
    public String addDetails(int key,Employee emps) throws EmployeeException;
    
	public void deleteEmpDetails(int key) throws EmployeeException;
	
	public void sortByInsuranceScheme(String insuranceScheme);
	

}


