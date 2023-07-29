package com.company;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);

	}

}
