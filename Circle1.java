package com.company;

class Circle
{
	public double radius;
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
	}
}

public class Circle1 {

	public static void main(String[] args) {
		Circle C1=new Circle();
		C1.radius=7;
		
		System.out.println("Area of circle : "+C1.area());
		System.out.println("Perimeter of circle : "+C1.perimeter());
		System.out.println("Circumference of circle : "+C1.circumference());

	}
}
