package com.kajal.challenges;

import java.util.Scanner;

/*
 * In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors,
 * excluding the number itself. 
 * For instance, 6 has divisors 1, 2 and 3 (excluding itself),
 * and 1 + 2 + 3 = 6, so 6 is a perfect number.
*/
public class PerfectNumber {

	public static void main(String[] args) {
		int n = 0;
		int temp = 0;
		int i = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		n = sc.nextInt();
		while (n > i) {
			if (n % i == 0) {
				temp = temp + i;
			}
			i++;

		}
		if (temp == n) {
			System.out.println("the num is perfect");
		} else {
			System.out.println("not a perfect number");
		}
		sc.close();
	}

}
