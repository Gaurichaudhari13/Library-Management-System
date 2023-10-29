package controller;

import service.AdminService;

public class AdminLogin {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();

		boolean flag = adminService.validateAdmin(2, "xyz", 9512364l);
//flag=true or false
		if (flag) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Invalid Credentials");
		}

	}

}
