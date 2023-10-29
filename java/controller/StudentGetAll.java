package controller;

import java.util.List;

import dto.Student;
import service.StudentService;

public class StudentGetAll {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		List<Student> students = studentService.getAllStudents();

		for (Student s : students) {
			System.out.println("==============================");
			System.out.print(s.getId() + " " + "| ");
			System.out.print(s.getName() + " " + "| ");
			System.out.println(s.getEmail() + " " + "| ");
			System.out.println("==============================");

		}
	}

}
