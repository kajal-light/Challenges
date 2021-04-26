package com.kajal.challenges;

import java.util.Scanner;

public class CheckSum {

	// Write a static method checkSum that adds two integer arguments and returns 0,
	// 1 or 2.

	// Takes two integers one and two in its input. Arguments are pass by value to
	// the method.

	// Has a check variable whose value gets updated as explained below.

	// Adds num1 and num2, and checks if their sum is less than 100 in which case
	// Sets the value of the check variable to 0.

	// If sum is greater than 100
	// Sets the value of the check variable to 1.

	// If sum is equal to 100
	// Sets the value of the check variable to 2.
//
	// In the end, it will return the check variable.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1st num");
		int num1 = sc.nextInt();
		System.out.println("enter 2nd num");
		int num2 = sc.nextInt();

		int sum = num1 + num2;

		int check = 0;

		if (sum < 100) {

			check = 0;
		} else if (sum > 100) {

			check = 1;

		} else
			check = 2;
		System.out.println(check);
		sc.close();
	}

}
