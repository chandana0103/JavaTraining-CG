package com.abc.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Product;

public class LifeCycleDemo {

	public static void main(String[] args) {
		
        int productId = 1;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Product product = em.find(Product.class, productId);
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		if(product !=null) {
			
			System.out.println("Name: " +product.getProductName());
			System.out.println("Price: " +product.getPrice());
			System.out.println("Created At: " +product.getCreatedAt());
			
			System.out.println("modify the product object");
			
			product.setPrice(76000);
			
			
		}
		else {
			System.out.println("Product not existing with id: "+productId);
		}
		
		txn.commit();
		
		
		em.close();
		
		product.setPrice(116000);
		
		emf.close();

	}

}
