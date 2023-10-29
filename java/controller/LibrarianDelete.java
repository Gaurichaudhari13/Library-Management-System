package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Librarian;

public class LibrarianDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Librarian librarian=entityManager.find(Librarian.class,3);
		if(librarian!=null) {
			entityTransaction.begin();
			entityManager.remove(librarian);
			entityTransaction.commit();
			
			}else {
				System.out.println("not deleted");
				
			}
		

}
}