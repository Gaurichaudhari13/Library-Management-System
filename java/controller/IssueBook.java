package controller;

import service.LibrarianService;

public class IssueBook {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueBookById(3,7,4);
		System.out.println(res);
	}

}