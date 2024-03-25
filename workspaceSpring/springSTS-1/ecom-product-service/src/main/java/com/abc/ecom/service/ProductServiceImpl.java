package com.abc.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ecom.entity.ProductEntity;
import com.abc.ecom.exception.ProductNotFoundException;
import com.abc.ecom.model.ProductModel;
import com.abc.ecom.repository.ProductRepository;
import com.abc.ecom.util.EntityModelUtil;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductModel saveProduct(ProductModel productModel) {
		
		ProductEntity productEntity = productRepository.save(EntityModelUtil.productModelToEntity(productModel));
		
		return EntityModelUtil.productEntityToModel(productEntity);
	}

	@Override
	public List<ProductModel> getAllProducts() {
		List<ProductEntity> products = productRepository.findAll();
		
		return EntityModelUtil.productEntityToModelList(products);
	}

	@Override
	public ProductModel getProductById(int productId) throws ProductNotFoundException {
		
		Optional<ProductEntity> optionalProduct = productRepository.findById(productId);
		
		if(optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Sorry! Product is not existing with id: "+productId);
		}
		return EntityModelUtil.productEntityToModel(optionalProduct.get());		
	}

	@Override
	public ProductModel updateProduct(ProductModel productModel) {
		
		Optional<ProductEntity> optionalProductEntity = productRepository.findById(productModel.getProductId());
		
		if(optionalProductEntity.isEmpty()) {
			throw new ProductNotFoundException("Sorry! Product is not existing with id: "+productModel.getProductId());
		}
		
		ProductEntity updatedProductEntity = productRepository.save(EntityModelUtil.productModelToEntity(productModel));
		
		return EntityModelUtil.productEntityToModel(updatedProductEntity);
	}

	@Override
	public void deleteProduct(int productId) {
	
		Optional<ProductEntity> optionalProductEntity = productRepository.findById(productId);
		
		if(optionalProductEntity.isPresent()) {			
			productRepository.deleteById(productId);			
		}
		else {
			throw new ProductNotFoundException("Sorry! Product is not existing with id: "+productId);
		}			
	}

	@Override
	public ProductModel getProductByName(String productName) {
		
		ProductEntity productEntity = productRepository.findByProductName(productName);
		
		return EntityModelUtil.productEntityToModel(productEntity);
	}

	@Override
	public List<ProductModel> getProductsByCategory(String category) {
		
		List<ProductEntity> productEntityList = productRepository.findProductByCategory(category);
		
		return EntityModelUtil.productEntityToModelList(productEntityList);
	}
	


}
