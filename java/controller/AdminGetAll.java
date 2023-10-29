package controller;

import java.util.List;

import dto.Admin;
import service.AdminService;
public class AdminGetAll {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		List<Admin> admin = adminService. getAllAdmin();
		for (Admin a : admin) {
			System.out.println("===================================");
			System.out.print(a.getId());
			System.out.print(a.getName());
			System.out.print(a.getEmail());
			System.out.println(a.getPassword());
			System.out.println("===================================");

		}
	}

}
