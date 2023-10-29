package controller;

import dto.Librarian;
import service.LibrarianService;

public class LibrarianGetById {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		Librarian librarian = librarianService.getLibrarianById(1);
		System.out.println("===================================");
		System.out.print(librarian.getId());
		System.out.print(librarian.getName());
		System.out.print(librarian.getEmail());
		System.out.println(librarian.getStatus());
		System.out.println("===================================");
	}

}
