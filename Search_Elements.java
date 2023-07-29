package com.company;

import java.util.Scanner;

public class Search_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int A[]= {1,2,3,4,5,6,7,8,9,10};
		int num=sc.nextInt();
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==num)
			{
				System.out.println("Element found at: "+i);
				System.exit(0);
			}
		}
		System.out.println("Not Found");
	}

}
