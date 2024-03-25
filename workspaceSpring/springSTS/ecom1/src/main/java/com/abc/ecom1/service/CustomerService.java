package com.abc.ecom1.service;

import java.util.List;


//import com.abc.ecom1.entity.Customer; only model not entity
import com.abc.ecom1.model.CustomerModel;

public interface CustomerService {
	
	public CustomerModel saveCustomer(CustomerModel customer);

	// public List<Customer> getAllCustomers();

	// public Customer getCustomerById(int customerId);

	 public void deleteCustomer(int customerId);

	// public Customer updateCustomer(Customer customer);
	 
	 public CustomerModel updateCustomer(CustomerModel customer);
}