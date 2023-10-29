package controller;

import dto.Book;
import service.BookService;

public class BookGetById {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book = bookService.getBookById(3);
		System.out.println("==============================");
		System.out.print(book.getId() + " " + "| ");
		System.out.print(book.getName() + " " + "| ");
		System.out.println(book.getStatus() + " " + "| ");
		System.out.println("==============================");

	}

}
