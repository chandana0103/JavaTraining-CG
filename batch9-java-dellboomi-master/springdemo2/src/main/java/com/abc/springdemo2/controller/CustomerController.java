package com.abc.springdemo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.abc.springdemo2.bean.Customer;
import com.abc.springdemo2.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public void save(Customer customer) {
		
		customerService.saveCustomer(customer);
	}
	
	public void findCustomer(int customerId) {
		
		Customer customer = customerService.findCustomerById(customerId);
		
		if(customer != null) {
			System.out.println("Customer Id: "+customer.getCustomerId());
			System.out.println("Name: "+customer.getName());
			System.out.println("Email: "+customer.getEmail());
			System.out.println("Mobile: "+customer.getMobile());
		}
		else {
			System.out.println("Customer not existing with id: "+customerId);
		}
	}
	
	public void displayAllCustomers() {
		
		List<Customer> customers = customerService.fetchAllCustomers();
		customers.forEach(c->System.out.println(c.getCustomerId()+" "+c.getName()+" "+c.getEmail()+" "+c.getMobile()));
		
	}

}
