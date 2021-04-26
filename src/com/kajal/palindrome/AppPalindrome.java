package com.kajal.palindrome;

import java.util.Scanner;

public class AppPalindrome {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String input = sc.nextLine();

		boolean result = isPalindrome(input);
		System.out.println(result);

	}

	private static boolean isPalindrome(String input) {
		int size = input.length() - 1;
		for (int i = 0; i <= input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(size - i)) {
				return false;
			}
		}
		return true;
	}

}
