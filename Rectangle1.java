package com.company;

class Rectangle
{
	public double length;
	public double breadth;
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public boolean isSquare()
	{
	    if(length==breadth)
		    return true;
	    else
	    	return false;
	}
}
public class Rectangle1 {

	public static void main(String[] args) {
		Rectangle R1=new Rectangle();
		R1.length=10;
		R1.breadth=10;
		System.out.println("Area of Rectangle is "+R1.area());
		System.out.println("Perimeter of Rectangle is "+R1.perimeter());
		System.out.println("Is it square or not : "+R1.isSquare());
	}

}
