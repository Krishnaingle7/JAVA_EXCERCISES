package com.company;

public class Calculate_Areas {

	static double area(double length,double breadth)
	{
		return length*breadth;
	}
	
	static double area(double radius)
	{
		return (Math.PI*radius*radius);
	}
	static int area(int l)
	{
		return l*l;
	}
	
	public static void main(String[] args) {
		System.out.println("Area of rectangle is "+area(16,10));
		System.out.println("Area of circle is "+area(12));
		System.out.println("Area of square is "+area(10));
	}

}
