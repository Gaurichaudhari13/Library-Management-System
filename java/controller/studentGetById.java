package controller;

import dto.Student;
import service.StudentService;

public class studentGetById {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(1);
		System.out.println("==============================");
		System.out.print(student.getId() + " " + " ");
		System.out.print(student.getName() + " " + " ");
		System.out.println(student.getEmail() + " " + " ");
		System.out.println("==============================");
	}

}
