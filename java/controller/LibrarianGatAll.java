package controller;

import java.util.List;

import dto.Librarian;
import service.LibrarianService;

public class LibrarianGatAll {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		List<Librarian> librarians = librarianService.getAllLibrarian();
		for (Librarian l : librarians) {
			System.out.println("===================================");
			System.out.print(l.getId());
			System.out.print(l.getName());
			System.out.print(l.getEmail());
			System.out.println(l.getStatus());
			System.out.println("===================================");

		}
	}

}
