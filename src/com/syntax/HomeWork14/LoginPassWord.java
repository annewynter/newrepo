package com.syntax.HomeWork14;

import java.util.Scanner;

public class LoginPassWord {

	public static void main(String[] args) {

		String password, savedPassword = null, username, confirm;

		System.out.println("Enter the username");
		Scanner scan = new Scanner(System.in);
		username = scan.next();
		System.out.println("Enter the password");
		password = scan.next();

		if (password.equals(username)) {
			System.out.println("Password cannot contain username");
		}

		for (int i = 0; i < password.length(); i++) {

			if (password.length() < 8) {
				System.out.println("Password is too short.Try again");
				password = scan.next();
			} else if (password.equals(username)) {
				System.out.println("Password cannot contain username");
				password = scan.next();
			}
		}
		savedPassword = password;

		System.out.println("please confirm password");

		for (int i = 0; i < password.length(); i++) {

			confirm = scan.next();
			if (confirm.equals(savedPassword)) {
				System.out.println("Your username and password has been created");
			} else {
				System.out.println("Passwords do not match.Try again");
				confirm = scan.next();
				System.out.println("Good job!!!!");
				System.out.println("Your username and password has been created");
				break;
			}
		}
		
	}
}