package com.abc.ecom.util;

import java.util.ArrayList;
import java.util.List;

import com.abc.ecom.entity.ProductEntity;
import com.abc.ecom.model.ProductModel;

public class EntityModelUtil {

	public static ProductEntity productModelToEntity(ProductModel product) {

		ProductEntity productEntity = new ProductEntity();
		productEntity.setProductId(product.getProductId());
		productEntity.setProductName(product.getProductName());
		productEntity.setProductPrice(product.getProductPrice());
		productEntity.setProductCategory(product.getProductCategory());
		productEntity.setCreateOn(product.getCreateOn());

		return productEntity;
	}

	public static ProductModel productEntityToModel(ProductEntity productEntity) {

		ProductModel product = new ProductModel();
		product.setProductId(productEntity.getProductId());
		product.setProductName(productEntity.getProductName());
		product.setProductPrice(productEntity.getProductPrice());
		product.setProductCategory(productEntity.getProductCategory());
		product.setCreateOn(productEntity.getCreateOn());

		return product;
	}
	
	public static List<ProductModel> productEntityToModelList(List<ProductEntity> entityList) {
		
		List<ProductModel> productList = new ArrayList<>();
		
		entityList.forEach(entity -> {
			ProductModel product = new ProductModel();
			product.setProductId(entity.getProductId());
			product.setProductName(entity.getProductName());
			product.setProductPrice(entity.getProductPrice());
			product.setProductCategory(entity.getProductCategory());
			product.setCreateOn(entity.getCreateOn());
			productList.add(product);
		});
		
		return productList;
	}
}

