package com.abc.jpaLab.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpaLab.entity.Author;

public class InsertAuthorMain {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		
		author.setFirstName("chandana");
		author.setMiddleName("potla");
		author.setLastName("palli");
		author.setPhoneNo("9876543222");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(author);
		txn.commit();
		System.out.println("Author saved");
		
		em.clear();
		emf.close();
	}
}