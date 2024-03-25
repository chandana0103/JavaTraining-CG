package com.abc.springdemo2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.abc.springdemo2.bean.Customer;


@Repository
public class CustomerDao {

	List<Customer> customers = new ArrayList<>();
	
	public void save(Customer customer) {
		
		customers.add(customer);
	}
	
	public Optional<Customer> getCustomerById(int customerId) {
		
		Optional<Customer> customer = customers.stream().filter(c->c.getCustomerId() == customerId).findAny();
			
		return customer;
		
	}	
	
	public List<Customer> getAllCustomers() {
		
		return customers;
	}
	
public static void main(String  arags[]) {
	//int x=5;
	String str = "chandu798";
	int x=555;
	
	
	System.out.println(" "+str+"  potlla "+x);
	
}
	
}
