package com.abc.ecom.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ecom.model.ProductModel;
import com.abc.ecom.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	//private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel product) {
		//logger.debug("");
		ProductModel newProduct = productService.saveProduct(product);
		ResponseEntity<ProductModel> responseEntity = new ResponseEntity<>(newProduct, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping("/all")
	public List<ProductModel> fetchAllProducts() {
		List<ProductModel> products = productService.getAllProducts();
		return products;

	}

	@GetMapping("/get/{pid}")
	public ResponseEntity<?> fetchProductDetails(@PathVariable("pid") int productId) {
		ProductModel product = productService.getProductById(productId);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@GetMapping("/getbyname/{pname}")
	public ResponseEntity<?> fetchProductDetailsByNane(@PathVariable("pname") String pname) {
		ProductModel product = productService.getProductByName(pname);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@GetMapping("/getbycategory/{category}")
	public ResponseEntity<List<ProductModel>> fetchProductDetailsByCategory(@PathVariable("category") String category) {
		List<ProductModel> products = productService.getProductsByCategory(category);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<?> deleteProduct(@PathVariable("pid") int productId) {
		productService.deleteProduct(productId);
		return new ResponseEntity<>("Product Deleted with id: "+productId, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ProductModel> modifyProduct(@RequestBody ProductModel product) {
		ProductModel updatedProduct = productService.updateProduct(product);
		return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	}	

}
