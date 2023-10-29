package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Admin;

public class AdminUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Admin admin = entityManager.find(Admin.class, 1);
		admin.setName("xyz");
		admin.setPassword(321l);

		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		System.out.println(admin.getId() + "updated");

	}

}
