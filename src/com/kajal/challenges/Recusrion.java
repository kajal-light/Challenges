package com.kajal.challenges;

//Simple example of recursion to print numbers from 10 to 1
public class Recusrion {

	public static void main(String[] args) {
		int a = 10;
		printNumbersTill(a);
	}

	private static void printNumbersTill(int a) {
		if (a > 0) {
			System.out.println(a);
			a--;
			//printNumbersTill(a);
		}
	}
}