package com.abc.ecom1.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ecom1.entity.Customer;
//import com.abc.ecom1.entity.Customer;
import com.abc.ecom1.exception.CustomerNotFoundException;
import com.abc.ecom1.model.CustomerModel;
import com.abc.ecom1.repository.CustomerRepository;

//where Customer is there replace with CustomerModel 
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;// repositories taking entity only

	@Override
	public CustomerModel saveCustomer(CustomerModel customerModel) {
		
		//convert model to entity// repositories need only entity so convert model to entity
		
		Customer customerEntity=new Customer();//here is entity
        //setting all values
		customerEntity.setMobile(null);
		customerEntity.setCustomerId(0);
		customerEntity.setCustomerName(null);
		customerEntity.setAddress(null);
		Customer savedCustomerEntity = customerRepository.save(customerEntity);
		
		//convert entity to model//service mwthod returns model only so convert entity to model
		CustomerModel newCustomer =new CustomerModel();
		//set all values
		customerModel.setCustomerId(savedCustomerEntity.getCustomerId());
		customerModel.setCustomerName(savedCustomerEntity.getCustomerName());
	
		return newCustomer;//model we r returing
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	@Override
	public Customer getCustomerById(int customerId) throws CustomerNotFoundException {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if (optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + customerId);
		}
		return optionalCustomer.get();
	}

	@Override
	public void deleteCustomer(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if (optionalCustomer.isPresent()) {
			customerRepository.deleteById(customerId);
		} else {
			throw new CustomerNotFoundException("sorry customer is not existing with id:" + customerId);
		}
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCustomerId());
		if (optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! customer not found with id" + customer.getCustomerId());
		}
		Customer updatedCustomer = customerRepository.save(customer);
		return updatedCustomer;

	}

	@Override
	public CustomerModel updateCustomer(CustomerModel customer) {
		// TODO Auto-generated method stub
		return null;
	}

	//insted of writing in each method create 2 methods and add return to those operations
	private Customer convertModelToEntity(CustomerModel model) {
		return null;
	}
	private CustomerModel convertEntityToModel(Customer entity) {
		return null;
		//private becz we r not using in any other classes
		
	}
}