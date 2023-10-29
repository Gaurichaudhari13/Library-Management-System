package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Admin;
import dto.Librarian;

public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// to save
	public Admin saveAdmin(Admin admin) {
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;
	}

	// to update
	public boolean updateById(int id, String name) {
		Admin a = entityManager.find(Admin.class, id);
		if (a != null) {
			entityTransaction.begin();
			a.setName(name);
			entityManager.merge(a);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	// to delete
	public boolean deleteById(int id) {
		Admin a = entityManager.find(Admin.class, id);
		if (a != null) {

			entityTransaction.begin();
			entityManager.remove(a);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	// get by id
	public Admin getAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

	// getAll
	public List<Admin> getAllAdmin() {
		String sql = "Select l From Admin l";
		Query query = entityManager.createQuery(sql);
		List<Admin> admin = query.getResultList();
		return admin;
	}

}
