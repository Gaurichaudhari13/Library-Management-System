package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gauri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// save
	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	// delete
	public Student deleteStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return student;
	}

	public Student updateStudentNameById(int id, String newname) {
		Student student = entityManager.find(Student.class, id);
		student.setName(newname);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}

	// getbyid
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	// getall
	public List<Student> getAllStudents() {
		String sql = "SELECT s FROM Student s";
		Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		return students;
	}

}
