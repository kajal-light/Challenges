package com.kajal.challenges;

import java.util.Scanner;

/*A strong number is a special number that can be defined as an addition of factorial of each digit of the number,
 * which is equal to the number itself.
 * To better understand the concept of a strong number, have a look at the below example:

The number 145 is a strong number. This is because if we add the factorials of each digit of this number,
you will get the number, which is 145 itself, as the sum. 1! + 4! + 5! = 1 + 24 + 120 = 145.
*/

public class StrongNumber {

	public static void main(String[] args) {
		
		/*
		 * Let us now have a look at the logic of checking if a number is a strong
		 * number or not in Java. Below is the description of checking if a number is a
		 * strong number or not:
		 * 
		 * 1. Take a user-defined number or a number as an input from the user. Store this
		 * number in a user-defined variable.
		 * 2. Now copy this number to another temporary user-defined variable. This variable will be used
		 * for calculation purposes. You can name the user-defined variable as ‘num’ and the temporary variable as
		 * ‘tempNum’.
		 * 3. Now initialize another variable that will store the sum of
		 * factorial digits. You can name this variable as ‘sum’.
		 * 4. You will also need to find the last digit of the given number ‘num’. Store this result in a
		 * variable that will store the result, say ‘lastDig = num % 10’.
		 * 5. Now you can find the factorial of ‘lastDig’. Now you can store the factorial of this number
		 * and name it as ‘factorial’. 
		 * 6. Once this is done, you can add the factorial to ‘sum’. This can be done by using sum = sum + factorial.
		 * 7. Now you can remove the last digit from ‘num’ as it will not be required any further. 
		 * 8. Now repeat the steps from step 3 to step 6 until the condition num > 0 is satisfied. 
		 * 
		 * You can use a loop for this. It can be used to check the condition of a strong
		 * number. If the condition sum == tempNum is satisfied, then the given number
		 * is a strong number, else it is not.
		 */
		
		
		
		int i, factorial, lastDig;
		int sum = 0;
		int num;
		int tempNum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		num = sc.nextInt();
		tempNum = num;

		while (num != 0) {

			i = 1;
			factorial = 1;
			lastDig = num % 10;
			while (i <= lastDig) {

				factorial = factorial * i;
				i++;

			}
			sum = sum + factorial;
			num = num / 10;
		}
		if (sum == tempNum) {

			System.out.println("the num is strong");
		} else {
			System.out.println("not");
		}
		sc.close();
	}
}
