package controller;

import dto.Book;
import service.BookService;

public class BookInsert {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book = new Book();
		book.setName("Book5");
		book.setStatus("Issued");
		bookService.saveBook(book);
	}

}
