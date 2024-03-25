package com.abc.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.ecom.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {	
	
	
	public ProductEntity findByProductName(String productName);
	
	@Query("Select p from ProductEntity p where p.productCategory = :pcategory")
	public List<ProductEntity> findProductByCategory(@Param("pcategory") String category);	
	
}
