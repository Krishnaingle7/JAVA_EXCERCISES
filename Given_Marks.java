package com.company;

import java.util.Scanner;

public class Given_Marks {

	public static void main(String[] args) {
		int m1,m2,m3;
		float average;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the obatined marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		average = (m1+m2+m3)/3;
		
		if(average>=70)
		{
			System.out.println("Grade A");
		}
		else if(average>=60 && average<70)
		{
			System.out.println("Grade B");
		}
		else if(average>=50 && average<60)
		{
			System.out.println("Grade C");
		}
		else if(average>=40 && average<50)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade E");
		}

	}

}
