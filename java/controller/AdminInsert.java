package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Admin;



public class AdminInsert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		 Admin  admin=new  Admin();
		 admin.setName("gauri");
		 admin.setEmail("gauri@mail.com");
		 admin.setPassword(1234l);
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		System.out.println(admin.getId()+" entry updated");
	}

}
