package com.company;

import java.util.Scanner;

public class AP_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,d and n");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		
		int term=a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term=term+d;
		}

	}

}
