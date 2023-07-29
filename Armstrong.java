package com.company;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0,r;
		int k=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
		}
		
		if(sum==k)
		{
			System.out.println("its a armstrong number");
		}
		else
		{
			System.out.println("its not a armstrong number");
		}

	}

}
