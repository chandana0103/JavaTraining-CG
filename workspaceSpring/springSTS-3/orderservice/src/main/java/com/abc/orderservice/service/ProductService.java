package com.abc.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.orderservice.model.ProductModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class ProductService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getProductDetailsFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"), })

	public ProductModel getProductDetails(int productId) {
        ProductModel product = null;
        String resourceUrl = "http://productservice/ecom/product/get/" + productId;
        ResponseEntity<ProductModel> productResponseEntity = restTemplate.getForEntity(resourceUrl, ProductModel.class);
        if (productResponseEntity.getStatusCode() == HttpStatus.OK) {
            product = productResponseEntity.getBody();
            return product;
        }
 
        return product;
    }

	private ProductModel getProductDetailsFallback(int productId) {
		ProductModel product = new ProductModel();
        product.setProductId(productId);
        product.setProductName("");
        product.setProductPrice(0.0);
        product.setProductCategory("");
        product.setCreateOn(null);
        return product;
		
	}
}
