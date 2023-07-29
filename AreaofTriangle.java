package com.company;

import java.util.*;

public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float area,base,height;
		System.out.println("enter base and height");	
		base = sc.nextFloat();
		height = sc.nextFloat();
		
		area=base*height/2;
		
		System.out.println("area of triangle is "+area);

	}

}
