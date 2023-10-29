package controller;

import service.StudentService;

public class StudentDelete {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		if (studentService.deleteStudentById(3) != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}

}
