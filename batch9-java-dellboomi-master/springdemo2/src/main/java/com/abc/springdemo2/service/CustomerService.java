package com.abc.springdemo2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.springdemo2.bean.Customer;
import com.abc.springdemo2.dao.CustomerDao;


@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void  saveCustomer(Customer customer) {
		
		//logic goes here
		customerDao.save(customer);
	}
	
	public Customer findCustomerById(int customerId) {
		
		Optional<Customer> optionalCustomer = customerDao.getCustomerById(customerId);
		
		Customer customer = optionalCustomer.get();
		
		return customer;
	}
	
	public List<Customer> fetchAllCustomers() {
		
		List<Customer> customers = customerDao.getAllCustomers();
		return customers;
	}
	
	
}
