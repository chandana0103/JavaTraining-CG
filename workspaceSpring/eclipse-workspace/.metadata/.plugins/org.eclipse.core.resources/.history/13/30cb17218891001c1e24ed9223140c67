package com.abc.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpademo.entity.Product;

public class DeleteProductMain {

	public static void main(String[] args) {
		
		int productId = 20;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Product product = em.find(Product.class, productId);
		
		if(product !=null) {
			
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			
			em.remove(product);
			
			txn.commit();
			System.out.println("Product deleted");
		}
		else {
			System.out.println("Product not existing with id: "+productId);
		}
		
		em.clear();
		em.close();

	}

}
