package com.company;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int reverse=0,r;
		int m=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			reverse=reverse*10+r;
			
		}
		if(reverse==m)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
