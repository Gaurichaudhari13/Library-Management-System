package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Librarian;

public class LibrarianUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Librarian librarian = entityManager.find(Librarian.class, 5);
		librarian.setName("gauri");
		librarian.setEmail("gauri@mail.com");

		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		System.out.println(librarian.getId() + "updated");

	}
}
