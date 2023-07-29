package com.company;

import java.util.Scanner;

public class YOUNG_OR_NOT {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
		
		if(age>=14 && age<=55)
		{
			System.out.println("You are young");
		}
		else
		{
			System.out.println("You are old");
		}
			
	}

}
