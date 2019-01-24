package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Details;


public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		/*Details details = new Details();
		
		details.setPackageName("HONDA_SUZUKI_SXZ");
		details.setOrigin("Delhi");
		details.setDestination("Nepal");
		details.setCustomerName("Chandini Chowk"); 
		
		manager.persist(details);
		
		manager.getTransaction().commit();
		System.out.println("Added");*/
		Details details2 = manager.find(Details.class, 1);
		System.out.println("Original Object "+details2);
		
		details2.setDestination("Hyderabad");
		
		manager.merge(details2);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Updated");
		factory.close();
		
	}
}
