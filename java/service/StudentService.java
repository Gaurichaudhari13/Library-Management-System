package service;

import java.util.List;

import dao.StudentDao;
import dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	// save
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	// delete
	public Student deleteStudentById(int id) {
		Student student = getStudentById(id);
		if (student != null) {
			return studentDao.deleteStudentById(id);
		}
		return null;
	}

	// update
	public Student updateStudentNameById(int id, String newname) {
		Student student = getStudentById(id);
		if (student != null) {
			return studentDao.updateStudentNameById(id, newname);
		}
		return null;
	}

	// getbyid
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	// getall
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

}
