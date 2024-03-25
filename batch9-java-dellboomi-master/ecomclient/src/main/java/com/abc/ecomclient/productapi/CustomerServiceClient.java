package com.abc.ecomclient.productapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.abc.ecomclient.model.Customer;
import com.abc.ecomclient.model.Product;

public class CustomerServiceClient {

	public static void main(String[] args) {
		
		getCustomerDetails(2);

	}
	
public static void getCustomerDetails(int customerId) {
		
		String resourceUrl = "http://localhost:8081/ecom/customer/get/"+customerId;	
		
		RestTemplate restTemplate = new RestTemplate();	
		
		ResponseEntity<Customer> respEntity = restTemplate.getForEntity(resourceUrl, Customer.class);
		
		System.out.println("Status code: "+respEntity.getStatusCode());
		
		Customer customer = respEntity.getBody();
		
		System.out.println("Customer Details:");		
		System.out.println("CustomerId:"+customer.getCustomerId());
		System.out.println("Name:"+customer.getCustomerName());
		
	}

}
