package com.abc.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ecom.entity.ProductEntity;
import com.abc.ecom.exception.ProductNotFoundException;
import com.abc.ecom.model.Product;
import com.abc.ecom.repository.ProductRepository;
import com.abc.ecom.util.EntityModelUtil;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {		
		
		ProductEntity productEntity = productRepository.save(EntityModelUtil.productModelToEntity(product));
		
		return EntityModelUtil.productEntityToModel(productEntity);
	}

	@Override
	public List<Product> getAllProducts() {
		List<ProductEntity> products = productRepository.findAll();
		
		return EntityModelUtil.productEntityToModelList(products);
	}

	@Override
	public Product getProductById(int productId) throws ProductNotFoundException {
		
		Optional<ProductEntity> optionalProduct = productRepository.findById(productId);
		
		if(optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Sorry! Product is not existing with id: "+productId);
		}
		return EntityModelUtil.productEntityToModel(optionalProduct.get());		
	}

	@Override
	public Product updateProduct(Product product) {
		
		Optional<ProductEntity> optionalProductEntity = productRepository.findById(product.getProductId());
		
		if(optionalProductEntity.isEmpty()) {
			throw new ProductNotFoundException("Sorry! Product is not existing with id: "+product.getProductId());
		}
		
		ProductEntity updatedProductEntity = productRepository.save(EntityModelUtil.productModelToEntity(product));
		
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
	public Product getProductByName(String productName) {
		
		ProductEntity productEntity = productRepository.findByProductName(productName);
		
		return EntityModelUtil.productEntityToModel(productEntity);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		
		List<ProductEntity> productEntityList = productRepository.findProductByCategory(category);
		
		return EntityModelUtil.productEntityToModelList(productEntityList);
	}
	


}
