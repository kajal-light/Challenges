package com.kajal.challenges;

/*
 * Program to find the missing number in an array of sequential numbers

*/
public class MissingNumber {

	public static void main(String[] args) {

		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		System.out.println("Missing number from array arr1: " + missingNumber(arr1));
		int[] arr2 = { 5, 3, 1, 2 };
		System.out.println("Missing number from array arr2: " + missingNumber(arr2));

	}

	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		// finding the sum of positive numbers by mathematical formula
		int sum = n * (n + 1) / 2;

		int restSum = 0;
		// adding all the digits which are present in the given array
		for (int i = 0; i < arr.length; i++) {
			restSum += arr[i];
		}
		// finding the difference between the 2 sums which will give us the missing
		// number
		return sum - restSum;

	}

}
