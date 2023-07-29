package com.company;

import java.util.Scanner;

public class GP_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,r and n");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int r=sc.nextInt();
		
		int term=a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term=term*r;
		}

	}

}
