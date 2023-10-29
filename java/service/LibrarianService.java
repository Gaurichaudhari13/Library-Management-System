package service;

import java.util.List;

import dao.BookDao;
import dao.LibrarianDao;
import dao.StudentDao;
import dto.Book;
import dto.Librarian;
import dto.Student;

public class LibrarianService {

	LibrarianDao librarianDao = new LibrarianDao();

	BookDao bookDao = new BookDao();
	StudentDao studentDao = new StudentDao();

	public Librarian saveLibrarian(Librarian librarian) {
		return librarianDao.saveLibrarian(librarian);
	}

	public boolean updateById(int id, String name) {
		return librarianDao.updateById(id, name);
	}

	public boolean deleteById(int id) {
		return librarianDao.deleteById(id);
	}

	public Librarian getLibrarianById(int id) {
		return librarianDao.getLibrarianById(id);
	}

	public List<Librarian> getAllLibrarian() {
		return librarianDao.getAllLibrarian();

	}

	public boolean issueBookById(int bookid, int libid, int studid) {
		Book book = bookDao.getBookById(bookid);
		Librarian librarian = librarianDao.getLibrarianById(libid);
		Student student = studentDao.getStudentById(studid);
		if (librarian.getStatus().equalsIgnoreCase("Approved")) {
			if (book != null)

				if (librarian != null && student != null) {
					book.setStatus("Issued");
					book.setStudent(student);
					book.setLibrarian(librarian);

					return bookDao.issue(book);
				}
		}

		return false;
	}

	public boolean returnBookById(int bookid) {
		Book book = bookDao.getBookById(bookid);
		if (book != null && book.getStatus().equals("Issued")) {
			Student student = book.getStudent();
			Librarian librarian = book.getLibrarian();

			if (student != null && librarian != null) {
				book.setStatus("Available");
				book.setStudent(null);
				book.setLibrarian(null);
				return bookDao.returnBook(book);
			}
			return true;
		}
		return false;
	}
}
