package com.abc.jpaLab.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abc.jpaLab.entity.Author;

public class AuthorAllMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Query query1 = em.createQuery("select p from Author p");  
		List<Author> authors = query1.getResultList();
		authors.forEach(p->System.out.println(p.getAuthorId()+" "+p.getFirstName()+" "+p.getMiddleName()+" "+p.getLastName()+" "+p.getPhoneNo()));
	}
}

