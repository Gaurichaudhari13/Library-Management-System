package controller;

import java.util.List;

import dto.Book;
import service.BookService;

public class BookGetAll {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		List<Book> books = bookService.getAllBooks();
		for (Book b : books) {
			System.out.println("==============================");
			System.out.print(b.getId() + " " + "| ");
			System.out.print(b.getName() + " " + "| ");
			System.out.println(b.getStatus() + " " + "| ");
			System.out.println("==============================");

		}
	}

}
