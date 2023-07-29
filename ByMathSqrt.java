package com.company;

import java.util.Scanner;

public class ByMathSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		float s;
		double area;
		
		System.out.println("enter 3 sides of triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		s=(a+b+c)/2f;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is "+area);
	}

}
