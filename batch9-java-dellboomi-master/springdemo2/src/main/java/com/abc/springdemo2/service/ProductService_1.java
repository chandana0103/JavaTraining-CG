package com.abc.springdemo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.abc.springdemo2.bean.Product;

public class ProductService {

	@Qualifier("product2")
	@Autowired
	private Product product;

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void dispaly() {
		System.out.println("Product Id: "+product.getProductId());
		System.out.println("Product Name: "+product.getProductName());
		System.out.println("Product Price: "+product.getProductPrice());
	}
	
}
