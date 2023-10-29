package controller;

import java.util.List;

import dto.Librarian;
import service.AdminService;

public class AdminGetAllUnapprovedLibrarian {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		List<Librarian>librarian=adminService.GetAllUnapprovedLibrarian();
		for(Librarian librarian1:librarian) {
		System.out.println(librarian1.getId());
		System.out.println(librarian1.getName());
		System.out.println(librarian1.getEmail());
		System.out.println(librarian1.getStatus());		
		
		}
	}

}
