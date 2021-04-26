package com.kajal.challenges;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int n = sc.nextInt();
		System.out.print("Enter Symbol : ");

		char c = sc.next().charAt(0);

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n - i; j++)

			{
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) - 1; j++)

			{
				System.out.print(c);
			}
			System.out.println();
		}
		sc.close();
	}

}
