package service;

import java.util.List;

import dao.BookDao;
import dto.Book;

public class BookService {
	BookDao bookDao = new BookDao();

	// save
	public Book saveBook(Book book) {
		book.setStatus("Issue");
		return bookDao.saveBook(book);
	}

	// delete
	public Book deleteBookById(int id) {
		Book book = getBookById(id);
		if (book != null) {
			return bookDao.deleteBookById(id);
		}
		return null;
	}

	// update
	public Book updateBookNameById(int id, String newname) {
		Book book = getBookById(id);
		if (book != null) {
			return bookDao.updateBookNameById(id, newname);
		}
		return null;
	}

	// getbyid

	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	// getall

	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

}
