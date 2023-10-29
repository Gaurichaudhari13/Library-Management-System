package controller;

import service.LibrarianService;

public class ReturnBook {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		librarianService.returnBookById(1);
	}


}
