package com.abc.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class EcomCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomCustomerServiceApplication.class, args);
	}

}
