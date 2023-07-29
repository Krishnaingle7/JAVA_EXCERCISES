package com.company;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int reverse=0,r;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			reverse=reverse*10+r;
			
		}
		System.out.println(reverse);

	}

}
