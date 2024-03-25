package com.abc.ecom1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.abc.ecom1.entity.Product;
import com.abc.ecom1.exception.ProductNotFoundException;
import com.abc.ecom1.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTest {
	@InjectMocks
	private ProductService productService = new ProductServiceImpl();
	
	@Mock
	private ProductRepository productRepository;
   @Test
   public void testGetProductById() {
	   Product product = new Product();
	   product.setProductId(1);
	   product.setProductName("dummy");
	   product.setProductPrice(11000);
	   product.setProductCategory("dummy");
	   product.setCreatedOn(LocalDate.of(2020,02,02));
	   Optional<Product> op = Optional.of(product);
	   
	   int productId = 1;
	   
	   when(productRepository.findById(1)).thenReturn(op);
	   
	   Product existingProduct = productService.getProductById(productId);
	   
	   assertEquals(product.getProductName(),existingProduct.getProductName());
	   
	   assertEquals(product.getProductId(),existingProduct.getProductId());
      }
   @Test
   public void testGetProductByIdNotPresent() {
	   int productId = 5;
	   when(productRepository.findById(productId)).thenThrow(ProductNotFoundException.class);
	   
	   assertThrows(ProductNotFoundException.class,()->productService.getProductById(productId));
   }
   @Test
   public void deleteProductById() {
      
       int productId = 222;
      
       Product product = new Product();
       product.setProductId(222);
       product.setProductName("dummyname");
       product.setProductPrice(11111);
       product.setCreatedOn(LocalDate.of(2000, 10, 10));
       product.setProductCategory("dummy");
      
       Optional<Product> optionalProduct = Optional.of(product);
      
       when(productRepository.findById(222)).thenReturn(optionalProduct);   
          
       productService.deleteProduct(product.getProductId());
      
       verify(productRepository,times(1)).deleteById(productId);   
      
       //doNothing().when(productRepository).deleteById(product.getProductId());
      
   }
   @Test
   public void testSaveProduct() {
      
       Product product = new Product();
       product.setProductId(10);
       product.setProductName("dummyname");
       product.setProductPrice(11111);
       product.setCreatedOn(LocalDate.of(2000, 10, 10));
       product.setProductCategory("dummy");   
      
       when(productRepository.save(product)).thenReturn(product);
      
       productService.saveProduct(product);
      
       verify(productRepository,times(1)).save(product);       
      
   }
   
}