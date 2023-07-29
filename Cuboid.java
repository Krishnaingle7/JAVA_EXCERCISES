package com.company;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int length,breadth,height;
		int totalArea,volume;
		
		System.out.println("enter length,breadth and height");
		
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalArea=2*(length*breadth+length*height+breadth*height);
		volume=(length*breadth*height);
		
		System.out.println("Area of cuboid is "+totalArea);
		System.out.println("Volume of cuboid is "+volume);

	}

}
