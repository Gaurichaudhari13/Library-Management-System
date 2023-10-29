package controller;

import dto.Admin;
import service.AdminService;

public class AdminGetById {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		Admin admin = adminService.getAdminById(2);
		System.out.println("===================================");
		System.out.print(admin.getId());
		System.out.print(admin.getName());
		System.out.print(admin.getEmail());
		System.out.println(admin.getPassword());
		System.out.println("===================================");
	}


}
