package controller;

import dto.Student;
import service.StudentService;

public class StudentInsert {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = new Student();

		student.setName("efg");
		student.setEmail("efg@mail.com");

		studentService.saveStudent(student);
	}
	

}
