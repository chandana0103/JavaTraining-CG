package com.abc.service;

import com.abc.bean.Employee;
import com.abc.dao.EmployeeDao;

public class EmployeeService {

	public void saveEmployee(Employee emp) {
		
		// any business logic goes here
		EmployeeDao empDao = new EmployeeDao();
		empDao.save(emp);
	}	
	
}
