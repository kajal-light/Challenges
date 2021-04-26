package com.kajal.challenges;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	  int n = 5, k = 0;

		    for (int i = 1; i <= n; ++i, k = 0) {
		      for (int j = 1; j <= n - i; ++j) {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();
		    }
		  }
		
	}
	
	


