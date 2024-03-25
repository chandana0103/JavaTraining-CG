package com.abc.jpademo.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.abc.jpademo.entity.Product;

public class SelectAllProductsMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("***Select All Products******");
		
		Query query1 = em.createQuery("select p from Product p");  
		List<Product> products = query1.getResultList();
		products.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice()+" "+p.getCreatedAt()+" "+p.getCategory()));
		
		
		System.out.println("***Select All Products (using TypedQuery ******");
		
		TypedQuery<Product> query2 = em.createQuery("select p from Product p" , Product.class);		
		List<Product> list  = query2.getResultList();		
		list.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice()+" "+p.getCreatedAt()+" "+p.getCategory()));
		
		System.out.println("***Select products from Mobile category ******");
		
		String categoryInput = "mobile";
		
		TypedQuery<Product> query3 = em.createQuery("select p from Product p where category = :ptype " , Product.class);
		query3.setParameter("ptype", categoryInput);
		
		List<Product> list2  = query3.getResultList();	
		list2.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice()+" "+p.getCreatedAt()+" "+p.getCategory()));
		
		System.out.println("***Select All Products (using Named Qeury******");
		
		TypedQuery<Product> query4 = em.createNamedQuery("fetchAllProducts", Product.class);
		List<Product> list4  = query4.getResultList();		
		list4.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice()+" "+p.getCreatedAt()+" "+p.getCategory()));

		
		em.close();
		emf.close();		
	}

}
