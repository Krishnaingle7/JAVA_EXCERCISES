package com.company;

import java.util.Scanner;

public class ODD_EVEN {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		n = sc.nextInt();
		
	    if(n%2==0)
	    {
	    	System.out.println("Number is even");
	    }
	    else
	    {
	    	System.out.println("Number is odd");
	    }

	}

}
