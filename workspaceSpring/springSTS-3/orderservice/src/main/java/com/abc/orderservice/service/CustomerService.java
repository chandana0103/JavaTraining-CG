package com.abc.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.orderservice.model.CustomerModel;
import com.abc.orderservice.model.ProductModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class CustomerService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getCustomerDetailsFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"), })

	
	public CustomerModel getCustomerDetals(int customerId) {
		CustomerModel customer = null;
        String resourceUrl = "http://customerservice/ecom/customer/get/" + customerId;
        ResponseEntity<CustomerModel>customerResponseEntity = restTemplate.getForEntity(resourceUrl, CustomerModel.class);
        if (customerResponseEntity.getStatusCode() == HttpStatus.OK) {
        	customer = customerResponseEntity.getBody();
            return customer;
        }
 
        return customer;
	}
	private CustomerModel getCustomerDetailsFallback(int customerId) {
		CustomerModel customer = new CustomerModel();
		customer.setCustomerId(0);
		customer.setCustomerName(" ");
		customer.setEmail(" ");
		customer.setMobile("");
		customer.setMobile("");
        return customer;

	}
}
