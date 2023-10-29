package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Librarian;

public class LibrarianDao {
	// EntityManagerFactory=for connection
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
//EntityManager=to perform crude operation
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	// to save

	// (Librarian librarian)=we save librarian with object
	public Librarian saveLibrarian(Librarian librarian) {
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		return librarian;
	}

	// to update
	public boolean updateById(int id, String name) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		if (librarian != null) {
			entityTransaction.begin();
			librarian.setName(name);
			entityManager.merge(librarian);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	// to delete
	public boolean deleteById(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		if (librarian != null) {

			entityTransaction.begin();
			entityManager.remove(librarian);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	// get by id
	public Librarian getLibrarianById(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		return librarian;
	}

	// getAll
	public List<Librarian> getAllLibrarian() {
		String sql = "Select l From Librarian l";
		Query query = entityManager.createQuery(sql);
		List<Librarian> librarian = query.getResultList();
		return librarian;
	}

	public boolean approveReject(Librarian librarian) {
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return true;
	}

}