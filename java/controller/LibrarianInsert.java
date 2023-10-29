package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dto.Librarian;

public class LibrarianInsert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Librarian librarian=new Librarian();
		librarian.setName("mno");
		librarian.setEmail("mno@mail.com");
		librarian.setStatus("Unapproved");
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		System.out.println(librarian.getId()+" entry updated");
	}
	
	
	
}
