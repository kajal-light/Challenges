package com.kajal.challenges;

import java.util.Scanner;

/*
 * Program to find the sum of all digits of a number

*/
public class SumOfDigits {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the var");

		int var = sc.nextInt();
		int temp = 0;

		while (var != 0) {

			temp += var % 10;

			var = var - var % 10;

			var /= 10;
		}
		System.out.println(temp);
	}

}
