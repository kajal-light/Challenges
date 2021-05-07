package com.kajal.challenges;

import java.util.Scanner;

//Please enter a password: abc
//Password much have at least 8 characters 
//Please enter a password: abcd1234$
//Password must only contain letter and digits
//Please enter a password: ####
//Password must have at least 8 characters
//password must only contain letters and digits
//Please enter a password: abcd1234
//Password accepted!

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the pasword");
		String password = sc.nextLine();
		char[] passwordArray = password.toCharArray();

		if (passwordChecker(passwordArray)) {
			// if the password is valid, tell the user it's accepted
			System.out.println("Password Accepted");
		} else {
			System.out.println("Password Not Accepted");
			
			
		}

	}

	private static boolean passwordChecker(char[] passwordArray) {

		// Checks to see if password is at least 8 characters.
		if (passwordArray.length < 8) {
			return false;
		}

		int alphabetCount = 0;
		int numCount = 0;
		for (int i = 0; i < passwordArray.length; i++) {

			char ch = passwordArray[i];

			if (isNumeric(ch)) {
				numCount++;
			} else if (isLetter(ch)) {
				alphabetCount++;
			} else {
				return false;
			}
		}
		return (alphabetCount >= 2 && numCount >= 2);

		// Checks each character to see if it is acceptable.

	}

	public static boolean isLetter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}

	public static boolean isNumeric(char ch) {

		return (ch >= '0' && ch <= '9');
	}

}
