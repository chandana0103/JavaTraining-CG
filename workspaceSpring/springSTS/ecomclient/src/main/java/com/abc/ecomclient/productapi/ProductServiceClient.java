package com.abc.ecomclient.productapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.abc.ecomclient.model.Product;

public class ProductServiceClient {
	
	//@Autowired
	//private RestTemplate restTemplate;

	public static void main(String[] args) {
		
		ProductServiceClient productClient = new ProductServiceClient();

		productClient.getProductDetails(2);
		
		System.out.println("*******All Products***********");
		
		productClient.getAllProducts();

	}

	public void getProductDetails(int productId) {

		String resourceUrl = "http://localhost:8081/ecom/product/get/" + productId;

		RestTemplate restTemplate = new RestTemplate();

		Product product = restTemplate.getForObject(resourceUrl, Product.class);

		System.out.println("Product Details:");
		System.out.println("ProductId:" + product.getProductId());
		System.out.println("Name:" + product.getProductName());
		System.out.println("Price:" + product.getProductPrice());
		System.out.println("Category:" + product.getProductCategory());
		System.out.println("Created On:" + product.getCreateOn());

	}

	public void getAllProducts() {

		String resourceUrl = "http://localhost:8081/ecom/product/all";

		RestTemplate restTemplate = new RestTemplate();

		Product[] product = restTemplate.getForObject(resourceUrl, Product[].class);

		for (Product p : product) {
			System.out.println(p.getProductName() + " " + p.getProductPrice() + " " + p.getProductCategory());
		}

	}

}
