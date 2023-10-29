package controller;

import service.AdminService;

public class ApproveLibrarian {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		boolean res = adminService.approveLibrarianById(7,1);
		System.out.println(res);
	}


}
