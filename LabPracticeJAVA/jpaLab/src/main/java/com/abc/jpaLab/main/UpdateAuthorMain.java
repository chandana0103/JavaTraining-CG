package com.abc.jpaLab.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.jpaLab.entity.Author;


public class UpdateAuthorMain {
	public static void main(String[] args) 
	{
		Author author = new Author();
		
		author.setAuthorId(3);
		author.setFirstName("nikitha");
		author.setMiddleName("sharma");
		author.setLastName("koma");
		author.setPhoneNo("900009000");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.merge(author);
		txn.commit();
		System.out.println("Author updated");
		
		em.clear();
		emf.close();
	}
}
