package com.abc.ecom.service;

import java.util.List;

import com.abc.ecom.model.ProductModel;

public interface ProductService {

	public ProductModel saveProduct(ProductModel productModel);
	
	public List<ProductModel> getAllProducts() ;
	
	public ProductModel getProductById(int productId);
	
	public ProductModel getProductByName(String productName);
	
	public List<ProductModel> getProductsByCategory(String category);
	
	public ProductModel updateProduct(ProductModel productModel);
	
	public void deleteProduct(int productId);
}
