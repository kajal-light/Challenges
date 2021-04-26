package com.kajal.challenges;

import java.util.Scanner;

/*
 * A neon number is a number where the sum of digits of square of the number is equal to the number.
 * Program to find a given input number is neon number or not
*/
public class NeonNumber {

	public static void main(String[] args) {

		int num;

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		num = sc.nextInt();

		int sq = num * num;

	     while (sq != 0) {
	            sum = sum + sq % 10;
	            sq = sq / 10;
	        }
		if (sum == num) {

			System.out.println("yes");
		} else {

			System.out.println("not");
		}
		sc.close();
	}

}
