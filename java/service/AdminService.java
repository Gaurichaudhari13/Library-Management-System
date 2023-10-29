package service;

import java.util.ArrayList;
import java.util.List;

import dao.AdminDao;
import dao.LibrarianDao;
import dto.Admin;
import dto.Librarian;

public class AdminService {

	AdminDao adminDao = new AdminDao();
	LibrarianService librarianService = new LibrarianService();
	LibrarianDao librarianDao = new LibrarianDao();

	public Admin saveLibrarian(Admin admin) {
		return adminDao.saveAdmin(admin);
	}

	public boolean deleteById(int id) {
		return adminDao.deleteById(id);
	}

	public boolean updateById(int id, String name) {
		return adminDao.updateById(id, name);
	}

	public Admin getAdminById(int id) {
		return adminDao.getAdminById(id);
	}

	public List<Admin> getAllAdmin() {
		return adminDao.getAllAdmin();

	}

	// Unapproved

	public List<Librarian> GetAllUnapprovedLibrarian() {
		List<Librarian> librarian = librarianService.getAllLibrarian();
		ArrayList<Librarian> librarian1 = new ArrayList<Librarian>();
		for (Librarian librarian2 : librarian) {
			if (librarian2.getStatus().equalsIgnoreCase("UnApproved")) {
				librarian1.add(librarian2);

			}
		}
		return librarian1;

	}

	// approved
	public List<Librarian> GetAllApprovedLibrarian() {
		List<Librarian> librarian = librarianService.getAllLibrarian();
		ArrayList<Librarian> librarian1 = new ArrayList<Librarian>();
		for (Librarian librarian2 : librarian) {
			if (librarian2.getStatus().equalsIgnoreCase("Approved")) {
				librarian1.add(librarian2);

			}
		}
		return librarian1;

	}
	// validate

	public boolean validateAdmin(int id, String loginname, Long loginpassword) {
		Admin admin = adminDao.getAdminById(id);
		if (admin.getName().equals(loginname) && admin.getPassword().equals(loginpassword)) {
			return true;
		} else {
			return false;
		}
	}

	// approvelibrarian
	public boolean approveLibrarianById(int libid, int adminid) {
		Librarian librarian = librarianDao.getLibrarianById(libid);

		Admin admin = adminDao.getAdminById(adminid);
		if (librarian != null && admin != null) {
			librarian.setStatus("Approved");
			librarian.setAdmin(admin);
			return librarianDao.approveReject(librarian);
		}
		return false;
	}

	// rejectlibrarian
	public boolean rejectLibrarianById(int libid, int adminid) {
		Librarian librarian = librarianDao.getLibrarianById(libid);
		Admin admin = adminDao.getAdminById(adminid);
		if (librarian != null && admin != null) {
			librarian.setStatus("Rejected");
			librarian.setAdmin(admin);
			return librarianDao.approveReject(librarian);
		}
		return false;
	}

}
