package com.abc.jpademo.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Product;

public class UpdateProductDemo {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductId(20);
		product.setProductName("Samsung M30");
		product.setPrice(41000);
		product.setCreatedAt(LocalDate.of(2020, 01, 10));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.merge(product);	
		
		txn.commit();
		
		System.out.println("Product Updated");
		
		em.close();
		emf.close();
		

	}

}
