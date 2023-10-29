package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Admin;
import dto.Librarian;

public class Admindelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Admin admin=entityManager.find(Admin.class,4);
		if(admin!=null) {
			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
			
			}else {
				System.out.println("not deleted");
				
			}
		

}
}
